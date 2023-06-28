package com.ost.Ktob.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Purchase")
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id",nullable = false)
    private Long userId;

    @Column(name = "book_id",nullable = false)
    private Long bookId;

    @Column(name = "price",nullable = false)
    private Double price;

    @Column(name = "purchase_date",nullable = false)
    private LocalDateTime purchase_date;
}
