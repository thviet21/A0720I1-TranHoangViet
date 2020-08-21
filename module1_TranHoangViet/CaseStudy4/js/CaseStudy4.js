let arr_CustomerName = ["Việt","Trần","Nam"];
let get_Request = parseInt(prompt("Nhập vào trang bạn muốn chuyển đến!\n" +
    "1.Thêm tên khách hàng.\n" +
    "2.Xóa tên khách hàng."));
let getName = "";
let getLength ;
switch (get_Request) {
    case 1:
        getLength = parseInt(prompt("Nhập vào số lượng người dùng muốn thêm!"));
        for (let i = 0; i < getLength; i++) {
            getName = prompt("Nhập vào tên người dùng muốn thêm: ");
            add_CustomerName(getName);
        }
        alert(arr_CustomerName);
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


