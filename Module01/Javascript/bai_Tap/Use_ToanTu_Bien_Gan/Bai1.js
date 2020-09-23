// Viết chương trình nhập điểm của một sinh viên cho các môn: Vật lý, Hóa học, và Sinh học. Sau đó hiển thị điểm trung bình và tổng của những điểm này.
let inputVatly;
let inputHoahoc;
let inputSinhhoc;
let diemVatly;
let diemHoahoc;
let diemSinhhoc;
let trungBinhCong;
do{
inputVatly = prompt("Nhập vào điểm Lý:",);
diemVatly = parseInt(inputVatly);
}
while (diemVatly < 0)
do {
    inputHoahoc = prompt("Nhập vào điểm Hóa: ",);
    diemHoahoc = parseInt(inputHoahoc);
}while (diemHoahoc < 0)
do {
    inputSinhhoc = prompt("Nhập vào điểm Sinh: ",);
    diemSinhhoc = parseInt(inputSinhhoc);
}while (diemSinhhoc < 0)
trungBinhCong = (diemVatly + diemHoahoc + diemSinhhoc) / 3
document.write("Điểm trung bình cộng là: " + trungBinhCong);