let English = ["Jungler","Attack Dame","Attack Powerful","Supporter","Top Laner"];
let Vietnamese = ["Người đi rừng", "Sát thương vật lý chủ lực","Sát thương Phép","Người hỗ trợ", "Người đi đường trên"];

let getRequest = prompt("Nhập vào từ muốn tìm");
let getPosition = English.indexOf(getRequest);
alert(Vietnamese[getPosition]);


