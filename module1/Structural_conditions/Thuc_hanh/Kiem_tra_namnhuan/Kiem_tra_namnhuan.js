let year = parseInt(prompt("Enter a year"));
if (year % 4 == 0) {
    if (year % 100 == 0) {
        if (year % 400 == 0) {
            alert(year + " Là năm nhuận");
        } else {
            alert(year + " Không phải năm nhuận");
        }
    } else {
        alert(year + " Là năm nhuận");
    }
} else {
    alert(year + " Không phải năm nhuận");
}