package ru.rsatu.pojo;

public class Gruzovik extends Car{

    protected String model;//модель автомобиля

    public String getModel() {
        return model;
    }

    private static void printOpisanie(){
        System.out.println("Объект данного класса может содержать информацию о каком-либо грузовике");
    }

    public Gruzovik(String model, int massa, int osi, String categori, int volume, int octan){
       super(massa, osi, categori, volume, octan);
       this.model=model;

    }

}
