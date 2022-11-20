package com.trainingapps.empms;


import javax.persistence.*;

public class Demo1 {
    public static void main(String[] args) {

        Demo1 demo = new Demo1();
        demo.runApp();

    }

    public void runApp() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("empms");
        EntityManager entityManager1 = emf.createEntityManager();
        EntityTransaction transaction1 = entityManager1.getTransaction();
        transaction1.begin();
        Employee emp1 = new Employee("lakshmi", 21);
        entityManager1.persist(emp1);
        long id = emp1.getId();

        Employee emp2 = new Employee("keerthimai", 21);
        entityManager1.persist(emp2);

        transaction1.commit();
        System.out.println("***employee inserted with details");
        display(emp1);
        display(emp2);

        entityManager1.close();

        EntityManager entityManager2 = emf.createEntityManager();
        Employee fetchedEmployee = entityManager2.find(Employee.class, id);
        System.out.println("fetched employee by id=" + id);
        display(fetchedEmployee);
        entityManager2.close();

        EntityManager entityManager3=emf.createEntityManager();
        EntityTransaction transaction3=entityManager3.getTransaction();
        transaction3.begin();
        emp1.setName("kachana lakshmi");
        emp1.setAge(22);
        entityManager3.merge(emp1);

        Employee emp3=new Employee("sunny",21);
        emp3=entityManager3.merge(emp3);


        transaction3.commit();
        entityManager3.close();
        System.out.println("employee details changed");
        display(emp1);
        System.out.println("employee inserted");
        display(emp3);
        emf.close();
    }

    public void display(Employee employee) {
        System.out.println("***employee " + employee.getId() + "-" + employee.getName() + "-" + employee.getAge());
    }

}
