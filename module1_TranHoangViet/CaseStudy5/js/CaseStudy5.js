let get_Name = document.getElementById("nameCustomer");
let get_PP = document.getElementById("passportID");
let get_birthday = document.getElementById("birthday");
let get_email = document.getElementById("email");
let get_addr = document.getElementById("address");
let get_country = document.getElementById("country");
let get_typeCus = document.getElementById("typeCustomer");
let get_discount = document.getElementById("discount");
let get_amount = document.getElementById("amount");
let get_rentDay = document.getElementById("rentDay");
let get_typeHouse = document.getElementById("typeHouse");
let get_typeRoom = document.getElementById("typeRoom");
let total_Price = 0;
let discount = 0;
let discount_Country;
let discount_RentDay;
let discount_Cus;
let arrayCustomer = [];
let result;
let resultCus = {};
let getRequest;
let get_Request;
function doSomething() {
    get_Request = parseInt(prompt("Nhập vào trang bạn muốn chuyển đến!\n" +
        "1.Add Information Booking Room.\n" +
        "2.Show Information Booking Room.\n" +
        "3.Edit Information Booking Room.\n" +
        "4.Delete Information Booking Room.\n" +
        "5.Exit."));
    switch (get_Request) {
        case 1:
            addNewCustomer();
            doSomething();
            break;
        case 2:
            show_Information();
            break;
        case 3:
            break;
        case 4:
            for (let i = 0; i < arrayCustomer.length; i++) {
                alert("Thông tin khách hàng thứ " + (i+1) +"\n" + arrayCustomer[i]);
            }
            get_Request = parseInt(prompt("Nhập vào ID của khách hàng muốn xóa"));
            deleteCustomer(get_Request);
            alert("Danh sách khách hàng sau khi xóa");
            for (let i = 0; i < arrayCustomer.length; i++) {
                alert("Thông tin khách hàng thứ " + (i+1) +"\n" + arrayCustomer[i]);
            }
            break;
        case 5:
            break;
        default:
            alert("Bạn vui lòng chọn các chức năng có trong trình đơn ");
    }

}
let deleteCustomer = (index) =>{
    arrayCustomer.splice(index-1 , index);
};
let addNewCustomer = () => {
    resultCus = [
        "Customer Name: "+ get_Name.value,
        "Passport ID: "+ get_PP.value,
        "Birthday: "+ get_birthday.value,
        "Email: "+ get_email.value,
        "Address: " + get_addr.value,
        "Country: " +get_country.value,
        "Type Customer: " + get_typeCus.value,
        "Discount: " + get_discount.value,
        "Amout Customer: "+ get_amount.value,
        "Rent Day: " +  get_rentDay.value,
        "Type House: "+  get_typeHouse.value,
        "Type Room: " + get_typeRoom.value
    ];

    changName();
    if (checkValidate()){
        arrayCustomer.push(resultCus);
        alert("Thêm khách hàng thành công");
    }

    doSomething();
};
let showTotalPrice = () => {
    // Giảm giá theo địa phương
    switch (get_country.value) {
        case 'Da Nang':
            discount_Country = 20;
            break;
        case 'Hue':
            discount_Country = 10;
            break;
        case "Quang Nam":
            discount_Country = 5;
            break;
        default:
            discount_Country = 0;
    }
    // Giảm giá theo số ngày thuê
    if (parseInt(get_rentDay.value) > 7) {
        discount_RentDay = 30;
    } else if (parseInt(get_rentDay.value) >= 5) {
        discount_RentDay = 20;
    } else if (parseInt(get_rentDay.value) >= 2) {
        discount_RentDay = 10;
    } else {
        discount_RentDay = 0;
    }
    //Giảm giá theo loại khách hàng
    switch (get_typeCus.value) {
        case 'Diamond':
            discount_Cus = 15;
            break;
        case 'Platium':
            discount_Country = 10;
            break;
        case "Gold":
            discount_Country = 5;
            break;
        case "Silver":
            discount_Country = 2;
            break;
        default:
            discount_Country = 0;
    }
    //tính giảm giá
    discount = discount_Country + discount_RentDay + discount_Cus;

    // Tính tổng tiền theo loại Nhà
    if (get_typeHouse.value === "Villa") {
        total_Price = (500 * parseInt(get_rentDay.value)) - discount;
    } else if (get_typeHouse.value === "House") {
        total_Price = (300 * parseInt(get_rentDay.value)) - discount;
    } else {
        total_Price = (100 * parseInt(get_rentDay.value)) - discount;
    }
    let result1 = "<h3>Priced Booking!</h3>" + "<hr color='red'>" +
        "<span class='spanLeft'>Total Price: </span>" + "<span class='spanRight'>" + total_Price + "</span>" + "<br>";
    document.getElementById("result").innerHTML = result1;
};

