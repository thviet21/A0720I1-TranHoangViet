let getRequest = parseInt(prompt("Nhập vào lựa chọn của bạn!\n 1.Chuyển feet sang mét.\n2.Chuyển mét sang feet."));
let getLength = 0;
let result = 0;
switch (getRequest) {
    case 1:
        getLength = parseInt(prompt("Nhập vào độ dài feet"));
        result = feetToMeter(getLength);
        alert("Chiều dài chuyển từ feet sang mét là:" + result);
        break;
    case 2:
        getLength = parseInt(prompt("Nhập vào độ dài meeter"));
        result = meterToFeet(getLength);
        alert("Chiều dài chuyển từ mét sang feet là:" + result);

        break;
    default:
        alert("Nhập vào số từ 1-2 :@");
}
function feetToMeter(feet) {
    let meter = 0.305 * feet;
    return meter;
}
function meterToFeet(meter) {
    let feet = 3.279 * meter;
    return feet;
}