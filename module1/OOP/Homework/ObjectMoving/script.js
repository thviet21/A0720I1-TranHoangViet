class Hero{
  constructor(image, top, left,sizeHeight,sizeWidth) {

  this.image = image;
  this.top = top;
  this.left = left;
  this.sizeHeight = sizeHeight;
  this.sizeWidth = sizeWidth;
  }
  getHeroElement(){
    return '<img width="'+ this.sizeWidth + '"' +
      ' height="'+ this.sizeHeight + '"' +
      ' src="' + this.image +'"' +
      ' style="top: '+this.top+'px; left:'+ this.left +'px;position:absolute;" />';
  };

  moveRight(){
    this.left += 20;
    console.log('ok: ' + this.left);
  }

}

let hero = new Hero('pikachu.png', 20, 30, 110,110);

function start(){
  if(hero.left < window.innerWidth - hero.sizeWidth){
    hero.moveRight();
  }
  document.getElementById('game').innerHTML = hero.getHeroElement();
  setTimeout(start, 500)
}

start();