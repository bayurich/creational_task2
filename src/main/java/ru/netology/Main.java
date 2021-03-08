package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");

        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка:");
        int size = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        int maxValue = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        Random random = new Random();
        List<Integer> source = new ArrayList<>();
        for (int i =0; i <= size - 1; i++){
            source.add(random.nextInt(maxValue));
        }
        logger.log("Вот случайный список:");
        logger.log(source.toString());

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int threshold = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(threshold);
        List<Integer> result = filter.filterOut(source);

        logger.log("Выводим результат на экран");
        logger.log("Отфильтрованный список:");
        logger.log(result.toString());

        logger.log("Завершаем программу");
    }
}
