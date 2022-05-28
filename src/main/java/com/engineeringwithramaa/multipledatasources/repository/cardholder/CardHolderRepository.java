package com.engineeringwithramaa.multipledatasources.repository.cardholder;

import com.engineeringwithramaa.multipledatasources.model.cardholder.CardHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardHolderRepository extends JpaRepository<CardHolder, Long> {
}