function changName() {
    let tempName = "";
    get_Name.value = get_Name.value.trim().toLowerCase();
    for (let i = 0; i < get_Name.value.length; i++) {
        if (get_Name.value.charAt(i) === " " && get_Name.value.charAt(i + 1) === " ") {
            continue;
        }
        if (i === 0 || get_Name.value.charAt(i - 1) === " ") {
            tempName += get_Name.value.charAt(i).toUpperCase();
            continue;
        }
        tempName += get_Name.value.charAt(i)
    }
    return get_Name.value = tempName;
}

let show_Information = () => {
    changName();
    result = "<h3>Confirm Information Booking!</h3>" + "<hr color='red'>" +
        "<span class='spanLeft'>Full name: </span>" + "<span class='spanRight'>" + get_Name.value + "</span>" + "<br>"
        + "<span class='spanLeft'>PassportID: </span>" + "<span class='spanRight'>" + get_PP.value + "</span>" + "<br>"
        + "<span class='spanLeft'>Birthday: </span>" + "<span class='spanRight'>" + get_birthday.value + "</span>" + "<br>"
        + "<span class='spanLeft'>Email: </span>" + "<span class='spanRight'>" + get_email.value + "</span>" + "<br>"
        + "<span class='spanLeft'>Address:  </span>" + "<span class='spanRight'> " + get_addr.value + "</span>" + "<br>"
        + "<span class='spanLeft'>Country:  </span>" + "<span class='spanRight'> " + get_country.value + "</span>" + "<br>"
        + "<span class='spanLeft'>Type of Customer:  </span>" + "<span class='spanRight'> " + get_typeCus.value + "</span>" + "<br>"
        + "<span class='spanLeft'>Discount: </span>" + "<span class='spanRight'> " + get_discount.value + "</span>" + "<br>"
        + "<span class='spanLeft'>Amout: </span>" + "<span class='spanRight'> " + get_amount.value + "</span>" + "<br>"
        + "<span class='spanLeft'>Rent Days: </span>" + "<span class='spanRight'> " + get_rentDay.value + "</span>" + "<br>"
        + "<span class='spanLeft'>Type of House: </span>" + "<span class='spanRight'> " + get_typeHouse.value + "</span>" + "<br>"
        + "<span class='spanLeft'>Type of Room:  </span>" + "<span class='spanRight'> " + get_typeRoom.value + "</span>" + "<br>";
    if (checkValidate()){
        document.getElementById("result").innerHTML = result;
    }
};

function checkValidate() {
    if (get_Name.value.length === 0) {
        alert("Vui lòng nhập vào tên:");
        return false;
    }
    if (get_PP.value.length === 0 || get_PP.value <= 0 || get_PP.value.length > 10) {
        alert("Vui lòng nhập vào Passport hoặc không bỏ trống hoặc không quá 10 kí tự!");
        return false;
    }

    if (get_birthday.value === "") {
        alert("Vui lòng nhập vào Ngày sinh!");
        return false;
    }
    let filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (get_email.value === "") {
        alert("Vui lòng nhập vào Email");
        return false;
    } else if (!filter.test(get_email.value)) {
        alert("Email: Không đúng định dạng abc@def.xyz");
        return false;
    }
    if (get_addr.value.length === 0) {
        alert("Vui lòng nhập vào Địa chỉ!");
        return false;
    }
    if (get_typeCus.value.length === 0) {
        alert("Vui lòng chọn loại khách hàng!");
        return false;
    }
    if (get_amount.value.length === 0 || get_amount.value < 0) {
        alert("Vui lòng nhập vào số người lớn hơn 0!");
        return false;
    }
    if (get_rentDay.value.length === 0 || get_rentDay.value < 0) {
        alert("Vui lòng nhập vào số ngày thuê lớn hơn 0!");
        return false;
    }
    if (get_typeHouse.value.length === 0) {
        alert("Vui lòng nhập vào loại Nhà muốn thuê!");
        return false;
    }
    if (get_typeRoom.value.length === 0) {
        alert("Vui lòng nhập vào loại phòng!");
        return false;
    }
    return true;
}
