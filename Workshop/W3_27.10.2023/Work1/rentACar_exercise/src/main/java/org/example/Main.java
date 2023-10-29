package org.example;

import org.example.business.RentManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.HibernateRentACarDao;
import org.example.dataAccess.JdbcRentACarDao;
import org.example.entities.Car;
import org.example.entities.Customer;

public class Main {
    public static void main(String[] args) throws Exception {

        //Cars created.
        Car car1 = new Car(1,"Hyundai","i20",2018,"Auto","Diesel",5000);
        Car car2 = new Car(2,"BMW","i8",2023,"Auto","Hybrid",12000);
        Car car3 = new Car(3,"Mercedes","Benz",2022,"Manuel","Petrol",7500);
        Car car4 = new Car(4,"Audi","A8",2021,"Auto","Diesel",9000);

        Car[] cars = {car1,car2,car3,car4};

        //Customer created.
        Customer customer1 = new Customer(1,"Emre","Yıldırım","05052021820",24,"50520210144",2);
        Customer customer2 = new Customer(2,"Engin","Demiroğ","05124568710",35,"15624488466",10);

        Customer[] customers = {customer1,customer2};
        Logger[] loggers = {new MailLogger(), new FileLogger(), new DatabaseLogger()};

        RentManager rentManager = new RentManager(new JdbcRentACarDao(), loggers);

        //Cars added to database.
        for (Car car:cars) {
            rentManager.addCar(car);
        }

        System.out.println("-------------------");

        //Customer added to database.
        for (Customer customer:customers) {
            rentManager.addCustomer(customer);
        }

        //Rent a Car
        rentManager.rent(car1,customer1,3);
        rentManager.rent(car2,customer2,5);


        //Entities deleted from database.
        System.out.println("-------------------");
        rentManager.delete(car1);
        rentManager.delete(customer1);
    }
}