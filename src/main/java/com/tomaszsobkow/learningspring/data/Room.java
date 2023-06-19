package com.tomaszsobkow.learningspring.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ROOM")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ROOM_ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ROOM_NUMBER")
    private String roomNumber;

    @Column(name="BED_INFO")
    private String bedInfo;

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", bedInfo='" + bedInfo + '\'' +
                '}';
    }
}
