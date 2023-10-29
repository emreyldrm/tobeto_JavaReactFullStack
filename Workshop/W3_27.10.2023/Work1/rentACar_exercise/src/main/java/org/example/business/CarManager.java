package org.example.business;

import org.example.dataAccess.CarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

public class CarManager {
    public void add(Car car) throws Exception {
        //iş kuralları
        if(car.getDateOfManufacture() < 2018){
            throw new Exception("2018 yılından önce üretilen araçlar kayıt edilemez.");
        }
        CarDao carDao = new JdbcCarDao();
        carDao.add(car);

    }
    public void delete(Car car){
        CarDao carDao = new JdbcCarDao();
        carDao.delete(car);
    }
}
