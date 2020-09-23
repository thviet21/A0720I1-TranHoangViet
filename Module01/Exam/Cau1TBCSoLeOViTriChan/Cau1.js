let count = 0;
let sum = 0;

let doDaiMang = parseInt(prompt("Nhập vào số lượng phần tử của mảng"));
if (doDaiMang >50){
    alert("Độ dài mảng quá lớn!");
    do {

    doDaiMang = parseInt(prompt("Vui lòng nhập vào số lượng phần tử của mảng"));
    }while (doDaiMang>50)
}
let array = Array(doDaiMang);


for (let i = 0; i < doDaiMang; i++) {
    let index = parseInt(prompt("Nhập vào phẩn tử thứ " + (i + 1)));
    array[i] = index;
}
alert(array);

for (let i = 0; i < array.length; i++) {
    if (i % 2 === 0 || i === 0) {
        if (array[i] % 2 === 1){
            sum += array[i];
            count++;
        }
    }
}

let result = sum / count;
alert("Trung bình cộng: " + result);


