import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, UrlTree, ParamMap, Router } from '@angular/router';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UrlGuard implements CanActivate {
  
  constructor(private router:Router){

  }
  
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): boolean {
     const paramMap:ParamMap =route.paramMap;
     const idValue:any= paramMap.get('id');
     if(!idValue){
       return false;
     }
     const notNumber:boolean=isNaN(idValue);
     if(notNumber){
      this.router.navigate(['/error']);
     }
     return true;
    }
  
}
