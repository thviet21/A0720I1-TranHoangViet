let inputBanKinh;
let banKinh;
do {
    inputBanKinh = prompt("Nhập vào bán kính hình Tròn:",);
    banKinh = parseInt(inputBanKinh);
}while (inputBanKinh<0)
const pi = 3.14;
let chuViHinhTron = 2*banKinh*pi;

document.write("Diện tích hình Tròn là: " +chuViHinhTron);