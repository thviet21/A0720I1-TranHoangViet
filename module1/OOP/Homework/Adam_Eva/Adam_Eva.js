class Apple {
    constructor() {
        this.weightApple = 10;
        this.status = true;
    }
    getWeightApple(){
        return this.weightApple;
    }
    isEmpty(){
        if (this.weightApple === 0){
            return true;
        }
        else {
            return false;
        }

    }
}
class People {
    constructor(name, gender, weight) {
        this.name = name;
        this.gender = true;
        this.weight = weight;
    }
    isMale(){
        if (this.gender){
            alert("Giới tính nam");
        }else {
            alert("Giới tính nữ");
        }
    }
    setGender(gender){
        return this.gender = gender;
    }
    saySomething(string){
        return this.string = string;
    }
    eatApple(Apple){
        Apple.weightApple -=1;
        this.weight += 1;
    }
    checkApple(Apple){
        if (Apple.isEmpty()){
            alert("Đã ăn hết táo!");
        }
    }
    getName(){
        return this.name;
    }
    setName(name){
        this.name = name;
    }
    getWeight(){
        return this.weight;
    }
    setWeight(weight){
        this.weight = weight;
    }
}
let apple = new Apple();
let adam = new People("Adam", true,60);
let eva = new People("Eva",false , 55);
adam.eatApple(apple);
alert(apple.weightApple);
eva.eatApple(apple);
alert(apple.weightApple);

let someThing = adam.saySomething("Việt nam number 1");
alert(someThing);