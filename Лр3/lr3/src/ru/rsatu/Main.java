package ru.rsatu;

import ru.rsatu.pojo.Car;
import ru.rsatu.pojo.Gruzovik;
import ru.rsatu.pojo.Reflector;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public  class Main {


    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //создание объекта - грузовика
        Gruzovik Zil=new Gruzovik("ЗИЛ-131",2000,3,"C",150,92);


        //вывод информации о грузокике
        System.out.println("Модель: "+Zil.getModel());
        System.out.println("Объём бензобака: "+Zil.getVolume());
        System.out.println("Бензин: АИ-"+Zil.getOctan());
        System.out.println();

        //работа с рефлексией
        Reflector reflect = new Reflector();

        reflect.printMetodsandPrintParam(Gruzovik.class);


        //Коллеклии
        //List
        System.out.println();
        System.out.println("Работа с коллекцией List");
        List<Gruzovik> listGruz=new LinkedList<Gruzovik>();
        listGruz.add(Zil);     //добавление существующего объекта
        listGruz.add(new Gruzovik("Газель",1500,2,"B",70,92));     //добаление нового объекта

        //вывод информации обо всех элементах списка
        for(Gruzovik g:listGruz){
            System.out.println("Модель: "+g.getModel());
            System.out.println("Объём бензобака: "+g.getVolume());
            System.out.println("Бензин: АИ-"+g.getOctan());
            System.out.println();
        }

        //Set
        System.out.println();
        System.out.println("Работа с коллекцией Set");

        Set<Gruzovik> setGruz= new HashSet<Gruzovik>();
        setGruz.add(Zil);   //добаление существующего объекта
        setGruz.add(Zil);       //попытка повторного добавления
        System.out.println("Количество элементов во множестве: "+setGruz.stream().count());

        //Map

        System.out.println();
        System.out.println("Работа с коллекцией Map");
        HashMap<String,Car> baza = new HashMap<>();     //создание словаря, ключ - строка (номер автомобиля), значение - объект Car
        Gruzovik Kamaz=new Gruzovik("КамАЗ",2500,3,"C",200,0);  //создание нового грузовика

        baza.put("А001АА76",Zil);   //добавление автомобилей в базу
        baza.put("О111ОО76",Kamaz);
        baza.put("P222TT76",Zil);

        System.out.println("Количество автомобилей в базе: "+baza.size());
        System.out.println("Автомобиль с номером О111ОО76 имеет объём бензобака: "+baza.get("О111ОО76").getVolume() );  //получение сведений об автомобиле по его номеру

        //работа с Generics
        System.out.println();
        //вывод данных с помощью обощённого метода
        print(Kamaz.getModel());
        print(Kamaz.getVolume());



    }

    public static <T> void print(T value){
        System.out.println("Тип выводимого значения: "+value.getClass().getName());
        System.out.println("Значение: "+value);
    }


}
