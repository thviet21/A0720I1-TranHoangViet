class Phone {
    constructor(pin, saveMess, receiveMess, sendMess) {
        this.pin = pin;
        this.saveMess = saveMess;
        this.receiveMess = receiveMess;
        this.sendMess = sendMess;
    }
    getPower = function () {
        return true;
    };
    setPower = function (power) {
        return this.power = power;
    };
    getCharger = function () {
        return "Charging Pin...";
    };
    
}