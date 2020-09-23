let sout ="<table border='1'   cellspacing='0' cellpadding='10' style='text-align: center'>";;

for (let i = 1; i <= 10 ; i++) {
    sout += "<tr>";
    for (let j = 2; j < 10 ; j++) {
        sout = sout + "<td>" + j + "x" + i + "= " + j*i + "</td>";
    }
    sout = sout + "</tr>"
}
sout = sout + "</table>";
document.getElementById("result").innerHTML = sout;