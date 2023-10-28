package org.example.dataAccess;

import org.example.entities.Car;

public class HibernateCarDao implements CarDao{
    //Database erişim kodları..
    @Override
    public void add(Car car) {
        System.out.println(car.getId() + " id numaralı " +
                car.getBrand() + " Marka arac : Hibernate ile veritabanına eklenmiştir. ");
    }

    @Override
    public void delete(Car car) {
        System.out.println(car.getId() + " id numaralı " +
                car.getBrand() + " Marka arac : Hibernate ile veritabanından silinmiştir. ");
    }
}
