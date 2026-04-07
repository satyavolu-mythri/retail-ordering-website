package com.project.RetailFoodOrdering.entity;



import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Double totalAmount;
    private String status;
    private String paymentStatus;
    private LocalDateTime createdAt = LocalDateTime.now();
}