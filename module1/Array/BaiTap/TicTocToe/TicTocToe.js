let arrayOfCaro = Array();
let isCheckPerson1 = true;

function init() {
    for (let i = 0; i < 5; i++) {
        arrayOfCaro[i] =  Array();
        for (let j = 0; j < 5; j++) {
            arrayOfCaro[i][j] = "";
        }
    }
}

function displayCaro() {
    let temp = "<table border='1' cellpadding='50px' style='border-collapse: collapse'> ";
    for (let i = 0; i < 5; i++) {
        temp += "<tr>";
        for (let j = 0; j < 5; j++) {
            temp += "<td onclick ='changeCaro(" + i + "," + j + ")'>" + arrayOfCaro[i][j] + "</td>";
        }
        temp += "</tr>";
    }
    temp += "</table>";
    document.getElementById('caro').innerHTML = temp;
}

function changeCaro(x, y) {
    if (arrayOfCaro[x][y] === "X" || arrayOfCaro[x][y] === "O") {
        alert("Ô bạn chọn đã có người khác chọn");
    } else {
        if (isCheckPerson1) {
            arrayOfCaro[x][y] = "X";
            checkWinner("X");
            isCheckPerson1 = false;
        } else {
            arrayOfCaro[x][y] = "O";
            checkWinner("O");
            isCheckPerson1 = true;
        }
        document.getElementById('caro').innerHTML = "";
        displayCaro();
    }
}

function checkWinner(temp) {
    for (let i = 0; i < 5; i++) {
        for (let j = 0; j < 3; j++) {
            if (arrayOfCaro[i][j] === temp && arrayOfCaro[i][j + 1] === temp && arrayOfCaro[i][j + 2] === temp) {
                alert(temp + " win");
                init();
                displayCaro();
            }
        }
    }
    for (let i = 0; i < 3; i++) {
        for (let j = 0; j < 5; j++) {
            if (arrayOfCaro[i][j] === temp && arrayOfCaro[i + 1][j] === temp && arrayOfCaro[i + 2][j] === temp) {
                alert(temp + " win");
                init();
                displayCaro();
            }
        }
        for (let j = 0; j < 3; j++) {
            if (arrayOfCaro[i][j] === temp && arrayOfCaro[i + 1][j + 1] === temp && arrayOfCaro[i + 2][j + 2] === temp) {
                alert(temp + " win");
                init();
                displayCaro();
            }
        }
        for (let j = 2; j < 5; j++) {
            if (arrayOfCaro[i][j] === temp && arrayOfCaro[i + 1][j - 1] === temp && arrayOfCaro[i + 2][j - 2] === temp) {
                alert(temp + " win")
                init();
                displayCaro();
            }
        }
    }
}


init();
displayCaro();
