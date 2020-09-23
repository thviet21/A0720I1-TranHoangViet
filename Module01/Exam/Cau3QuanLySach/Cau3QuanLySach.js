class Sach {
    constructor(maSoSach, tenSach, namXuatBan, soQuyen, tinhTrang) {
        this.maSoSach = maSoSach;
        this.tenSach = tenSach;
        this.namXuatBan = namXuatBan;
        this.soQuyen = soQuyen;
        this.tinhTrang = tinhTrang;
    }
}

let array = [];
let sachToan = new Sach(12345, "Toán", 2000, 3, true);
let sachVan = new Sach(23456, "Văn", 1998, 4, true);
let sachTiengAnh = new Sach(34785, "Tiếng Anh", 1999, 5, false);
array.push(sachToan);
array.push(sachVan);
array.push(sachTiengAnh);

let result = "<tr><th>Mã số sách</th> <th> Tên sách </th> <th> Năm xuất bản </th>" +
    "<th> Số quyển </th> <th> Tình trạng </th></tr>"
    + "<tr><td>" + sachToan.maSoSach + "</td>" +
    "<td>" + sachToan.tenSach + "</td>" +
    "<td>" + sachToan.namXuatBan + "</td>" +
    "<td>" + sachToan.soQuyen + "</td>" +
    "<td>" + sachToan.tinhTrang + "</td>"
    + "</tr>" +
    "<tr><td>" + sachVan.maSoSach + "</td>" +
    "<td>" + sachVan.tenSach + "</td>" +
    "<td>" + sachVan.namXuatBan + "</td>" +
    "<td>" + sachVan.soQuyen + "</td>" +
    "<td>" + sachVan.tinhTrang + "</td>"
    + "</tr>" +
    "<tr><td>" + sachTiengAnh.maSoSach + "</td>" +
    "<td>" + sachTiengAnh.tenSach + "</td>" +
    "<td>" + sachTiengAnh.namXuatBan + "</td>" +
    "<td>" + sachTiengAnh.soQuyen + "</td>" +
    "<td>" + sachTiengAnh.tinhTrang + "</td>"
    + "</tr>";

function showProduct() {
    document.getElementById("tableBooks").innerHTML = result;
}

showProduct();

function addBook() {
    let maSoSach = prompt("Nhập vào mã sách!");
    if (maSoSach.length > 5) {
        alert("Mã sách sai yêu cầu nhập vào!(5 kí tự)");
        do {
            maSoSach = prompt("Nhập vào mã sách!");
        } while (maSoSach.length > 5)
    }
    let tenSach = prompt("Nhập vào tên sách!");
    let namXuatBan = parseInt(prompt("Nhập vào năm xuất bản!"));
    if (isNaN(namXuatBan) || namXuatBan <= 0 || namXuatBan >= 10000) {
        alert("Năm xuất bản sai yêu cầu nhập vào!");
        do {
            namXuatBan = prompt("Nhập vào năm xuất bản!");
        } while (namXuatBan.length > 5)
    }
    let soQuyen = parseInt(prompt("Số lượng sách!"));
    if (isNaN(soQuyen)) {
        alert("Vui lòng nhập vào số!");
        do {
            soQuyen = parseInt(prompt("Số lượng sách!"));
        } while (namXuatBan.length > 5)
    }
    let tinhTrang = confirm("Còn sài được đúng không?");
    alert("Nhập thông tin thành công")
    let sach = new Sach(maSoSach, tenSach, namXuatBan, soQuyen, tinhTrang);
    result += "<tr><td>" + sach.maSoSach + "</td>" +
        "<td>" + sach.tenSach + "</td>" +
        "<td>" + sach.namXuatBan + "</td>" +
        "<td>" + sach.soQuyen + "</td>" +
        "<td>" + sach.tinhTrang + "</td>"
        + "</tr>";
    showProduct();
}

