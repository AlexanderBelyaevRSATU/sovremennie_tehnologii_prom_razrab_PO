package ru.rsatu.pojo;

public abstract class Car implements Benzobak{

    protected int massa;  //масса автомобиля
    protected int osi;  //количество осей
    protected String categori;//категория автомобиля
    protected int volume;
    protected int octan;

    public Car(int massa, int osi, String categori, int volume, int octan) {
        this.massa = massa;
        this.osi = osi;
        this.categori = categori;
        this.volume = volume;
        this.octan = octan;
    }

    @Override
    public int getVolume() {

        return this.volume;
    }

    @Override
    public int getOctan() {
        return this.octan;
    }
}
