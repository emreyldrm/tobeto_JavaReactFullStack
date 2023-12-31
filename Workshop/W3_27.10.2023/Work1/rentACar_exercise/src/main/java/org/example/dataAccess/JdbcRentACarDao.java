package org.example.dataAccess;

import org.example.entities.Car;
import org.example.entities.Customer;

public class JdbcRentACarDao implements RentACarDao {
    //Database erişim kodları..
    @Override
    public void addCar(Car car) {
        System.out.println(car.getId() + " id numaralı " +
                car.getBrand() + " Marka arac : JDBC ile veritabanına eklenmiştir. ");
    }
    @Override
    public void addCustomer(Customer customer) {
        System.out.println(customer.getfName() + " " +
                customer.getlName() + " JDBC ile veritabanına eklenmiştir ");
    }
    @Override
    public void delete(Car car) {
        System.out.println(car.getId() + " id numaralı " +
                car.getBrand() + " Marka arac : JDBC ile veritabanından silinmiştir. ");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getfName() + " " +
                customer.getlName() + " JDBC ile veritabanından silinmiştir. ");
    }

    @Override
    public void rent(Car car, Customer customer, int day) {
        System.out.println("**********");
        System.out.println(car.getBrand() + " " + car.getModel() + " aracı " +
                customer.getfName()+ " "  + customer.getlName() + " isimli müşteriye " +
                day + " günlüğüne kiralanmıştır.");
        System.out.println("Ödeyeceği tutar : " + day * car.getDailyRentCharge() + " TL dir.");
        System.out.println("Kira sözleşmesi, JDBC ile veritabanına eklenmiştir.");
        System.out.println("**********");
    }
}
