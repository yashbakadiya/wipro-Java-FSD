import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../models/product';
import { ProductsService } from '../services/products.service';

@Component({
  selector: 'app-list-products',
  templateUrl: './list-products.component.html',
  styleUrls: ['./list-products.component.css'],
})
export class ListProductsComponent implements OnInit {
  products: Product[] | undefined;
  constructor(private productService: ProductsService) {}

  ngOnInit(): void {
    const observable: Observable<Product[]> =
      this.productService.fetchProducts();
    observable.subscribe({
      next: (result: Product[]) => {
        this.products = result;
      },
    });
  }
}
