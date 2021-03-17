package Planes;

import java.util.Objects;

public class CargoPlane extends Airplane { //extends - ключевое слово, которое озанчает что данный класс(CargoPlane)
    //наследуется от другого класса(Airplane)

    private double cargoHoldSize; //вещественное числовое поле, которое представляет максимальный объём грузового отсека

    public CargoPlane(int capacity, int carryingCapacity, int rangeOfFlight, int fuelConsumption, double cargoHoldSize) {
        super(capacity, carryingCapacity, rangeOfFlight, fuelConsumption); //super - ключевое слово, которое используется для
        //вызова метода родительского класса, в данном случае конструктора родительского класса
        this.cargoHoldSize = cargoHoldSize;
    } // тоже конструктор с параметрами

    public double getCargoHoldSize() {
        return cargoHoldSize;
    }//возвращает объём грузового отсека

    public void setCargoHoldSize(double cargoHoldSize) {
        this.cargoHoldSize = cargoHoldSize;
    }//задаёт объём грузового отсека

    @Override
    public String toString() { //метод toString возвращает строковое представление объекта, то есть как этот объект можно записать в виде
        //символьной строки
        return "Грузовой самолёт: " +
                "\nвместимость, чел = " + capacity +
                ", \nгрузоподъёмность, кг = " + carryingCapacity +
                ", \nдальность полёта, дальность полёта = " + rangeOfFlight +
                ", \nрасход топлива, л/1000км = " + fuelConsumption +
                ", \nразмер грузового отсека, м3 = " + cargoHoldSize +
                ".\n";// \n - символ перехода на новую строку
    }

    @Override
    public boolean equals(Object o) { // ну тут ниче нового
        if (this == o) return true;
        if (!(o instanceof CargoPlane)) return false;
        CargoPlane that = (CargoPlane) o;
        return capacity == that.capacity && carryingCapacity == that.carryingCapacity && //разве что двойной амперсанд(&&)
                // означает логическое И
                rangeOfFlight == that.rangeOfFlight && fuelConsumption == that.fuelConsumption &&
                cargoHoldSize == that.cargoHoldSize;
    }
}
