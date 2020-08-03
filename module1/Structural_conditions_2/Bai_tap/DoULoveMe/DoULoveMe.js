let btnNo = document.getElementById("No");
function init() {
    btnNo.style.position = 'relative';
    btnNo.style.left = '0px';
}
window.onload = init;
function Yes() {
    alert("Mãi bên nhau nha em♥");
}
function No() {
    btnNo.style.top = (Math.random()*300)+"px";
    btnNo.style.left = (Math.random()*300)+"px";
    btnNo.style.bottom = (Math.random()*300)+"px";
}

