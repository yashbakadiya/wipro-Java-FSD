import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'propertybinding-demo',
  templateUrl: './propertybinding-demo.component.html',
  styleUrls: ['./propertybinding-demo.component.css']
})
export class PropertybindingDemoComponent  {
  url:string="http://google.com";


  shouldBeDisabled:boolean=false;


}
