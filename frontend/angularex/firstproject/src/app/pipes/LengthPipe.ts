import { Pipe, PipeTransform } from "@angular/core";

@Pipe({name:'length'})
export class LengthPipe implements PipeTransform{
    
    transform(value: string) :number {
    let len:number=value.length;
    return len;    
}

}