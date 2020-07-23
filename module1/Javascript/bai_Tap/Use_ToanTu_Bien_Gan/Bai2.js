let inputDoC;
let doC,doF;
do{
    inputDoC = prompt("Nhập vào độ C")
    doC = parseInt(inputDoC);
    doF = (doC*1.8) + 32;
}while (doC<0)

document.write("Độ F: "+doF);