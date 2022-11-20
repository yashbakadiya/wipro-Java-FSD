import { Component, OnInit } from '@angular/core';
import { User } from '../models/User';

@Component({
  selector: 'interpolation-demo',
  templateUrl: './interpolation-demo.component.html',
  styleUrls: ['./interpolation-demo.component.css']
})
export class InterpolationDemoComponent  {

  constructor() { }

  user: User=new User('shivam',21);

  greet(){
    let msg="Welcome to Angular framework";
  return msg;
  }


}
