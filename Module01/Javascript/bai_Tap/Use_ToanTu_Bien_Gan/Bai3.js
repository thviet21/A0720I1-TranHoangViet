let inputBanKinh;
let banKinh;
const pi = 3.14;
do {
    inputBanKinh = prompt("Nhập vào bán kính hình Tròn:",);
    banKinh = parseInt(inputBanKinh);
}while (inputBanKinh<0)

let dienTichHinhTron = (banKinh*banKinh)*pi;

document.write("Diện tích hình Tròn là: " +dienTichHinhTron);