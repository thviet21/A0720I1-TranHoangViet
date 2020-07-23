let getA = document.getElementById("soA");
let getB = document.getElementById("soB");
let setA = parseInt(getA.value);
let setB = parseInt(getB.value);
function phepCong() {
    const sumAB = parseInt(setA + setB) ;
    document.getElementById("result").innerHTML = sumAB;
}
function phepTru() {
    const subAB = setA - setB;
    document.getElementById("result").innerHTML = subAB;

}
function phepNhan() {
    const nhanAB = setA * setB;
    document.getElementById("result").innerHTML = nhanAB;

}
function phepChia() {
    const chiaAB = setA / setB;
    document.getElementById("result").innerHTML = chiaAB;

}
