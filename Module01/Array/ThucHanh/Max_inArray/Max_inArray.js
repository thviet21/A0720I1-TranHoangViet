let numbers = [-3, 5, 1, 3, 2, 10,56,55];
numbers.sort((a,b)=>{
    return b-a;
});
alert("Số lớn nhất là: " + numbers[0]);