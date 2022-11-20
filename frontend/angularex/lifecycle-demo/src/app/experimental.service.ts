import { Injectable } from '@angular/core';
import { Product } from './model/product';

@Injectable({
  providedIn: 'root'
})
export class ExperimentalService {

  constructor() { }

  getBestProduct(){
    return new Product("samsung",10000);
  }
}
