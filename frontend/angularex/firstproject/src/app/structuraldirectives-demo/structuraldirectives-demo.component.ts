import { Component, OnInit } from '@angular/core';
import { Product } from '../models/Product';

@Component({
  selector: 'structuraldirectives-demo',
  templateUrl: './structuraldirectives-demo.component.html',
  styleUrls: ['./structuraldirectives-demo.component.css'],
})
export class StructuraldirectivesDemoComponent {

  num:number=10;

  products: Product[] = [
    new Product('smsung', 10000),
    new Product('motorolla', 15000),
    new Product('iphone',50000)
  ];
}
