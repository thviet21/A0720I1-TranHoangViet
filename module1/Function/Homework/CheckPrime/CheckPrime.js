function checkPrime(number) {
    if (number < 2){
        return false;
    }else {
        for (let i = 2;i <= Math.sqrt(number);i++){
            if (number % i === 0){
                return false;
            }
        }
        return true;
    }
}
function main() {
    let getNumber = parseInt(prompt("Nhập vào số nguyên!"));
    if (getNumber < 0){
        alert("Nhập vào số nguyên dương!")
    }else {
        if (checkPrime(getNumber)){
            alert("Số " + getNumber +" là số nguyên tố!");
        }
        else {
            alert("Số " + getNumber + " không phải là số nguyên tố!")
        }
    }
}
main();