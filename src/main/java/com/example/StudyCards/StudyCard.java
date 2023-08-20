package com.example.StudyCards;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class StudyCard {

    @Id
    @SequenceGenerator(
        name = "studycard_id_sequence",
        sequenceName = "studycard_id_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "studycard_id_sequence"
    )

    Integer id;
    String title;
    String description;


    public StudyCard() {
    }

    public StudyCard(Integer id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StudyCard id(Integer id) {
        setId(id);
        return this;
    }

    public StudyCard title(String title) {
        setTitle(title);
        return this;
    }

    public StudyCard description(String description) {
        setDescription(description);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof StudyCard)) {
            return false;
        }
        StudyCard studyCard = (StudyCard) o;
        return Objects.equals(id, studyCard.id) && Objects.equals(title, studyCard.title) && Objects.equals(description, studyCard.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", description='" + getDescription() + "'" +
            "}";
    }
    
}
