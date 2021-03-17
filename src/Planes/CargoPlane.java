package Planes;

import java.util.Objects;

public class CargoPlane extends Airplane {

    private double cargoHoldSize;

    public CargoPlane(int capacity, int carryingCapacity, int rangeOfFlight, int fuelConsumption, double cargoHoldSize) {
        super(capacity, carryingCapacity, rangeOfFlight, fuelConsumption);
        this.cargoHoldSize = cargoHoldSize;
    }

    public double getCargoHoldSize() {
        return cargoHoldSize;
    }

    public void setCargoHoldSize(double cargoHoldSize) {
        this.cargoHoldSize = cargoHoldSize;
    }

    @Override
    public String toString() {
        return "Грузовой самолёт: " +
                "\nвместимость, чел = " + capacity +
                ", \nгрузоподъёмность, кг = " + carryingCapacity +
                ", \nдальность полёта, дальность полёта = " + rangeOfFlight +
                ", \nрасход топлива, л/1000км = " + fuelConsumption +
                ", \nразмер грузового отсека, м3 = " + cargoHoldSize +
                ".\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoPlane)) return false;
        CargoPlane that = (CargoPlane) o;
        return capacity == that.capacity && carryingCapacity == that.carryingCapacity &&
                rangeOfFlight == that.rangeOfFlight && fuelConsumption == that.fuelConsumption &&
                cargoHoldSize == that.cargoHoldSize;
    }
}
