class Cat {
    constructor(name, weight, speed) {
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }
    getSpeak(){
        return "Meo Meo";
    }
    catchMouse(cat,mouse){
        if (cat.speed > mouse.speed){
            alert("I got U");
        }else {
            alert("The Mouse so fast! Can't catch!");
        }
    }
    eatMouse(mouse){
        if (mouse.live){
            this.weight += mouse.weight;
        }else {
            alert("This mouse was dead!");
        }
    }
    setSpeed(speed){
        this.speed = speed;
    }

}

class Mouse extends Cat{
    constructor(name, weight, speed,live) {
        super(name, weight, speed);
        this.live = live;
    }

    getSpeak() {
        return "Chít chít";
    }

}
let cat = new Cat("Tom",30, 40);
let mouse = new Mouse("Jerry", 5 , 20 , true);
// alert(mouse.getSpeak());
cat.catchMouse(cat,mouse);
// cat.eatMouse(mouse);
// alert(cat.weight);