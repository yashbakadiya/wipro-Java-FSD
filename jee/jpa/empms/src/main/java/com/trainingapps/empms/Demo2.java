package com.trainingapps.empms;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Demo2 {
    private EntityManager entityManager;

    public static void main(String[] args) {

        Demo2 demo = new Demo2();
        demo.runApp();

    }

    public void runApp() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("empms");
        this.entityManager = emf.createEntityManager();

        Employee emp1=add("lakshmi", 21);

        long id = emp1.getId();

        Employee emp2 = add("keerthimai", 21);

        System.out.println("***employee inserted with details");
        display(emp1);
        display(emp2);


        Employee fetchedEmployee =findById(id);
        System.out.println("fetched employee by id=" + id);
        display(fetchedEmployee);


        emp1.setName("kachana lakshmi");
        emp1.setAge(22);
        update(emp1);

        System.out.println("employee details changed");
        display(emp1);

        entityManager.close();
        emf.close();
    }

    public Employee add(String name, int age) {
        Employee employee = new Employee(name, age);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(employee);
        transaction.commit();
        return employee;

    }

    public Employee findById(long id) {
        Employee employee = entityManager.find(Employee.class, id);
         return employee;
    }

    public void update(Employee employee){
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(employee);
        transaction.commit();
    }


    public void display(Employee employee) {
        System.out.println("***employee " + employee.getId() + "-" + employee.getName() + "-" + employee.getAge());
    }

}
