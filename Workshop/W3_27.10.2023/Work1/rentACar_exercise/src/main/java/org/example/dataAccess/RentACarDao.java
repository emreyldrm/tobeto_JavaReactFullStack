package org.example.dataAccess;

import org.example.entities.Car;
import org.example.entities.Customer;

public interface RentACarDao {
    void addCar(Car car);
    void delete(Car car);
    void delete(Customer customer);
    void addCustomer(Customer customer);
    void rent(Car car, Customer customer, int day);
}
