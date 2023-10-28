package org.example.dataAccess;

import org.example.entities.Car;

public class JdbcCarDao implements CarDao {
    //Database erişim kodları..
    @Override
    public void add(Car car) {
        System.out.println(car.getId() + " id numaralı " +
                car.getBrand() + " Marka arac : JDBC ile veritabanına eklenmiştir. ");
    }

    @Override
    public void delete(Car car) {
        System.out.println(car.getId() + " id numaralı " +
                car.getBrand() + " Marka arac : JDBC ile veritabanından silinmiştir. ");
    }
}
