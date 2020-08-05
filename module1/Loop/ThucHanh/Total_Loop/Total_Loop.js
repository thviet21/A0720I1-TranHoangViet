let get_N = parseInt(prompt("Nhập vào N"));
let total;
if (get_N <= 0 || isNaN(get_N)){
    alert("Nhập vào N lớn hơn 0!")
}
else {
    for (let i = 0 ; i < get_N;i++){
        total += i;
    }
    alert("Tổng của số từ 0 đến " + get_N + "là: " + total);
}
