package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "PortFolio")
public class PortFolio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name = "portfolioId")
    private Long portfolioId;

    @OneToMany(mappedBy = "PortFolio")
    @Column(nullable = false,name = "clientId")
    private Long clientId;

    @Column(nullable = false,name = "creationDate")
    private String creationDate;

    public PortFolio(Long clientId, String creationDate) {
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public PortFolio() {
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Long getClientId() {
        return clientId;
    }

    public String getCreationDate() {
        return creationDate;
    }
}
