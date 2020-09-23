let getWeight = prompt("Nhập vào cân nặng đê bạn ei!(Đơn vị kilogram)");
let getHeight = prompt("Nhập vào chiều cao đê bạn ei!(Đơn vị mét)");
let bmi = parseFloat(getWeight)/(parseFloat(getHeight)*parseFloat(getHeight));

if (bmi < 18)
    document.write("Gầy quá");
else if (bmi < 25.0)
    document.write("Thân hình cân đối");
else if (bmi < 30.0)
    document.write("Hơi thừa cân");
else
    document.write("Béo vãi l!!! Giảm cân đê!!!");
