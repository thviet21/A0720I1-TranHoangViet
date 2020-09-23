function clickConvert() {
    let inputSoTien = document.getElementById("tien").value;
    let inputLoaiTienCanDoi = document.getElementById("tiente").value;
    let inputLoaiTienDoiRa = document.getElementById("tiente2").value;

    let soTien = parseInt(inputSoTien);
    function quyDoi() {
        if((inputLoaiTienCanDoi === "tienViet") && (inputLoaiTienDoiRa === "tienDollar")){
            let quyDoi = soTien/23000;
            document.getElementById("result").innerHTML = quyDoi;
        }
        else if((inputLoaiTienCanDoi === "tienViet")&&(inputLoaiTienDoiRa === "tienViet")){
            alert("Vui lòng chuyển đổi tiền tệ khác nhau");
        }
        else if((inputLoaiTienCanDoi === "tienDollar")&&(inputLoaiTienDoiRa === "tienViet")){
            let quyDoi = soTien*23000;
            document.getElementById("result").innerHTML = quyDoi;
        }
        else if((inputLoaiTienCanDoi === "tienDollar")&&(inputLoaiTienDoiRa ==="tienDollar")){
            alert("Vui lòng chuyển đổi tiền tệ khác nhau");
        }

    }
    if (soTien <= 0) {
        alert("Mời nhập vào số tiền lớn hơn 0");
    }
    else if(inputSoTien.length == 0){
        alert("Nhập vào số tiền đi bạn ei")
    }
    else{
        quyDoi();
    }

}
function clickReset() {
    document.getElementById("result").innerHTML = null;
}
