package com.example.customers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customers {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String last_name;
    private String first_name;
    private String email_address;
    private String job_title;
    private String mobile_phone;
    private String city;
    private String web_page;

    public void setId(Long id) {
        this.id = id;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setWeb_page(String web_page) {
        this.web_page = web_page;
    }

    public Long getId() {
        return id;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public String getJob_title() {
        return job_title;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public String getCity() {
        return city;
    }

    public String getWeb_page() {
        return web_page;
    }
}
