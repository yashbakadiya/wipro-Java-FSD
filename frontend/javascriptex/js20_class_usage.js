/*
class example
*/
class Student{
    //name;
    // age;
    constructor(nameArg,ageArg){
      this.name = nameArg;
      this.age=ageArg;
    }     

   displayDetails(){
       console.log("name="+this.name);
       console.log("age="+this.age);
   } 

}

let student1=new Student("anusha",22);
console.log(student1.name+","+student1.age);

class CseStudent extends Student{
 
    constructor(name,age,language){
     super(name,age);
     this.language=language;
      
 }

 displayDetails(){
     super.displayDetails();
     console.log("language="+this.language);
 }

}

let cse1=new CseStudent('ayush',22,'java');
cse1.displayDetails();