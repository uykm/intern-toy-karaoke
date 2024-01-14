package com.musibe.intern.karaoke.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "room")
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "room_num", nullable = false)
    private Long roomNum;

    @Column(name = "room_size", nullable = false)
    private Long roomSize;

    @Column(name = "room_pos", nullable = false)
    private Long roomPos;

}
