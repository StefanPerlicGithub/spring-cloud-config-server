package com.ftn.delete.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private String telephoneNumber;
    @OneToMany(mappedBy = "employee")
    @JsonIgnore
    private List<Receipt> receipts;
    @ManyToOne
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee boss;
    @OneToMany(mappedBy = "boss")
    @JsonIgnore
    private List<Employee> employees;

    public Long getId() {
         return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
         return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
         return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTelephoneNumber() {
         return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public List<Receipt> getReceipts() {
         return receipts;
    }

    public void setReceipts(List<Receipt> receipts) {
        this.receipts = receipts;
    }

    public Employee getBoss() {
         return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public List<Employee> getEmployees() {
         return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
