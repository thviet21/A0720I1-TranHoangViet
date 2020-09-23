let getString;
let array = [];

do {
    getString =  prompt("Chuỗi muốn kiểm tra");
    getString.trim().toLowerCase();
}while (getString.length<2);


for (let i = 0; i < getString.length; i++) {
    array[i] = getString.trim().toLowerCase().charAt(i);
}

function isPalindrome() {
    for (let i = 0; i < array.length / 2; i++) {
        if (array[i] !== array.reverse()[i]) {
            return false;
        }
    }
    return true;

}


function showResult() {
    if (isPalindrome()) {
        alert("Đây là chuỗi đối xứng");
    } else {
        alert("Không phải là chuỗi đối xứng");
    }
}

showResult();