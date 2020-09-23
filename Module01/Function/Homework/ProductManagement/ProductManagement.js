let arrayProducts = ["Apple Iphone X","Xiaomi Redmi Note 4", "Sony Eperia", "Oppo F1S"];
let result = "";
let product;
let table;
showProducts();
function addProduct() {
    product = document.getElementById("addProduct");
    if (product.value === ""){
        alert("Không được để trống")
    }else {
        arrayProducts.push(product.value);
        showProducts();
    }
}
function showProducts() {
    if (arrayProducts.length === 0){
        document.getElementById("listProducts").innerHTML="";
    }else{
        result = "<table id='tableProducts'><tr><th>Product Name</th><th colspan='2'>" + arrayProducts.length + " product(s) </th></tr>" ;
        for (let index = 0; index < arrayProducts.length; index++){
            result += "<tr><td id='editInput'>" + arrayProducts[index] + "</td>" +
                "<td><button onclick='editProduct("+ index + ")'>Edit</button></td>"+
                "<td><button onclick='deleteProduct(" + index +")'>Delete</button></td>"+
                "</tr>"
        }
        result += "</table>";
        if (document.getElementById("tableProducts") !== null){
            clearTable();
        }
        document.getElementById("listProducts").innerHTML = result;
    }

}


function clearTable() {
    table = document.getElementById("tableProducts");
    table.remove();
}


function editProduct(temp){
    result = "<table id='tableProducts'><tr><th>Product Name</th><th colspan='2'>" + arrayProducts.length + " product(s) </th></tr>";
    for (let index = 0; index < arrayProducts.length; index++){
        if (index === temp){
            result += "<tr><td><input type='text' id='editedProduct' value='"+ arrayProducts[index]+"'></td>" +
                "<td><button onclick='updateProduct("+ index + ")'>Update</button></td>"+
                "<td><button onclick='deleteProduct(" + index + ")'>Delete</button></td>"+
                "</tr>"
        } else {
            result += "<tr><td>" + arrayProducts[index] + "</td>" +
                "<td><button onclick='editProduct(" + index + ")'>Edit</button></td>"+
                "<td><button onclick='deleteProduct(" + index + ")'>Delete</button></td>"+
                "</tr>"
        }
    }
    result += "</table>";
    clearTable();
    document.getElementById("listProducts").innerHTML = result;
}

function updateProduct(temp) {
    product = document.getElementById("editedProduct");
    if (product.value ===""){
        alert("Không được để trống")
    } else {
        arrayProducts[temp] = product.value;
        showProducts();
    }

}
function deleteProduct(temp) {
    if (confirm("Bạn có muốn xóa sản phẩm " + arrayProducts[temp] + " không?")){
        arrayProducts.splice(temp,1);
        showProducts();
    }
}


