package Planes;

import java.util.Objects;

public abstract class Airplane {
    protected int capacity;
    protected int carryingCapacity;
    protected int rangeOfFlight;
    protected int fuelConsumption;

    protected Airplane(int capacity, int carryingCapacity, int rangeOfFlight, int fuelConsumption) {
        this.capacity = capacity;
        this.carryingCapacity = carryingCapacity;
        this.rangeOfFlight = rangeOfFlight;
        this.fuelConsumption = fuelConsumption;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    public void setRangeOfFlight(int rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airplane)) return false;
        Airplane airplane = (Airplane) o;
        return getCapacity() == airplane.getCapacity() && getCarryingCapacity() == airplane.getCarryingCapacity() && getRangeOfFlight() == airplane.getRangeOfFlight() && getFuelConsumption() == airplane.getFuelConsumption();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCapacity(), getCarryingCapacity(), getRangeOfFlight(), getFuelConsumption());
    }
}