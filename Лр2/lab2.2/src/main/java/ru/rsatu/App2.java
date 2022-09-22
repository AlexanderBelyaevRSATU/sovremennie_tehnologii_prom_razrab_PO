package ru.rsatu;

import ru.rsatu.App;
import java.lang.Math;

/**
 * Hello world!
 *
 */
public class App2 
{
    public static void main( String[] args )
    {
        System.out.println( "Привет от первого дочернего проекта" );
    }
    public static void Vivod()
    {
        System.out.println( "Привет от первого дочернего проекта, вызванного вторым как зависимость" );
        System.out.println( "Модуль числа -5, определённый методом abs класса Math равен:" );
        System.out.println( Math.abs(-5));
    }
}
