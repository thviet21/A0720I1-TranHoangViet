function checkDayofMonth(){
    let inputMonth = parseInt(document.getElementById("inputMonth").value);
    switch (inputMonth) {
        case 1:
            document.write("Tháng " + inputMonth + " có 31 ngày!");
            break;
        case 2:
            document.write("Tháng " + inputMonth + " có 28 hoặc 29 ngày!");
            break;
        case 3:
            document.write("Tháng " + inputMonth + " có 31 ngày!");
            break;
        case 4:
            document.write("Tháng " + inputMonth + " có 30 ngày!");
            break;
        case 5:
            document.write("Tháng " + inputMonth + " có 31 ngày!");
            break;
        case 6:
            document.write("Tháng " + inputMonth + " có 30 ngày!");
            break;
        case 7:
            document.write("Tháng " + inputMonth + " có 31 ngày!");
            break;
        case 8:
            document.write("Tháng " + inputMonth + " có 31 ngày!");
            break;
        case 9:
            document.write("Tháng " + inputMonth + " có 30 ngày!");
            break;
        case 10:
            document.write("Tháng " + inputMonth + " có 31 ngày!");
            break;
        case 11:
            document.write("Tháng " + inputMonth + " có 30 ngày!");
            break;
        case 12:
            document.write("Tháng " + inputMonth + " có 31 ngày!");
        default:
            document.write("Vui lòng nhập vào số từ 1-12!!");
    }
}
