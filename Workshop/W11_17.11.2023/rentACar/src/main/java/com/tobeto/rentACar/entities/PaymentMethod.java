package com.tobeto.rentACar.entities;

import jakarta.persistence.*;

import java.util.List;

@Table(name = "payment_methods")
@Entity
public class PaymentMethod {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "payment_name")
    private String paymentName;
    @OneToMany(mappedBy = "paymentMethod")
    private List<Rent> rents;
}
