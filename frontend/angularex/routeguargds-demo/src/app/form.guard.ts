import { Injectable } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, CanDeactivate } from '@angular/router';
import { Observable } from 'rxjs';
import { IFormComponent } from './IFormComponent';

@Injectable({
  providedIn: 'root'
})
export class FormGuard implements CanDeactivate<IFormComponent> {
  canDeactivate(component: IFormComponent, currentRoute: ActivatedRouteSnapshot, 
    currentState: RouterStateSnapshot,
     nextState?: RouterStateSnapshot): boolean  {
  
    const formGroup:FormGroup= component.getFormGroup();
    if(! formGroup.dirty){
    return true;
    }
    return confirm("do you want to leave?");
  }
  
  
}
