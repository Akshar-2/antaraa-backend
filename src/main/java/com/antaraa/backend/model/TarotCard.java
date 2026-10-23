package com.antaraa.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarotCard {
    @Id
    private Long id;
    private String name;
    private String arcana;
    private String suit;
    @Column(length = 1000)
    private String uprightMeaning;
    @Column(length = 1000)
    private String reversedMeaning;
    private String keywords;
    private String imageUrl;
}