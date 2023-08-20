package com.example.StudyCards;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyCardRepository 
        extends JpaRepository<StudyCard, Integer> {
    
}
