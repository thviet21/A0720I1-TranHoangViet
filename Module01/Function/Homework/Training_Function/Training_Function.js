let getRequest = document.getElementById("chonBai");
let getNumber;
let getNumber1;
let result;
let name;
let array = ["Polaris", "Aldebaran", "Deneb", "Vega", "Altair", "Dubhe" ," Regulus"];
let array2 = ["Ursa Minor", "Tarurus", "Cygnus", "Lyra", "Aquila", "Ursa Major" , "Leo"];
function doSomething() {
    switch (parseInt(getRequest.value)) {
        case 1:
            alertMessenger();
            break;
        case 2:
            getNumber = parseInt(prompt("Nhập vô số!"));
            result = numberPlus1(getNumber);
            alert(result);
            break;
        case 3:
            getNumber = parseInt(prompt("Nhập vô số thứ nhất!"));
            getNumber1 = parseInt(prompt("Nhập vô số thứ 2!"));
            if (getNumber > getNumber1) {
                alert("Số thứ nhất lớn hơn số thứ 2");
            } else {
                result = sum(getNumber, getNumber1);
                alert(result);
            }
            break;
        case 4:
            result = 0;
            alert(result);
            function addNumbers() {
                let firstNum = 4;
                let secondNum = 8;
                result = firstNum + secondNum;
                return result;
            }
            result = addNumbers();
            alert(result);
            break;
        case 5:
            name = prompt("Nhập vào tên chòm sao");
            result = checkConstellation(name);
            alert(result);
            break;
        default:
            alert("Nhập số từ 1 - 8 thôi :@");
    }
}

//Bài 1
function alertMessenger() {
    alert("Xin chào");
}

//Bài 2
function numberPlus1(number) {
    number += 1;
    return number;
}

//Bài 3
function sum(a, b) {
    return sum = a + b;
}



//Bài 5
function checkConstellation(name) {
    let getIndex = array.indexOf(name);
    return result = array2[getIndex];
}
