package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,name = "clientId")
    private long clientId;
    @OneToMany(mappedBy = "Client")
    @Column(nullable = false,name = "advisorId")
    private long advisorId;

    @Column(nullable = false,name = "firstname")
    private String firstName;

    @Column(nullable = false,name = "lastname")
    private String lastName;

    @Column(nullable = false,name = "address")
    private String address;

    @Column(nullable = false,name = "phone")
    private String phone;

    @Column(nullable = false,name = "email")
    private String email;

    public Client(long advisorId, String firstName, String lastName, String address, String phone, String email) {
        this.advisorId = advisorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public Client() {
    }

    public void setAdvisorId(long advisorId) {
        this.advisorId = advisorId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getClientId() {
        return clientId;
    }

    public long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
