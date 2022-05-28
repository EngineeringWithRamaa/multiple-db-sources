package com.engineeringwithramaa.multipledatasources.repository.card;

import com.engineeringwithramaa.multipledatasources.model.card.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
