package ru.netology.homework5javaqa.homework5.services;


public class RestService {

    public int calcCount(int income, int expenses, int threshold) {
        int money = 0; //средства на р/с
        int count = 0; // счётчик месяцев отдыха

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем отдыхать
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) /3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}