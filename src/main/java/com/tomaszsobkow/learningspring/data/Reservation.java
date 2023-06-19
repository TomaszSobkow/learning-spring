package com.tomaszsobkow.learningspring.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESERVATION_ID")
    private Long id;

    @Column(name = "ROOM_ID")
    private Long roomId;

    @Column(name = "GUEST_ID")
    private Long guestId;

    @Column(name = "RES_DATE")
    private Date ResDate;

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", roomId=" + roomId +
                ", guestId=" + guestId +
                ", ResDate=" + ResDate +
                '}';
    }
}
