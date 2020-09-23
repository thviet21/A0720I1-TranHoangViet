let arr = [];
let getElement = document.getElementById("txtValue");
function  add_element_to_array(){
    alert("Phần tử mới đã được thêm vào mảng")
    arr.push(getElement.value);
}
function display_array(){
    document.getElementById("result").innerHTML = arr.join("<br>");
}