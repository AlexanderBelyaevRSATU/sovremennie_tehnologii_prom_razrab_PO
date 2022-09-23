package ru.rsatu;


import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class App2 
{
    public static void main( String[] args )
    {
        System.out.println( "Привет от первого дочернего проекта" );
    }
    public static void Vivod()
    {
        System.out.println( "Привет от первого дочернего проекта, вызванного вторым как зависимость" );
        System.out.println( "Среднее из чисел 3,5,7, определённый методом getMean() пакета Math3 равен:" );
        double[] values = new double[]{3,5,7};
	DescriptiveStatistics ds = new DescriptiveStatistics();
	ds.addValue(values[0]);
	ds.addValue(values[1]);
	ds.addValue(values[2]);
	System.out.println(ds.getMean());
    }
}
