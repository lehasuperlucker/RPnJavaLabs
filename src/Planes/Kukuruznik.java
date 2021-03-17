package Planes;


public class Kukuruznik extends Airplane
{
    private int propellerLength;

    public Kukuruznik(int capacity, int carryingCapacity, int rangeOfFlight, int fuelConsumption, int propellerLength) {
        super(capacity, carryingCapacity, rangeOfFlight, fuelConsumption);
        this.propellerLength = propellerLength;
    }



    @Override
    public String toString() {
        return "Кукурузник: " +
                "\nвместимость, чел = " + capacity +
                ", \nгрузоподъёмность, кг = " + carryingCapacity +
                ", \nдальность полёта, км = " + rangeOfFlight +
                ", \nрасход топлива, л/1000км = " + fuelConsumption +
                ".\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kukuruznik)) return false;
        Kukuruznik kukuruznik = (Kukuruznik) o;
        return capacity == kukuruznik.capacity && carryingCapacity == kukuruznik.carryingCapacity &&
                rangeOfFlight == kukuruznik.rangeOfFlight && fuelConsumption == kukuruznik.fuelConsumption &&
                propellerLength == kukuruznik.propellerLength;
    }

    public int getPropellerLength() {
        return propellerLength;
    }

    public void setPropellerLength(int propellerLength) {
        this.propellerLength = propellerLength;
    }
}
