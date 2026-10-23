package com.antaraa.backend.repository;

import com.antaraa.backend.model.TarotCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarotRepository extends JpaRepository<TarotCard, Long> {}