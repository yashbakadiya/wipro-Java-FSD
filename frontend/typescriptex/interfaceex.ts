interface ICalculator{
    add(num1:number,num2:number):number
}

class CasioCalculator implements ICalculator{
    add(num1:number,num2:number):number{
        let result:number=num1+num2;
        return result;
    }
}

let calculator:ICalculator=new CasioCalculator();
let result:number=calculator.add(2,5);
console.log("result="+result);
