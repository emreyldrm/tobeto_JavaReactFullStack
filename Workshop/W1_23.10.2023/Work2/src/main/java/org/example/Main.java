package org.example;

public class Main {
    public static void main(String[] args) {

        String mesaj = "Vade oranı";

        Product product1 = new Product();
        //set value
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStocks(3);
        product1.setImagerUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitsInStocks(2);
        product2.setImagerUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4000);
        product3.setDiscount(9);
        product3.setUnitsInStocks(4);
        product3.setImagerUrl("image3.jpg");


        Product[] products = {product1,product2,product3};
        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05222222222");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Emre");
        individualCustomer.setLastName("Yıldırım");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhone("0533333333");
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setTaxNumber("111111111111");
        corporateCustomer.setCustomerNumber("54431");

        Customer[] customers = {individualCustomer,corporateCustomer};

    }
}