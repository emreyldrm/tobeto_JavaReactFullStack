package org.example.business;

import org.example.dataAccess.CarDao;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;
import org.example.entities.Customer;

public class CarManager {
    private CarDao carDao;

    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }

    public void add(Car car) throws Exception {
        //veri tabanına ekleme kuralları
        if(car.getDateOfManufacture() < 2018){
            throw new Exception("2018 yılından önce üretilen araçlar kayıt edilemez.");
        }
        carDao.add(car);

    }
    public void delete(Car car){
        carDao.delete(car);
    }

    public void rent(Car car, Customer customer, int day) throws Exception {
        //kiralama kuralları
        if(customer.getAge() < 18){
            throw new Exception("18 yaşından küçükler araç kiralayamaz.");
        } else if (customer.getDriverLicenseYear() < 2) {
            throw new Exception("Ehliyeti 2 yıllık süreyi doldurmayanlar araç kiralayamaz.");
        }
        System.out.println(car.getBrand() + " " + car.getModel() + " aracı " +
                customer.getfName()+ " "  + customer.getlName() + " isimli müşteriye " +
                day + " günlüğüne kiralandı.");
        System.out.println("Ödeyeceği tutar : " + day * car.getDailyRentCharge() + " TL dir.");

    }
}
