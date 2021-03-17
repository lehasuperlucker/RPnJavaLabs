package Planes;

public class PassengerPlane extends Airplane{ // класс пассажирского самолёта
    private int numberOfStewardess; // целое число стюардесс, хех)

    public PassengerPlane(int capacity, int carryingCapacity, int rangeOfFlight, int fuelConsumption,
                          int numberOfStewardess) {
        super(capacity, carryingCapacity, rangeOfFlight, fuelConsumption);
        this.numberOfStewardess = numberOfStewardess;
    }

    public int getNumberOfStewardess() {
        return numberOfStewardess;
    } // возвращает число стюардесс

    public void setNumberOfStewardess(int numberOfStewardess) {
        this.numberOfStewardess = numberOfStewardess;
    }
    //задаёт число стюардесс

    @Override
    public String toString() {
        return "Пассажирский лайнер: " +
                "\nвместимость, чел = " + capacity +
                ", \nгрузоподъёмность, кг = " + carryingCapacity +
                ", \nдальность полёта, км = " + rangeOfFlight +
                ", \nрасход топлива, л/1000км = " + fuelConsumption +
                ", \nколичество стюардесс, чел = " + numberOfStewardess +
                ".\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerPlane)) return false;
        PassengerPlane passengerPlane = (PassengerPlane) o;
        return capacity == passengerPlane.capacity && carryingCapacity == passengerPlane.carryingCapacity &&
                rangeOfFlight == passengerPlane.rangeOfFlight && fuelConsumption == passengerPlane.fuelConsumption &&
                numberOfStewardess == passengerPlane.numberOfStewardess;
    }
}
