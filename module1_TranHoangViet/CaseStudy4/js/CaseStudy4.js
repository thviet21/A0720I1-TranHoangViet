let arr_CustomerName = ["Tran Hoang Viet","1234a","goguys"];
let get_Request = parseInt(prompt("Nhập vào trang bạn muốn chuyển đến!\n" +
    "1.Thêm tên khách hàng.\n" +
    "2.Xóa tên khách hàng."));
let getName = "";
switch (get_Request) {
    case 1:
        getName = prompt("Nhập vào tên người dùng muốn thêm: ");
        add_CustomerName(getName);
        alert(arr_CustomerName.sort());
        break;
    case 2:
        getName = prompt("Nhập vào tên người dùng muốn xóa");
        delete_CustomerName(getName);
        alert(arr_CustomerName.sort());
        break;
    default:
        alert("Bạn vui lòng chọn các chức năng có trong trình đơn ");
}
function add_CustomerName(name){
    arr_CustomerName.push(name);
}
function delete_CustomerName(name) {
    arr_CustomerName = arr_CustomerName.filter(function(item) {
        return item !== name;
    });
}


