import { Component, OnDestroy } from '@angular/core';
import { Observable, Observer, Subscription } from 'rxjs';
import { TimeService } from './service/time.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent  implements OnDestroy{
  title = 'observable-demo';
  date: Date | undefined;
  subscription: Subscription;
  constructor(private service: TimeService) {}

  fetchDate() {
    const observable: Observable<Date> = this.service.getTime();
    console.log('observable received');

    const observer = {
      next: (result: Date) => {
        this.date = result;
        console.log('date received');
      },

      error: (err: Error) => {
        console.log('error received ' + err.message);
      },
      complete: () => {
        console.log('completed ');
      },
    };
    this.subscription = observable.subscribe(observer);
  }

  ngOnDestroy():void{
    this.subscription.unsubscribe();
  }
}
