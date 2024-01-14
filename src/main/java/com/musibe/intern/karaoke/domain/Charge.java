package com.musibe.intern.karaoke.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "charge")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Charge {

    @Id
    private Long id;

    @Column(name = "charge_amount", nullable = false)
    private Long chargeAmount;

    @Column(name = "charge_type", columnDefinition = "CHAR", length = 4,nullable = false)
    private String chargeType;

    @ManyToOne
    @JoinColumn(name = "charge_option_id", nullable = false)
    private ChargeOption chargeOption;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "coupon_id", nullable = false)
    private Coupon coupon;

    @ManyToOne
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment payment;

    @ManyToOne
    @JoinColumn(name = "room_detail", nullable = false)
    private RoomDetail roomDetail;
}
