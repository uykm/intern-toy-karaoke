package com.musibe.intern.karaoke.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "coupon")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Coupon extends BaseDateEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "issued_at", nullable = false)
    private LocalDate issuedAt;

    @Column(name = "expired_at", nullable = false)
    private LocalDate expiredAt;

    @Column(name = "name", columnDefinition = "VARCHAR", length = 15,nullable = false)
    private String name;

    @Column(name = "coupon_type", columnDefinition = "CHAR", length = 4, nullable = false)
    private String couponType;

    @Column(name = "saved_time", nullable = false)
    private Long savedTime;

    @Column(name = "saved_song_count", nullable = false)
    private Long savedSongCount;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customerId;

}
