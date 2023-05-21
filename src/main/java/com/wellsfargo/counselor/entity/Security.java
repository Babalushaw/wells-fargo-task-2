package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "security")
public class Security {
    @Id
    @Column(nullable = false,name = "securityId")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long securityId;
    @Column(nullable = false,name = "portfolioId")
    @OneToMany(mappedBy = "security")
    private Long portfolioId;
    @Column(nullable = false,name = "name")
    private String name;
    @Column(nullable = false,name="category")
    private String category;
    @Column(nullable = false,name="purchasedPrice")
    private float purchasedPrice;
    @Column(nullable = false,name = "purchasedDate")
    private String purchasedDate;
    @Column(nullable = false, name = "quantity")
    private Long quantity;

    public Security(Long portfolioId, String name, String category, float purchasedPrice, String purchasedDate, Long quantity) {
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasedPrice = purchasedPrice;
        this.purchasedDate = purchasedDate;
        this.quantity = quantity;
    }

    public Security() {
    }

    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPurchasedPrice(float purchasedPrice) {
        this.purchasedPrice = purchasedPrice;
    }

    public void setPurchasedDate(String purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public float getPurchasedPrice() {
        return purchasedPrice;
    }

    public String getPurchasedDate() {
        return purchasedDate;
    }

    public Long getQuantity() {
        return quantity;
    }
}
