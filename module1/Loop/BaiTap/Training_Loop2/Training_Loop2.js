let getRequest = document.getElementById("chonBai");
function doSomething() {
    switch (parseInt(getRequest.value)) {
        case 1:
            showFibonacci();
            break;
        case 2:
            factorialNumber();
            break;
        case 3:
            showTriangle();
            break;
        case 4:
            showRectangle();
            break;
        case 5:
            rateBank();
            break;
        case 6:
            showHeart();
            break;
        default:
            alert("Nhập số từ 1 - 6 thôi :@");
    }
}
//Bài 1
function showFibonacci() {
    let a0 = 0;
    let a1 = 1;
    let temp;
    let result = a0 + ' ' + a1 + ' ';
    let count = 2;
    while (count <= 1000) {
        temp = a0 + a1;
        a0 = a1;
        a1 = temp;
        result += temp + " ";
        count++;
    }
    alert(result)
}

//Bài 2
function factorialNumber() {
    let dem=1;
    let getNumber = parseInt(prompt("Nhập vào số muốn giai thừa dừng lại!"));
    let result = 1;
    if(getNumber<0 || getNumber>1000 || isNaN(getNumber)) {
        alert("Nhập lại số lớn hơn 0 or bé hơn 1000 thôi nha! :D");
    }
    else {
        while (dem <= getNumber){
            result *= dem;
            dem++;
        }

    }
    alert("Giá trị của giai thừa là: " + result);
}
//Bài 3
function showTriangle() {
    let result = "";
    let result1="";
    for (let i = 1; i <= 5; i++) {
        for (let j = 1; j <= 5; j++) {
            if (j <= i){
                result += '*';
            }
            else {
                result += '&nbsp;';
            }
        }
        result += "<br>";
    }
    document.getElementById("result").innerHTML = result;
    for (let i = 5; i >= 1; i--) {
        for (let j = 5; j >= 1; j--) {
            if (j <= i){
                result1 += '*';
            }
            else {
                result1 += '&nbsp;' ;
            }
        }
        result1 += "<br>";
    }
    // console.log(result1);
    document.getElementById("result1").innerHTML = result1;
    let result2="";
    for (let i = 1;i <= 5; i++) {
        for (let j = 5 ;j >= 1; j--) {
            if (j <= i){
                result2 += '*';
            }
            else {
                result2 += '&nbsp;' ;
            }
        }
        result2 += "<br>";
    }
    document.getElementById("result2").innerHTML = result2;
    let result3="";
    for (let i = 1; i <= 5; i++) {
        for (let j = 1 ; j <= 5; j++) {
            if (j >= i){
                result3 += '*';
            }
            else {
                result3 += '&nbsp;' ;
            }
        }
        result3 += "<br>";
    }
    // console.log(result3);
    document.getElementById("result3").innerHTML = result3;
}
//Bài 4
function showRectangle() {
    let result='';
    for (let i = 0; i < 8; i++) {
        for (let j = 0; j < 25; j++) {
            if (i===0 || i===7  && j < 25){
                result += '*';
            }
            else if(j===0 || j===24 ){
                result += "*"
            }
            else {
                result += " " +'&nbsp;';
            }


        }
        result += "<br>";
    }
    console.log(result);
    document.getElementById("totalresult").innerHTML = result;
}
//Bài 5
function rateBank() {
    let get_Money = parseInt(prompt("Nhập vào số tiền muốn vay:", ""));
    let get_Month = parseInt(prompt("Nhập vào số tháng muốn vay:", ""));
    // let total;
    if (get_Money <= 0 || isNaN(get_Money) || get_Month <= 0 || isNaN(get_Month)){
        alert("Nhập vào số tiền và số tháng muốn vay lớn hơn 0!");
    }
    else {
        for(let i = 0; i < get_Month; i++)
        {
            get_Money = get_Money + get_Money * 0.3 / 100;
        }
        alert("Số tiền phải trả sau: " + get_Month + " tháng là: " + Math.ceil(get_Money) );
    }
}
//Bài 6
function showHeart() {
    let result= "";
    for(let i = 1; i < 7; i++) {
        for(let j = 1; j <= 7; j++) {
            if(!((i === 1 && (j === 1 || j === 4 || j === 7))
                || (i === 4 && (j === 1 || j === 7))
                || (i === 5 && (j <= 2 || j >= 6))
                || (i === 6 && (j <= 3 || j >= 5)))) {
                result+=" * ";
            } else {
                result+='&nbsp;'+"   ";
            }
        }
        result += "<br>";
    }
    document.getElementById("bai6").innerHTML = result;
}
