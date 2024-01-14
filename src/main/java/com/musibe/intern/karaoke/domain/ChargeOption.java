package com.musibe.intern.karaoke.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "charge_option")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ChargeOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "price", nullable = false)
    private Long price;

    @Column(name = "charge_option_type", columnDefinition = "CHAR", length = 4, nullable = false)
    private String chargeOptionType;

    @Column(name = "quantity", nullable = false)
    private Long quantity;

    @Column(name = "start_at", nullable = false)
    private LocalDateTime startAt;

    @Column(name = "end_at", nullable = false)
    private LocalDateTime endAt;

}
