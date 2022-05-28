package com.engineeringwithramaa.multipledatasources.model.card;

import javax.persistence.*;

@Entity
@Table(name = "card", schema = "carddb")
public class Card {
    @Id
    private Long id;
    private int expirationMonth;
    private int expirationYear;
    private String name;

    public Card() {
    }

    public Card(Long id, int expirationMonth, int expirationYear, String name) {
        this.id = id;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(int expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", expirationMonth=" + expirationMonth +
                ", expirationYear=" + expirationYear +
                ", name='" + name + '\'' +
                '}';
    }
}
