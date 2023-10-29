package org.example.dataAccess;

import org.example.entities.Car;
import org.example.entities.Customer;

public class HibernateRentACarDao implements RentACarDao {
    //Database erişim kodları..
    @Override
    public void addCar(Car car) {
        System.out.println(car.getId() + " id numaralı " +
                car.getBrand() + " Marka arac : Hibernate ile veritabanına eklenmiştir. ");
    }

    @Override
    public void delete(Car car) {
        System.out.println(car.getId() + " id numaralı " +
                car.getBrand() + " Marka arac : Hibernate ile veritabanından silinmiştir. ");
    }
    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getfName() + " " +
                customer.getlName() + " JDBC ile veritabanından silinmiştir. ");
    }

    @Override
    public void addCustomer(Customer customer) {
        System.out.println(customer.getfName() + " " +
                customer.getlName() + " Hibernate ile veritabanına eklenmiştir ");
    }

    @Override
    public void rent(Car car, Customer customer, int day) {
        System.out.println(car.getBrand() + " " + car.getModel() + " aracı " +
                customer.getfName()+ " "  + customer.getlName() + " isimli müşteriye " +
                day + " günlüğüne kiralanmıştır.");
        System.out.println("Ödeyeceği tutar : " + day * car.getDailyRentCharge() + " TL dir.");
        System.out.println("Kira sözleşmesi, Hibernate ile veritabanına eklenmiştir.");
    }
}
