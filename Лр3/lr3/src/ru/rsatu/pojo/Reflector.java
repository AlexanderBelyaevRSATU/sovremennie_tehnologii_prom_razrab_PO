package ru.rsatu.pojo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflector {

    public void printMetodsandPrintParam(Class clazz) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("Информация о классе "+clazz.getName()+" полученная с помощью рефлексии");

        //методы
        System.out.println("Методы класса:");
        Method metods[] = clazz.getMethods();   //подучение методов класса
        for (Method m :metods){
            System.out.println(m);  //вывод названий методов класса
        }
        System.out.println();

        //поля
        System.out.println("Поля класса:");
        Field polia[]=clazz.getDeclaredFields();    //получение полей класса (без полей родительского класса)
        Field nasledpolia[]=clazz.getSuperclass().getDeclaredFields();
        for(Field f :polia){
            System.out.println(f);  //вывод полей
        }
        for(Field f :nasledpolia){
            System.out.println(f);  //вывод полей
        }


        //родитель
        System.out.println();
        Class supercl=clazz.getSuperclass();        //получение класса-родителя
        System.out.println("Родительский класс:");
        System.out.println(supercl.getName());

        System.out.println();
        System.out.println("Следующая строка выведена приватным методом, вызванным с помощью рефлексии");
        Method metod= clazz.getDeclaredMethod("printOpisanie");     //получение приватного метода по его имени
        metod.setAccessible(true);
        metod.invoke(new Object()); //вызов метода с помощью рефлексии

    }




}
