let bienDem = 0;
let soCanKtra = 0;
let soLanHienThi = document.getElementById("count");
let root = "";
function hienThiSNT() {
    while (bienDem < parseInt(soLanHienThi.value)){
        if (kTraSNT(soCanKtra)){
            root += soCanKtra + "<br>";
            document.getElementById("result").innerHTML = root ;
            bienDem++;
        }
        soCanKtra++
    }
}
function kTraSNT(n) {
    if (n <= 1) {
        return false;
    }
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;

}