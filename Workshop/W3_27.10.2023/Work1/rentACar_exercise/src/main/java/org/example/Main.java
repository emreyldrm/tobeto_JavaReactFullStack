package org.example;

import org.example.dataAccess.CarDao;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(1,"Hyundai","i20",2018,"Auto","Diesel",5000);
        CarDao carDao = new HibernateCarDao();
        carDao.add(car);
        carDao.delete(car);
    }
}