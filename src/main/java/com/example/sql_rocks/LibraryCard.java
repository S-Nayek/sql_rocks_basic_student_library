package com.example.sql_rocks;

import jakarta.persistence.*;

@Entity
@Table(name="Library_card")
public class LibraryCard {
    @Id
    private int card_number;
    private int fine;
    private int bookIssued;

    @OneToOne
    @JoinColumn
    User user;

    @Enumerated(value= EnumType.STRING)
    private CardStatus cardStatus;

}
