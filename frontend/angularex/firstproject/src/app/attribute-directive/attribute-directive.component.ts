import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'attribute-directive',
  templateUrl: './attribute-directive.component.html',
  styleUrls: ['./attribute-directive.component.css']
})
export class AttributeDirectiveComponent {

  num:number=10;
  backValue:string="blue";
  colorValue:string="white";
  paddingValue="20px";
/*
  styleObj=  {'background-color':this.backValue,
  'color':this.colorValue,
  'padding':this.paddingValue
}
 */ 
}
