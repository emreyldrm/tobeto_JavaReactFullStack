package org.example.dataAccess;

import org.example.entities.Product;

public class JdbcProductDao implements ProductDao{
    // sadece database erisim kodları buraya yazılır.
    public void add(Product product){
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
