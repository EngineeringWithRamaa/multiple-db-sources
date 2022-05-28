package com.engineeringwithramaa.multipledatasources.model.cardholder;

import javax.persistence.*;

@Entity
@Table(name = "cardholder", schema = "cardholderdb")
public class CardHolder {
    @Id
    private Long id;
    private String cardNumber;
    private String memberId;

    public CardHolder() {
    }

    public CardHolder(Long id, String cardNumber, String memberId) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.memberId = memberId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return "CardHolder{" +
                "id=" + id +
                ", cardNumber='" + cardNumber + '\'' +
                ", memberId='" + memberId + '\'' +
                '}';
    }
}
