import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from 'src/app/model/Employee';

@Injectable({ providedIn: 'root' })
export class EmployeeService {
  constructor(private client: HttpClient) {}

  getAllEmployees(): Observable<Employee[]> {
    const url = 'http://localhost:3000/employees';
    const observable: Observable<Employee[]> = this.client.get<Employee[]>(url);
    return observable;
  }

  findById(id:number): Observable<Employee> {
    const url = 'http://localhost:3000/employees/' + id;
    const observable: Observable<Employee> = this.client.get<Employee>(url);
    return observable;
  }

  addEmployee(employee: Employee): Observable<Employee> {
    const url = 'http://localhost:3000/employees';
    const observable: Observable<Employee> = this.client.post<Employee>( url,  employee  );
    return observable;
  }
}
