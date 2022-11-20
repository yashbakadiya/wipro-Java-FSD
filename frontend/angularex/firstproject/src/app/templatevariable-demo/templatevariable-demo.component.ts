import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'templatevariable-demo',
  templateUrl: './templatevariable-demo.component.html',
  styleUrls: ['./templatevariable-demo.component.css']
})
export class TemplatevariableDemoComponent  {

  description: string = '';

  changeDescription(description: string): void {
    this.description = description;
  }

}
