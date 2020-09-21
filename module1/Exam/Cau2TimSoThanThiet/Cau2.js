let soA = parseInt(prompt("Nhập vào số A:"));
let soB = parseInt(prompt("Nhập vào số A:"));
let sum = 0;
let sum2 = 0 ;
let array = [];
let array2 = [];
for (let i = 1; i <= soA/2; i++) {
    if (soA % i === 0) {
        array.push(i);
    }
}


for (let i = 1; i <= soB/2; i++) {
    if (soB % i === 0) {
        array2.push(i);
    }
}

console.log(array);
console.log(array2);

function sumArraySoA() {
    for (let i = 0; i < array.length; i++) {
        sum += array[i];
    }
    if (sum === soB) {
        return true;
    } else {
        return false;
    }
}

function sumArraySoB() {
    for (let i = 0; i < array2.length; i++) {
        sum2 += array2[i];
    }
    if (sum2 === soA) {
        return true;
    } else {
        return false;
    }
}

if (sumArraySoA() && sumArraySoB()) {
    alert("Số " + soA + " và " + soB + " là cặp số thân thiết!");
} else {
    alert("Số " + soA + " và " + soB + " không phải là cặp số thân thiết!");
}

