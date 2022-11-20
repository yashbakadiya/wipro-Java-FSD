/*
class example
*/
class Student{
    
    constructor(public name:string, public age:number){
    }     

   displayDetails():void{
       console.log("name="+this.name);
       console.log("age="+this.age);
   } 

}

let student1:Student=new Student("anusha",22);
console.log(student1.name+","+student1.age);

class CseStudent extends Student{
 
    constructor(name:string,age:number,public language:string){
    super(name,age);
      
 }

 displayDetails():void{
     super.displayDetails();
     console.log("language="+this.language);
 }

}

let cse1:CseStudent=new CseStudent('ayush',22,'java');
cse1.displayDetails();