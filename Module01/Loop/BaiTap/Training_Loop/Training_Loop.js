let getRequest = document.getElementById("chonBai");
function doSomething() {
    switch (parseInt(getRequest.value)) {
        case 1:
            number1to100();
            break;
        case 2:
            getTemperature();
            break;
        case 3:
            showFibonacci();
            break;
        case 4:
            showFibonacciof5();
            break;
        case 5:
            sum20Fibonacci();
            break;
        case 6:
            sum30of7();
            break;
        case 7:
            number1to100_2();
            break;
        case 8:
            gameNumber();
            break;
        default:
            alert("Nhập số từ 1 - 8 thôi :@");
    }
}
//Bài 1
function number1to100() {
    let i = 0;
    while (i<100){
        if (i === 99){
            alert("Đã Hoàn Thành! " + i);
        }
        i += 1;
    }
}

//Bài 2
function getTemperature() {
    let getTem = parseInt(prompt("Nhập vào nhiệt độ"));

    while (getTem<20 || getTem>100 || isNaN(getTem)){
        alert("Nhập lại Nhiệt độ đi!!");
        getTem = parseInt(prompt("Nhập vào nhiệt độ"));
    }
    alert("Nhiệt độ hiện tại là: " + getTem);
}
//Bài 3
function showFibonacci() {
    let a0 = 0;
    let a1 = 1;
    let temp;
    let result = a0 + ' ' + a1 + ' ';
    let count = 2;
    while (count <= 20) {
        temp = a0 + a1;
        a0 = a1;
        a1 = temp;
        result += temp + " ";
        count++;
    }
    alert(result)
}
//Bài 4
function showFibonacciof5() {
    let a0 = 1;
    let a1 = 1;
    let temp;
    let count = 2;
    while (true) {
        temp = a0 + a1;
        a0 = a1;
        a1 = temp;
        if (temp%5===0){
            alert(temp);
            break;
        }
        count++;
    }
}
//Bài 5
function sum20Fibonacci() {
    let a0 = 1;
    let a1 = 1;
    let temp;
    let result= a0 + a1;
    let count = 2;
    while (count < 20) {
        temp = a0 + a1;
        a0 = a1;
        a1 = temp;
        result += temp;
        count++;
    }
    alert(result);
}
//Bài 6
function sum30of7() {
    let count= 0,sum=0 , i=0;
    while (count < 30){
        if (i%7===0){
            sum += i;
            count++;
        }
        i++;
    }
    alert(sum);
}
//Bài 7
function number1to100_2() {
    let result="";
    let i = 1;
    while (i<=100){
        if ((i%5===0) && (i%3===0)){
            result = result + "FizzBuzz" + " ";
        }
        else if (i%5===0){
            result = result + "Buzz" + " ";
        }
        else if (i%3===0){
            result = result + "Fizz"+ " ";
        }
        else {
            result += i + " ";
        }
        i++;
    }
    alert(result);
}
function gameNumber() {
    //nhập cận dưới
    let numBot = parseFloat(prompt("nhập khoảng bạn muốn đoán:\nNhập cận dưới:"));
    //nhập cận trên
    let numTop = parseFloat(prompt("nhập cận trên:"));
    //random số ngẫu nhiên
    let numRandom = Math.round(Math.random() * (numTop - numBot) + 1);
    //số lựa chọn
    let myNum = parseFloat(prompt("nhập số bạn đoán: "));
    //
    while(myNum != numRandom){
        while(myNum > numRandom){
            myNum = parseFloat(prompt("Lớn quá bạn ơi \n Nhập bé hơn nào:"));
        }
        while(myNum < numRandom){
            myNum = parseFloat(prompt("Bé quá bạn ơi \n Nhập lớn hơn nào:"));
        }
    }
    alert("chuẩn quá bạn ê, chơi xổ số được đó")
}