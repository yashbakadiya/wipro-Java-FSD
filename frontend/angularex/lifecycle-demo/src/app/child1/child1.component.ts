import { Component, OnDestroy, OnInit } from '@angular/core';
import { ExperimentalService } from '../experimental.service';
import { Product } from '../model/product';

@Component({
  selector: 'app-child1',
  templateUrl: './child1.component.html',
  styleUrls: ['./child1.component.css'],
})
export class Child1Component implements OnInit, OnDestroy {
  product: Product | undefined;
  date: Date | undefined;
  subscriptionId;

  constructor(private service: ExperimentalService) {
    console.log('inside child 1 constructor');
  }

  /**
   * used for intialization
   */
  ngOnInit(): void {
    console.log('inside child 1 ngOninit');
    this.product = this.service.getBestProduct();

    /*
    this.subscriptionId=setInterval( () => {
      this.date = new Date();
      console.log("new date created",this.date);
    },2000);*/
  }

  ngOnDestroy(): void {
    console.log('inside child1 ngOnDestroy');
    //clearInterval(this.subscriptionId);
  }
}
