package com.devops.crowdapp.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;


@Entity
@Table(name = "project")
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable =false)
    private ProjectCategory category;

    private String sku;

    private String name;

    private String description;

    @Column(name = "donation_price")
    private BigDecimal donationPrice;

    @Column(name = "image_url")
    private String imageUrl;

    private boolean active;

    @Column(name = "date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name = "last_updated")
    @UpdateTimestamp
    private Date lastUpdated;

}
