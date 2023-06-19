package com.tomaszsobkow.learningspring.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="GUEST")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="GUEST_ID")
    private Long Id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "STATE")
    private String state;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Override
    public String toString() {
        return "Guest{" +
                "Id=" + Id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
