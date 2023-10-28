package org.example.entities;

public class Customer {
    private int id;
    private String fName;
    private String lName;
    private String phone;
    private String age;
    private String identifyNumber;
    private int driverLicenseYear;

    public Customer() {

    }
    public Customer(int id, String fName, String lName, String phone, String age, String identifyNumber, int driverLicenseYear) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.age = age;
        this.identifyNumber = identifyNumber;
        this.driverLicenseYear = driverLicenseYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIdentifyNumber() {
        return identifyNumber;
    }

    public void setIdentifyNumber(String identifyNumber) {
        this.identifyNumber = identifyNumber;
    }

    public int getDriverLicenseYear() {
        return driverLicenseYear;
    }

    public void setDriverLicenseYear(int driverLicenseYear) {
        this.driverLicenseYear = driverLicenseYear;
    }
}
