package com.musibe.intern.karaoke.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payment_option")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class PaymentOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "price", nullable = false)
    private Long price;

    @Column(name = "bonus", nullable = false)
    private Long bonus;

}
