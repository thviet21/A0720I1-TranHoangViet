let getRequest = parseInt(prompt("Nhập vào bài tập muốn thực hiện"));
let result;
let result2;
let getNumber;
let array = [];
let getString;
let sum = 0 ;

switch (getRequest) {
    case 1:
        let getFloor = parseInt(prompt("Nhập vào độ cao của tháp"));
        showTower(getFloor);
        break;
    case 2:
        let getMonth = parseInt(prompt("Nhập vào tháng"));
        let getYear = parseInt(prompt("Nhập vào năm"));
        let date = new Date(getMonth + "/" + getYear);
        console.log(date);
        break;
    case 3:
        getNumber = parseInt(prompt("Nhập n"));
        result = caculate1(getNumber);
        alert("Sau khi tính toán thì kết quả là: " + result);
        break;
    case 4:
        getNumber = parseInt(prompt("Nhập n"));
        result = caculate2(getNumber);
        alert("Sau khi tính toán thì kết quả là: " + result);
        break;
    case 5:
        getNumber = parseInt(prompt("Nhập n"));
        result = caculate3(getNumber);
        alert("Sau khi tính toán thì kết quả là: " + result);
        break;
    case 6:
        getNumber = parseInt(prompt("Nhập n"));
        if (getNumber % 2 === 0) {
            result = caculateOdd(getNumber);
            alert("Sau khi tính toán thì kết quả là: " + result);
        } else {
            result = caculateEven(getNumber);
            alert("Sau khi tính toán thì kết quả là: " + result);
        }
        break;
    case 7:
        getNumber = parseInt(prompt("Nhập vào số bất kì!"));
        if (isNaN(getNumber)) {
            alert("Nhập vào số đừng nhập vào chữ!");
            getNumber = parseInt(prompt("Nhập vào số bất kì!"));
        } else {
            result = caculate4(getNumber);
            result2 = caculate5(getNumber);
            alert("Sau khi tính toán thì kết quả của phép cộng là: " + result);
            alert("Sau khi tính toán thì kết quả của phép nhân là: " + result2);

        }
        break;
    case 8:
        getA = parseInt(prompt("Nhập vào a:"));
        getB = parseInt(prompt("Nhập vào b:"));
        result = uCLN(getA, getB);
        document.writeln("UCLN :" + result + "<br>");
        result = bCNN(getA, getB);
        document.writeln("BCNN : " + result);
        break;
    case 9:
        getString = prompt("Nhập vào chuỗi thôi guys! ");
        getString.trim();
        reverseString(getString);
        document.writeln("Chuổi khi được chuyển thành viết thường : " + getString.toLowerCase() + "<br>");
        document.writeln("Chuổi khi được chuyển thành viết hoa : " + getString.toUpperCase() + "<br>");
        result = toUpCaseForLowerCase(getString);
        document.writeln("Chuổi khi được biến đổi: " + result);
        break;
    case 10:
         getString = prompt("Nhập vào chuỗi thôi guys! ");
         displayCharEverySingleLine(getString);
         countString(getString);break;
    case 11:
        getNumber = parseInt(prompt("Nhập vào số phần tử của Mảng!"));
        for (let i = 0; i < getNumber; i++) {
            array[i] = parseInt(prompt("Nhập vào phần tử thứ "+ (i+1) +"! "));
        }
        for (let i = 0; i < array.length; i++) {
            if (!(array[i] % 2 === 0)){
                sum += array[i];
            }
        }
        alert("Tổng số lẻ trong mảng!: " + sum);
}

function showTower(number) {
    for (let i = 0; i < number; i++) {
        document.writeln("*****" + "<br>");
    }
}

function caculate1(number) {
    let temp = 0;
    for (let i = 1; i < number; i++) {
        temp += 1 / i;
    }
    return temp;
}

function caculate2(number) {
    let sum = 15;
    let temp = 0;
    for (let i = 1; i < number; i++) {
        temp += 1 / (-1) ^ i / i;
    }
    return sum - temp;
}

function caculate3(number) {
    let temp = 0;
    for (let i = 1; i < number; i++) {
        temp += 1 / (2 * i - 1);
    }
    return temp;
}

function caculateOdd(number) {
    let result = 1;
    for (let i = 2; i <= number; i += 2) {
        result *= i;
    }
    return result;
}

function caculateEven(number) {
    let result = 1;
    for (let i = 1; i <= number; i += 2) {
        result *= i;
    }
    return result;
}

function caculate4(number) {
    let Sum = 0;
    let temp = number.toString();
    let arr = [];
    for (let i = 0; i < temp.length; i++) {
        arr.push(temp.charAt(i));
    }
    for (let i = 0; i < arr.length; i++) {
        Sum += parseInt(arr[i]);
    }
    return Sum;
}

function caculate5(number) {
    let Multiple = 1;
    let temp = number.toString();
    let arr = [];
    for (let i = 0; i < temp.length; i++) {
        arr.push(temp.charAt(i));
    }
    for (let i = 0; i < arr.length; i++) {
        Multiple *= parseInt(arr[i]);
    }
    return Multiple;
}

function uCLN(a, b) {
    while (a !== b) {
        if (a > b)
            a = a - b;
        else
            b = b - a;
    }

    return a; // or return b; a = b
}

function bCNN(a, b) {
    let result = uCLN(a, b);
    return a * b / result;
}

function reverseString(string) {

    for (let i = 0; i < string.length; i++) {
        array[i] = string.charAt(i);
    }
    array.reverse();
    let result = array.join("");
    document.writeln("Chuổi sau khi đảo ngược: " + result + "<br>");
}

function toUpCaseForLowerCase(str1) {
    let UPPER = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
    let LOWER = 'abcdefghijklmnopqrstuvwxyz';
    let result1 = [];

    for (let x = 0; x < str1.length; x++) {
        if (UPPER.indexOf(str1[x]) !== -1) {
            result1.push(str1[x].toLowerCase());
        } else if (LOWER.indexOf(str1[x]) !== -1) {
            result1.push(str1[x].toUpperCase());
        } else {
            result1.push(str1[x]);
        }
    }
    return result1.join('');
}
function displayCharEverySingleLine(str1) {
    str1.trim();
    for (let i = 0; i < str1.length; i++) {
        document.writeln(str1.charAt(i) + "<br>")
    }
}
function countString(str1) {
    str1 = str1.trim();
    let count = 1;
    for(let i =0; i<str1.length; i++){
        if(str1[i] === " " && str1[i+1] !== " "){
            count++;
        }
    }
    if(str1.length === 0) {
        count = 0;
    }
    alert("Chuỗi bạn vừa nhập có : " + count + " từ");
}
