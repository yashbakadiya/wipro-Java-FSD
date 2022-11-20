import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from './services/authentication.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'userms-frontend';

 constructor(private authService:AuthenticationService, private router:Router) {}

   isLoggedIn():boolean{
      return this.authService.isLoggedIn();
  }

  logout(){
    this.authService.logout();
    this.router.navigate(["/login"]);
  }

}
