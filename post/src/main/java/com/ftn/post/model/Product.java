package com.ftn.post.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Double price;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "fk_manufacturer")
    private Manufacturer manufacturer;
    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "supplies", joinColumns = {
            @JoinColumn(name = "fk_product")}, inverseJoinColumns = {@JoinColumn(name = "fk_supplier")})
    private List<Supplier> suppliers;
    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "receipt_product",
            joinColumns = {
            @JoinColumn(name = "fk_product")
    }, inverseJoinColumns = {@JoinColumn(name = "fk_receipt")})
    private List<Receipt> receipts;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "fk_product_type")
    private ProductType productType;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public List<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(List<Receipt> receipts) {
        this.receipts = receipts;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
}
