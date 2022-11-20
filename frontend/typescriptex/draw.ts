class Canvas {
  square: Square;

  constructor(shape:Square){
    this.square=shape;
  }

  setShape(square:Square){
  this.square=square;
  }

  drawShape(): void {
    const areaVal: number = this.square.area();
    console.log("shape drawn with area " + areaVal);
  }
}

class Square {
  constructor(public side: number) {}

  area(): number {
    return this.side * this.side;
  }
}

const square1=new Square(5);
const square2=new Square(10);

const canvas1:Canvas=new Canvas(square1);
canvas1.drawShape();
const canvas2:Canvas=new Canvas(square2);
canvas2.drawShape();

