class Temperature {
    constructor(temperature) {
        this.temperature = temperature;
    }
    getCtoF = function () {
        return (this.temperature * 1.8) + 32;
    };
    getCtoKenvin = function () {
        return this.temperature + 273.15;
    };
    setTemperature = function (temperature) {
        this.temperature = temperature;
        return temperature;
    }
}
let temperature = new Temperature(30);
let CtoF = temperature.getCtoF();
let CtoK = temperature.getCtoKenvin();
document.writeln(temperature.temperature + " độ C chuyển sang độ F là: " + CtoF + "<br>");
document.writeln(temperature.temperature + " độ C chuyển sang độ K là: " + CtoK +"<br>");