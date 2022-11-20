import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { baseServerUrl } from '../common/constants';
import { Product } from '../models/product';
import { AuthenticationService } from './authentication.service';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  constructor(private client:HttpClient) { }


  fetchProducts():Observable<Product[]>{
    const url=baseServerUrl+"/products";
    
    const observable:Observable<Product[]>=this.client.get<Product[]>(url);
    return observable;
  }


}
