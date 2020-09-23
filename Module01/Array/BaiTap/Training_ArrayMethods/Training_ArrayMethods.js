let get_Request = document.getElementById("chonBai");

function doSomething() {
    switch (get_Request.value) {
        case '1':
            checkArray();
            break;
        case '2':
            checkMax_and_Index();
            break;
        case '3':
            checkMax_and_Avg();
            break;
        case '4':
            reverseArray();
            break;
        case '5':
            countNegavNumber();
            break;
        case '6':
            checkVinArray();
            break;
        case '7':
            deleteVinArray();
            break;
        case '8':
            sortArray();
            break;
        case '9':
            coalesceArray();
            break;
        default:
            alert("Nhập vào số từ 1-7 thôi :@ !")

    }
}

//1
function checkArray() {
    let array = [1, 3, 4, 7, 9, 30, 320, 4021, 10, 28];
    let count = 0;
    for (let i = 0; i < array.length; i++) {
        if (array[i] >= 10) {
            count += 1;
        }
    }
    alert("Số phần tử lớn hơn hoặc bằng 10 trong Mảng là: " + count);
}

//2
function checkMax_and_Index() {
    let array = [1, 3, 4, 7, 9, 30, 320, 4021, 10, 28];
    let max = array[0];
    for (let i = 0; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
        }
    }
    let position = array.indexOf(max);
    // let value = array[position];
    alert("Phần tử lớn nhất trong mảng là: " + max + " và giá trị trung bình là: " + position);

}

//3
function checkMax_and_Avg() {
    let array = [1, 3, 4, 7, 9, 30, 320, 4021, 10, 28];
    let max = array[0];
    let sum = 0;
    for (let i = 0; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
        }
    }
    for (let i = 0; i < array.length; i++) {
        sum += array[i];
    }
    let avg = sum / array.length;
    //
    // let position = array.indexOf(max);
    // // let value = array[position];
    alert("Phần tử lớn nhất trong mảng là: " + max + " và giá trị trung bình là: " + avg);
}

//4
function reverseArray() {
    let getNumber = parseInt(prompt("Nhập vào số lượng phần tử của mảng"));

    let arr = Array(getNumber);
    for (let i = 0; i < getNumber; i++) {
        arr[i] = parseInt(prompt("Nhập vào phân từ thứ " + (i + 1)));
    }
    arr.reverse();
    alert("Mảng sau khi được đảo lại: " + arr);

}

//5
function countNegavNumber() {
    let getString = prompt("Nhập vào chuỗi có chưa số nguyên âm ở trong tùy thích :@");
    let count = 0;
    for (let i = 0; i < getString.length; i++) {
        if (parseInt(getString[i] + getString[i + 1]) < 0) {
            count++;
        }
    }
    alert("Số phần tử là số nguyên âm trong chuỗi là: " + count);
}

//6
function checkVinArray() {
    let numberV = parseInt(prompt("Nhập vào số muốn tìm trong mảng: "));
    let array1 = [2, 2, 3, 4, 6, 42, 3, 4, 5, 1, 6, 8, 0, 7, 5, 9, 4, 2, 7, 0, 3, 2, 7, 9, 3, 5, 9, 3,];
    let result = array1.includes(numberV);
    // console.log(result);
    if (result) {
        alert("Số " + numberV + " có trong mảng!")
    } else {
        alert("Số " + numberV + " không có trong mảng!");
    }
}

//7
function deleteVinArray() {
    let getNumber = parseInt(prompt("Nhập vào số lượng phần tử của mảng"));
    let arr = Array(getNumber);
    for (let i = 0; i < getNumber; i++) {
        arr[i] = parseInt(prompt("Nhập vào phân từ thứ " + (i + 1)));
    }
    let getV = parseInt(prompt("Nhập vào số muốn xóa trong mảng!"));
    arr = arr.filter(function(item) {
        return item !== getV;
    });
    alert(arr);
}
//8
function sortArray() {
    let getNumber = parseInt(prompt("Nhập vào số lượng phần tử của mảng"));
    let arr = Array(getNumber);
    for (let i = 0; i < arr.length; i++) {
        arr[i] = parseInt(prompt("Nhập vào phân từ thứ " + (i + 1)));
    }
    alert(arr.sort((a,b) =>{return b-a;}))
}
//9
function coalesceArray() {
    let arrC = [];
    let getNumberA = parseInt(prompt("Nhập vào số lượng phần tử của mảng A"));
    let arrA = Array(getNumberA);
    for (let i = 0; i < arrA.length; i++) {
        arrA[i] = parseInt(prompt("Nhập vào phân từ thứ " + (i + 1) + " của mảng A"));
    }
    let getNumberB = parseInt(prompt("Nhập vào số lượng phần tử của mảng B"));
    let arrB = Array(getNumberB);
    for (let i = 0; i < arrB.length; i++) {
        arrB[i] = parseInt(prompt("Nhập vào phân từ thứ " + (i + 1)+ " của mảng B"));
    }
    arrC = arrA.concat(arrB);
    alert(arrC);
}