//Biến đếm này ban đầu = 0, khi ktra 1 số là số nguyên tố này thì biến đếm mới tăng!
let bienDem = 0;
//Biến soCanKTra là số mình kiểm tra thử xem nó có là snt không?
let soCanKtra = 0;
//Biến soLanHienThi này sẽ là yêu cầu của ngta nhập vào muốn hiển thị bn số nguyên tố
let soLanHienThi = document.getElementById("count");
//Biến root này chỉ là 1 biến để nhận giá trị thôi
let root = "";
function hienThiSNT() {
    //Cho chạy while với đk dừng vòng lặp khi mà biến đếm nó nhỏ hơn Số lần ngta muốn hiển thị
    //Vì mình bắt đầu chạy từ 0 nên đk dừng sẽ là nhỏ hơn soLanHienThi
    while (bienDem < parseInt(soLanHienThi.value)){
        //If này ktra giá trị trả về của hàm kTraSNT của biến soCanKtra

        if (kTraSNT(soCanKtra)){
            //If trên đúng thì biến root nhận giá trị của biến soCanKtra hiện tại+ với thẻ br để xuống dòng
            root += soCanKtra + "<br>";
            //Hiển thị snt
            document.getElementById("result").innerHTML = root ;
            //Tăng đếm vì nó là số nt
            bienDem++;
        }
        //Dù if đúng hay sai biến soCanKtra này vẫn tăng vì nó số quyết định để tiếp tục với số tiếp theo.
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