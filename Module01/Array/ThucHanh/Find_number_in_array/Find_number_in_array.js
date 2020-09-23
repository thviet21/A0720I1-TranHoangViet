let value = parseInt(prompt("Nhập vào số muốn tìm trong Array:"));
let numbers = [-3, 5, 1, 3, 2, 10];
numbers.forEach(value1 => {
    if (value1 === value){
        alert("Có số bạn muốn tìm trong mảng");
    }else{
        return false;
    }
});