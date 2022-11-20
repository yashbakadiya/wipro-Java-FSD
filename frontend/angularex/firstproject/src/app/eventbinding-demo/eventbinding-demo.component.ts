import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'eventbinding-demo',
  templateUrl: './eventbinding-demo.component.html',
  styleUrls: ['./eventbinding-demo.component.css']
})
export class EventbindingDemoComponent  {
  counter:number=0;
  username:string="";

  increment():void{
    this.counter++;
   console.log("counter incremented "+this.counter);
   }
 
   changeUserName(newName:string):void{
   this.username = newName;
   }
 

}
