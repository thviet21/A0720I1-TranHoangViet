let login = prompt("Nhập vào đê:","")
let message = (login == 'Employee') ? 'Hello' : (login == 'Director') ? 'Greetings' : (login == '') ? 'No login' : '';
alert(message);