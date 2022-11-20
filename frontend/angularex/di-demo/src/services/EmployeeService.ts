import { Injectable } from '@angular/core';
import { Employee } from 'src/model/Employee';

@Injectable({ providedIn: 'root' })
export class EmployeeService {
  employees: Employee[] = [
    new Employee('repul', 21),
    new Employee('shivam', 21),
    new Employee('gowtham', 21)
  ];

  getAllEmployees(): Employee[] {
    return this.employees;
  }

  findByName(name: string): Employee | undefined {
    for (let emp of this.employees) {
      if (emp.name == name) {
        return emp;
      }
    }
    return undefined;
  }

  addEmployee(employee: Employee): void {
    this.employees.push(employee);
  }
}
