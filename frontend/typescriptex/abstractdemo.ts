abstract class Vehicle{
    constructor(public vehicleNumber:string){
    }
   abstract move():void;
}

class Car extends Vehicle{
    move(): void {
       console.log(this.vehicleNumber+ ' car is moving');
    }
    
}

let vehicle:Vehicle=new Car('DEL7346734');
vehicle.move();