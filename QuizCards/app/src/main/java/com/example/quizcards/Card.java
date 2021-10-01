package com.example.quizcards;

import java.util.ArrayList;
import java.util.Arrays;

public class Card {
    ArrayList<String> englishCard = new ArrayList<>(
            Arrays.asList("Keyboard", "Mouse", "Printer", "Cooler", "Headphones", "VideoCard")
    );
    ArrayList<String> russianCard = new ArrayList<>(
            Arrays.asList("Экран", "Клавиатура", "Мышь", "Принтер", "Кулер", "Наушники", "Видеокарта")
    );

    ArrayList<String> sitiesCard = new ArrayList<>(
            Arrays.asList("Нью-йорк","Пекин","Токио","Берлин","Монтевидео","Богота")
    );
    ArrayList<String> countriesCard = new ArrayList<>(
            Arrays.asList("Россия","США","Китай","Япония","Германия","Уругвай", "Колумбия")
    );

    public int flipIndex = 0;
    public int flippedIndex = 0;
    public int count = 1;
    public int countCard = 0;
    public int rememberCard = 0;
    public int amount = russianCard.size();
}