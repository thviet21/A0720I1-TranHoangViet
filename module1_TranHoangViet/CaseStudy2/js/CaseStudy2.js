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
let discount_Country ;
let discount_RentDay ;
let discount_Cus;
function doSomething() {
    let get_Request = parseInt(prompt("Nhập vào trang bạn muốn chuyển đến!\n" +
        "1.Show Information Booking Room.\n" + "" +
        "2.Edit information Booking Room.\n" + "3.Tổng giá tiền phải trả khi đã giảm giá."));
    switch (get_Request) {
        case 1:
            show_Information();
            break;
        case 2:
            return false;
        // break;
        case 3:
            showTotalPrice();
            break;
        default:
            alert("Bạn vui lòng chọn các chức năng có trong trình đơn ");
    }

}

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
    if (parseInt(get_rentDay.value) > 7){
        discount_RentDay = 30;
    }else if (parseInt(get_rentDay.value)>=5){
        discount_RentDay = 20;
    }else if (parseInt(get_rentDay.value)>=2){
        discount_RentDay = 10;
    }else {
        discount_RentDay = 0;
    }
    //Giảm giá theo loại khách hàng
    switch (get_typeCus.value) {
        case 'Diamond':
            discount_Cus = 15;
            break;
        case 'Platium':
            discount_Cus = 10;
            break;
        case "Gold":
            discount_Cus = 5;
            break;
        case "Silver":
            discount_Cus = 2;
            break;
        default:
            discount_Cus = 0;
    }
    //tính giảm giá
    discount = discount_Country + discount_RentDay + discount_Cus;

    // Tính tổng tiền theo loại Nhà
    if (get_typeHouse.value === "Villa") {
        total_Price = (500 * parseInt(get_rentDay.value)) - discount;
    } else if (get_typeHouse.value === "House") {
        total_Price = (300 * parseInt(get_rentDay.value)) - discount;
    } else {
        total_Price = (100 * parseInt(get_rentDay.value) )- discount;
    }
    // console.log(total_Price);
    let result1 = "<h3>Priced Booking!</h3>" + "<hr color='red'>" +
        "<span class='spanLeft'>Total Price: </span>" + "<span class='spanRight'>" + total_Price + "</span>" + "<br>";
    document.getElementById("result").innerHTML = result1;
}


let show_Information = () => {
    let result = "<h3>Confirm Information Booking!</h3>" + "<hr color='red'>" +
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

    if (get_Name.value.length === 0){
        alert("Vui lòng nhập vào tên:");
    }
    if (get_PP.value.length === 0 || get_PP.value <= 0 || get_PP.value.length > 10 ) {
        alert("Vui lòng nhập vào Passport hoặc không bỏ trống hoặc không quá 10 kí tự!");
    }
    if (get_birthday.value.length === 0){
        alert("Vui lòng nhập vào ngày sinh!");
    }
    if (get_email.value.length === 0){
        alert("Vui lòng nhập vào Email!");
    }
    if (get_addr.value.length === 0 ){
        alert("Vui lòng nhập vào Địa chỉ!");
    }
    if (get_typeCus.value.length === 0){
        alert("Vui lòng chọn loại khách hàng!");
    }
    if (get_amount.value.length === 0 || get_amount.value < 0){
        alert("Vui lòng nhập vào số người lớn hơn 0!");
    }
    if (get_rentDay.value.length === 0 || get_rentDay.value < 0){
        alert("Vui lòng nhập vào số ngày thuê lớn hơn 0!");
    }
    if (get_typeHouse.value.length === 0 ){
        alert("Vui lòng nhập vào loại Nhà muốn thuê!")
    }
    else if (get_typeRoom.value.length === 0) {
        alert("Vui lòng nhập vào loại phòng!");
    }
    else {
        document.getElementById("result").innerHTML = result;
    }
};