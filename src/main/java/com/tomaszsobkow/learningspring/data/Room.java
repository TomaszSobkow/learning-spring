package com.tomaszsobkow.learningspring.data;

import jakarta.persistence.*;

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

    public long id() { return id; }
    public Room setId(long id) { this.id = id;  return this; }

    public String name() { return name; }
    public Room setName(String name) { this.name = name; return this; }

    public String roomNumber() { return roomNumber; }
    public Room setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
        return this;
    }

    public String bedInfo() { return bedInfo; }
    public Room setBedInfo(String bedInfo) {
        this.bedInfo = bedInfo;
        return this;
    }
}
