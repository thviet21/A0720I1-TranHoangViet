let get_Request = document.getElementById("chonBai");

function doSomething() {
    switch (get_Request.value) {
        case '1':
            showArrays();
            break;
        case '2':
            reverseArray();
            break;
        case '3':
            countChar();
            break;
        case '4':
            countChar2();
            break;
        case '5':
            checkArray();
            break;
        case '6':
            swapCharofArrays();
            break;

        default:
            alert("Nhập vào số từ 1-6 thôi :@ !")

    }
}

function showArrays() {
    let arr = [
        [1, 2, 1, 24],
        [8, 11, 9, 4],
        [7, 0, 7, 27],
        [7, 4, 28, 14],
        [3, 10, 26, 7]
    ];
    let result = '';
    for(let i =0; i< arr.length; i++ ){
        result += "row " + i + "\n";
        for(let j =0; j< arr[i].length; j++ ){
            result += arr[i][j] + "\n";
        }
    }
    alert(result)

}
function reverseArray() {
    let arr = [];
    let getLength = parseInt(prompt("Nhập vào độ dài mảng"));
    let i = 0;
    while ( i < getLength){
        arr[i] = prompt("Nhập chuỗi của mảng vị trí thứ: "+ (i+1));
        i++;
    }
    arr.reverse();

    alert("Chuỗi sau khi đảo là: " + arr);
}
//đếm số ký tự số trong mảng
function countChar() {
    let num = Array();
    let index = prompt("Nhập vào độ dài mảng");
    let count = 0;
    let result= " ";
    for(let i =0; i<index; i++) {
        do{
            num[i] = (prompt("Nhập phần tử thứ " + (i + 1)));
        } while (num[i].length > 1);                        // bắt buộc nhập 1 ký tự
    }
    for(let i =0; i<num.length; i++){
        if(!isNaN(num[i])){
            result += num[i] + " ";
            count ++;
        }
    }
    alert("Số ký tự số là: " + count + " bao gồm: " + result);

}
function countChar2() {
    let arr = prompt("Nhập chuỗi của bạn");
    arr = arr.trim();
    let count = 1;
    for(let i =0; i<arr.length; i++){
        if(arr[i] === " " && arr[i+1] !== " "){
            count++;
        }
    }
    if(arr.length === 0) {
        count = 0;
    }
    alert("Chuỗi bạn vừa nhập có : " + count + " từ");

}
function checkArray() {
    let arr1 = prompt("Nhập chuỗi 1: ");
    let arr2 = prompt("Nhập chuỗi 2: ");
    let check = true;
    if (arr1.length !== arr2.length) {
        check = false;
    } else {
        for (let i = 0; i < arr1.length; i++) {
            if (arr1[i] !== arr2[i]) {
                check = false;
                break;
            }
        }
    }
    if (check) {
        alert("Hai chuỗi bạn vừa nhập giống nhau hoàn toàn!");
    } else {
        alert("Hai chuỗi bạn vừa nhập khác nhau! ");
    }
}
function swapCharofArrays() {
    let arr = prompt("Nhập chuỗi của bạn");
    let result = "";
    for(let i =0; i<arr.length; i++){
        if(arr[i] === "-"){
            result += "_";
        }else{
            result += arr[i];
        }
    }
    alert("Chuỗi sau khi sửa : " + result);

}