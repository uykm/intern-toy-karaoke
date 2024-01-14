package com.musibe.intern.karaoke.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payment")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "payment_method", length = 6, nullable = false)
    private String paymentMethod;

    @Column(name = "payment_amount", nullable = false)
    private Long paymentAmount;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "payment_option_id", nullable = false)
    private PaymentOption paymentOption;

}
