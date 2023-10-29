package org.example;

import org.example.business.CarManager;
import org.example.dataAccess.CarDao;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

public class Main {
    public static void main(String[] args) throws Exception {

        Car car = new Car(1,"Hyundai","i20",2018,"Auto","Diesel",5000);
        CarManager carManager = new CarManager();
        carManager.add(car);
        carManager.delete(car);
    }
}