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

    if (get_typeHouse.value === "Villa") {
        total_Price = 500 * parseInt(get_rentDay.value) * (1- get_discount.value);
    } else if (get_typeHouse.value === "House") {
        total_Price = 300 * parseInt(get_rentDay.value) *  (1- get_discount.value);
    } else {
        total_Price = 100 * parseInt(get_rentDay.value) *  (1- get_discount.value);
    }
    result +="<span class='spanLeft'>Total Price: </span>" + "<span class='spanRight'>" + total_Price + "</span>" + "<br>";
    if (get_Name.value.length === 0 || get_PP.value.length === 0 || get_birthday.value.length === 0 || get_email.value.length === 0 ||
        get_addr.value.length === 0 || get_typeCus.value.length === 0 || get_amount.value.length === 0 || get_rentDay.value.length === 0 ||
        get_typeHouse.value.length === 0 || get_typeRoom.value.length === 0) {
        alert("Vui lòng nhập lại thông tin đầy đủ ạ!");
        return false;
    } else {
        document.getElementById("result").innerHTML = result;
    }
};