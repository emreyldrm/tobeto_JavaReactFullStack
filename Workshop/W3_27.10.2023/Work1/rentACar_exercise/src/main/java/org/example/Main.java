package org.example;

import org.example.business.RentManager;
import org.example.dataAccess.HibernateRentACarDao;
import org.example.dataAccess.JdbcRentACarDao;
import org.example.entities.Car;
import org.example.entities.Customer;

public class Main {
    public static void main(String[] args) throws Exception {

        //Cars created.
        Car car = new Car(1,"Hyundai","i20",2018,"Auto","Diesel",5000);

        //Customer created.
        Customer customer = new Customer(1,"Emre","Yıldırım","05052021820",24,"50520210144",2);


        RentManager rentManager = new RentManager(new HibernateRentACarDao());
        //Cars added to database.
        rentManager.addCar(car);

        //Customer added to database.
        rentManager.addCustomer(customer);

        //Rent a Car
        rentManager.rent(car,customer,3);

        //Entities deleted from database.
        rentManager.delete(car);
        rentManager.delete(customer);
    }
}