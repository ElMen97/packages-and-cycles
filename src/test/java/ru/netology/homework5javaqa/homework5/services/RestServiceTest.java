package ru.netology.homework5javaqa.homework5.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/count.csv")
    void shouldCalculate1(int income, int expenses, int threshold, int expected) {
        RestService service = new RestService();
        int actual = service.calcCount(income, expenses, threshold);
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    void shouldCalculate2() {
//        RestService service = new RestService();
//
//        // подготавливаем данные:
//        int income = 100000; // доход от работы
//        int expenses = 60000; // обязательные месячные траты
//        int threshold = 150000; // граничная сумма дохода на счету
//
//        int expected = 2; // отдохнуть удастся * месяца в году
//
//        int actual = service.calcCount(income, expenses, threshold);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//
//    }
}

