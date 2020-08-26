class Mobile {
    constructor(pin,  status, name) {
        this.pin = pin;
        this.composeMess = [];
        this.receiveMess = [];
        this.sendMess = [];
        this.status = status;
        this.name = name;
    }

    isPower() {
        if (this.status) {
            return true;
        } else {
            alert("Điện thoại đã tắt, vui lòng bật lại.");
            return false;
        }
    };

    turnOn_TurnOff() {
        if (this.isPower()) {
            this.status = false;
        } else {
            this.chargingMobile();
            this.status = true;
        }
        this.pin--;
    };

    chargingMobile() {
        if (this.pin < 5) {
            alert("Pin yếu. Cần sạc điện thoại");
            while (this.pin <= 100) {
                this.pin += 0.01;
            }
        }
    }

    composingMess() {
        if (this.isPower()) {
            this.chargingMobile();
            let sms = prompt("Nhập nội dung tin nhắn: ");
            this.composeMess.push(sms);
            this.pin--;
        } else {
            alert("Điện thoại đang tắt!");
        }
    }

    sendingSms(mobile) {

        if (this.isPower()) {
            this.chargingMobile();
            if (this.composeMess.length === 0) {
                this.composingMess();
                mobile.receiveMess.push("Người gửi: " + this.name + ". " + this.composeMess[0]);
                // tin nhắn được gửi sẽ được push vào vùng tin nhắn đã gửi của điện thoại gửi tin nhắn.
                this.sendMess.push(this.composeMess[0]);
                //Sau đó xóa tin nhắn đã gửi ở vùng tin nhắn soạn thảo
                this.composeMess.splice(0, 1);
            } else {
                //tương tự như trên nhưng trước khi gửi sẽ cho phép người dùng lựa chọn tin nhắn ở vùng nhớ đang soạn thảo để gửi đi
                let temp = "";
                for (let i = 0; i < this.composeMess.length; i++) {
                    temp += i + ": " + this.composeMess[i] + "\n";
                }
                let index = parseInt(prompt(temp + "\n" + "Yêu cầu bạn chọn tin nhắn để gửi!"));
                mobile.sendMess.push("Người gửi: " + this.name + ". " + this.composeMess[index]);
                this.sendMess.push(this.composeMess[index]);
                this.smsSoanThao.splice(index, 1);
            }
            this.pin--;
        }
    }

    xemSms() {
        //Kiểm tra điện thoại bật hay tắt
        if (this.isPower()) {
            let temp = [];
            let tempSms = "";
            // Kiểm tra pin có trên 5% hay không?
            this.chargingMobile();
            // hiển thị ra danh sách số mobile đã gửi tin nhắn đến điện thoại này?
            // Cho vòng lặp đầu tiên để duyệt tất cả các phần tử có trong vùng nhớ hộp thư đến
            for (let i = 0; i < this.receiveMess.length; i++) {
                let check = false;
                // VÒng lặp thứ 2 sẽ duyệt chuỗi tin nhắn trong hộp thư đến
                for (let j = 0; j < this.receiveMess[i].length; j++) {
                    // Nếu nó gặp được kí tự : thì sẽ chạy các câu lệnh ở trong if
                    if (this.receiveMess[i].charAt(j) === ":") {
                        let tempNguoiGui = "";
                        // Cho vòng lặp thứ 3 từ phần tử sau kí tự : để lấy ra được cái tên điện thoại gửi sms đến.
                        for (let k = j + 1; k < this.receiveMess[i].length; k++) {
                            // Nếu nó gặp được kí tự . thì sẽ chạy các câu lệnh ở trong if
                            if (this.receiveMess[i].charAt(k) === ".") {
                                //push tên người gửi vào mảng temp
                                temp.push(tempNguoiGui);
                                         check = true;
                                break;
                            } else {
                                // nếu ko thỏa if thì ta sẽ cộng thêm vào chuỗi temNguoiGui
                                tempNguoiGui += this.receiveMess[i].charAt(k);
                            }
                        }
                        // Kiểm tra biến check có biến true. Nếu như là true thì break vòng lặp 2 để kiểm tra tin nhắn tiếp theo trong vùng nhớ hộp thư đến
                        if (check) {
                            break;
                        }
                    }
                }
            }
            // Hiển thị danh sách các tin nhắn được gửi tới từ điện thoại nào?
            for (let i = 0; i < temp.length; i++) {
                tempSms += i + ": " + temp[i] + "\n";
            }
            //Cho phép người dùng chọn tin nhắn muốn xem trong vùng nhớ hộp thư đến
            let index = parseInt(prompt(tempSms + "\nChọn tin nhắn mà bạn muốn xem: "));
            alert(this.receiveMess[index]);
            this.pin--;
        }
    }

}
let nokia = new Mobile(100,true,"nokia");
let iphone = new Mobile(10,true,"iphone");
nokia.sendingSms(iphone);
iphone.xemSms();
