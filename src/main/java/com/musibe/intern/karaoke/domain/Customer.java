package com.musibe.intern.karaoke.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "customer")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Customer {

    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "password", columnDefinition = "CHAR", length = 6, nullable = false)
    private String password;

    @Column(name = "phoneNumber", columnDefinition = "CHAR", length = 11, nullable = false)
    private String phoneNumber;

    @Column(name = "gender", columnDefinition = "CHAR", length = 1, nullable = false)
    private String gender;

    @Column(name = "brithday", nullable = false)
    private LocalDate birthday;

    @Column(name = "charge_amount", nullable = false)
    private Long chargedAmount;

}
