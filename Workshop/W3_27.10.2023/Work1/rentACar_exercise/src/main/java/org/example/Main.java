package org.example;

import org.example.business.CarManager;
import org.example.dataAccess.CarDao;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;
import org.example.entities.Customer;

public class Main {
    public static void main(String[] args) throws Exception {

        //Cars created.
        Car car = new Car(1,"Hyundai","i20",2018,"Auto","Diesel",5000);

        //Customer created.
        Customer customer = new Customer(1,"Emre","Yıldırım","05052021820",24,"50520210144",2);

        //Cars added to database.
        CarManager carManager = new CarManager(new HibernateCarDao());
        carManager.add(car);
        carManager.delete(car);

        //Rent a Car
        CarManager carManager1 = new CarManager(new HibernateCarDao());
        carManager1.rent(car,customer,3);
    }
}