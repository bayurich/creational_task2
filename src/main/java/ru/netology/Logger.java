package ru.netology;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

    // В этом поле храним ссылку на тот
    // единственный объект этого класса
    // который будем отдавать пользователям
    private static Logger instance;

    public void log(String msg) {
        System.out.println("[" + getCurrentDate() + " " + num++ + "] " + msg);
    }

    // Запрещаем пользователям пользоваться
    // конструктором нашего класса
    private Logger() {}

    // Пользователи которым нужен объект
    // нашего класса получают всегда один
    // и тот же объект, который мы храним
    // в приватном статичном поле, которое
    // мы заполняем в этом методе если оно
    // до того не было заполнено
    public static Logger getInstance() {
        if (instance == null) {instance = new Logger();}
        return instance;
    }

    private String getCurrentDate(){
        return simpleDateFormat.format(new Date());
    }
}
