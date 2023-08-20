package com.example.StudyCards;

import java.util.ArrayList;
import java.util.List;

public class TestData {

    public static List<StudyCard> getTestDataset() {
        List<StudyCard> cards = new ArrayList<>();

        // Card 1
        StudyCard card1 = new StudyCard(1, "Science", "The study of the physical and natural world through observation and experimentation.");
        cards.add(card1);

        // Card 2
        StudyCard card2 = new StudyCard(2, "History", "The study of past events, particularly in human affairs.");
        cards.add(card2);

        // Card 3
        StudyCard card3 = new StudyCard(3, "Technology", "The application of scientific knowledge for practical purposes, especially in industry and commerce.");
        cards.add(card3);

        // Card 4
        StudyCard card4 = new StudyCard(4, "Sports", "Athletic activities or games involving physical exertion and skill.");
        cards.add(card4);

        // Card 5
        StudyCard card5 = new StudyCard(5, "Music", "The art of arranging sounds in time to produce a composition, through melody, rhythm, and harmony.");
        cards.add(card5);

        // Card 6
        StudyCard card6 = new StudyCard(6, "Literature", "Written works, such as novels, poems, plays, or essays, that are considered to have artistic or intellectual value.");
        cards.add(card6);

        // Card 7
        StudyCard card7 = new StudyCard(7, "Art", "Various creative disciplines that involve the expression or application of human creative skill and imagination.");
        cards.add(card7);

        // Card 8
        StudyCard card8 = new StudyCard(8, "Geography", "The study of the physical features, climate, and inhabitants of the Earth, as well as the relationships between people and their environments.");
        cards.add(card8);

        // Card 9
        StudyCard card9 = new StudyCard(9, "Food", "Any nutritious substance that is consumed to provide nutritional support for the body and satisfy hunger.");
        cards.add(card9);

        // Card 10
        StudyCard card10 = new StudyCard(10, "Movies", "A form of visual entertainment that tells stories through a sequence of moving images, often accompanied by sound.");
        cards.add(card10);

        return cards;
    }
}
