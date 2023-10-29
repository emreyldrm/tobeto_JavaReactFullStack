package org.example.business;

import org.example.core.logging.Logger;
import org.example.dataAccess.RentACarDao;
import org.example.entities.Car;
import org.example.entities.Customer;

public class RentManager {
    private RentACarDao rentACarDao;
    private Logger[] loggers;


    public RentManager(RentACarDao carDao, Logger[] loggers) {
        this.rentACarDao = carDao;
        this.loggers = loggers;
    }

    public void addCar(Car car) throws Exception {
        //veri tabanına ekleme kuralları
        if(car.getDateOfManufacture() < 2018){
            throw new Exception("2018 yılından önce üretilen araçlar kayıt edilemez.");
        }
        rentACarDao.addCar(car);

    }
    public void addCustomer(Customer customer) throws Exception {
        if(customer.getAge() < 18) {
            throw new Exception("18 yaşından küçükler araç kiralayamaz.");
        }
        rentACarDao.addCustomer(customer);
    }
    public void delete(Car car){
        rentACarDao.delete(car);
    }
    public void delete(Customer customer){
        rentACarDao.delete(customer);
    }

    public void rent(Car car, Customer customer,int day) throws Exception {
        //kiralama kuralları

        if (customer.getDriverLicenseYear() < 2) {
            throw new Exception("Sürücü ehliyeti, 2 yıllık süreyi doldurmayanlar araç kiralayamaz.");
        }
        rentACarDao.rent(car,customer,day);
        for (Logger logger : loggers) { //[db,mail,file]
            logger.log(customer.getfName() + " " + customer.getlName());

        }
    }

}
