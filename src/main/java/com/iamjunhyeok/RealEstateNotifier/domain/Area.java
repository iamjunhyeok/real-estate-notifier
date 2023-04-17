package com.iamjunhyeok.RealEstateNotifier.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Getter
@Entity
public class Area extends DateTime {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "area_id", nullable = false)
    private Long id;

    private String name;

    private float latitude;

    private float longitude;

    private int orders;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Area parent;
}
