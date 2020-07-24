document.getElementById("Cong").addEventListener("click",Cong);
document.getElementById("Tru").addEventListener("click",Tru);
document.getElementById("Nhan").addEventListener("click",Nhan);
document.getElementById("Chia").addEventListener("click",Chia);
function Cong() {
    let getA = document.getElementById("soA");
    let getB = document.getElementById("soB");
    let sumAB ;
    sumAB = parseFloat(getA.value) + parseFloat(getB.value) ;
    document.getElementById("result").innerHTML = sumAB;
}

function Tru() {
    let getA = document.getElementById("soA");
    let getB = document.getElementById("soB");
    let subAB;
    subAB = parseFloat(getA.value) + parseFloat(getB.value) ;
    document.getElementById("result").innerHTML = subAB;

}
function Nhan() {
    let getA = document.getElementById("soA");
    let getB = document.getElementById("soB");
    let nhanAB ;
        nhanAB= parseFloat(getA.value) + parseFloat(getB.value) ;
    document.getElementById("result").innerHTML = nhanAB;

}
function Chia() {
    let getA = document.getElementById("soA");
    let getB = document.getElementById("soB");
    let setA = parseFloat(getA.value);
    let setB = parseFloat(getB.value);
    let chiaAB ;
    chiaAB= parseFloat(getA.value) + parseFloat(getB.value) ;
    document.getElementById("result").innerHTML = chiaAB;

}

