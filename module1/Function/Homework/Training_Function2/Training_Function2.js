let getRequest = document.getElementById("chonBai");
let result;
let name;
let num;
let radius;
let charact;
let arrNum = [];
let arr = [];
let count;
function doSomething() {
    switch (parseInt(getRequest.value)) {
        case 1:
            do {
                num = prompt("Nhập số cần tính bình phương: ")
            } while (isNaN(num));
            alert("Bình phương của " + num + " là: " + calculateSquare(num));
            break;
        case 2:
            do {
                radius = prompt("Nhập bán kính hình tròn: ")
            } while (isNaN(radius));
            alert("Chu vi của hình tròn = " + calculatePerimeter(radius) + "\nDiện tích của hình tròn = " + calculateArea(radius));

            break;
        case 3:
            do {
                num = parseFloat(prompt("Nhập số nguyên cần tính giai thừa: "));
            } while (!Number.isInteger(num));
            alert("Giai thừa của " + num + " = " + calculFactorials(num));

            break;
        case 4:
            alert(check());
            break;
        case 5:
            minNumber();
            break;
        case 6:
            checkNumber();
            break;
        case 7:
            for (let i = 0; i < 2; i++) {
                do {
                    arrNum[i] = parseFloat(prompt("Nhập số nguyên thứ " + (i + 1)));
                } while (!Number.isInteger(arrNum[i]));
            }
            swap(arrNum);
            alert("Sau khi đổi chỗ: " + arrNum);
            break;
        case 8:
             count = parseInt(prompt("Nhập số lượng phần tử bạn muốn nhập vào: "));
            for (let i = 0; i < count; i++) {
                arr[i] = parseInt(prompt("Nhập phần tử thứ " + (i + 1) + ": "));
            }
            alert("Mảng vừa nhập vào: " + arr);
            reverseArr(arr);
            alert("Mảng sao khi đảo ngược: " + arr);
            break;
        case 9:
            let arrString = prompt("Nhập chuỗi ks tự của bạn");
            let char = prompt("Nhập ký tự muốn kiểm tra");
            count = checkChar(arrString, char);
            if (count > 0) {
                alert("Số lần xuất hiện là: " + count);
            } else {
                alert(count);
            }
            break;
        default:
            alert("Nhập số từ 1 - 9 thôi :@");
    }
}

function calculateSquare(num) {
    return num * num;
}

//bai2
function calculateArea(radius) {
    const PI = 3.1459;
    return PI * calculateSquare(radius);
}

function calculatePerimeter(radius) {
    const PI = 3.1459;
    return 2 * PI * radius;

}



//bai3
//hàm tính giai thừa
function calculFactorials(num) {
    if (num <= 2) return num;
    return num * calculFactorials(num - 1);
}


//bai4
function check() {
    do {
        charact = prompt("Nhập ký tự cần kiểm tra(1 lý tự thôi nha): ");
    } while (charact.length !== 1);
    if (!isNaN(charact)) {
        return true;
    } else {
        return false;
    }
}

//bai5
function minNumber() {
    let arrNum = [];
    for (let i = 0; i < 3; i++) {
        do {
            arrNum[i] = parseFloat(prompt("Nhập số nguyên thứ " + (i + 1)));
        } while (!Number.isInteger(arrNum[i]));
    }
    let min = arrNum[0];
    for (let i = 0; i < 3; i++) {
        if (arrNum[i] < min) {
            min = arrNum[i];
        }
    }
    alert("min = " + min);
    return 0;

}

//bai6
function checkNumber() {
    let charact;
    charact = prompt("nhập vào ký tự cần kiểm tra: ");
    if (Number.isInteger(parseFloat(charact)) && parseFloat(charact) > 0) {
        alert(true)
    } else {
        alert(false)
    }
}



//bai7
function swap(arr) {
    for (let i = 0; i < 1; i++) {
        let temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }
    return arr;

}



//bai8
function reverseArr(arr) {
    let i = 0;
    let j = arr.length;
    while (i < j) {
        let temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    return arr;
}



// bài 9
function checkChar(arr, char) {
    let count = 0;
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === char) {
            count++
        }
    }
    if (count > 0) {
        return count;
    } else {
        return -1;
    }

}

