import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'smallestNumber',
})
export class SmallestNumberPipe implements PipeTransform {
  transform(inputs: number[]): number {
    let min: number = inputs[0];
    for (let num of inputs) {
      if (num < min) {
        min = num;
      }
    }
    return min;
  }
}
