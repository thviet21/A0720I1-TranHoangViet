let temp = false;
function nhap(number){
    if(number != '+' && number != '-'&& number != '*'&& number != '/'){
        if (temp){
            xoa();
        }
    }
    temp = false;
    let input = document.getElementById("inandout");
    input.value += number;

}
function xoa() {
    let clear = document.getElementById("inandout");
    clear.value = "";
}
function tinhtoan() {
    let cacular = document.getElementById("inandout");
    cacular.value = eval(cacular.value);
    temp = true;
}
