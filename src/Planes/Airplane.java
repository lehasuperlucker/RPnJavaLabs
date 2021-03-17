package Planes;

import java.util.Objects;

public abstract class Airplane { //Абстрактный класс самолёта. Абстрактный - значит нельзя создавать его экземпляры,
    //он лишь служит базовым классом для остальных классов в иерархии наследования.
    //protected - модификатор доступа, который позволяет получать доступ к члену класса только из самого класса
    //или его наследников
    protected int capacity; //целочисленное поле, показывающее численность экипажа
    protected int carryingCapacity; //целочисленное поле, показывающее максимальную грузоподъёмность
    protected int rangeOfFlight; // целочисленное поле, показывающее дальность полёта на одном баке топлива
    protected int fuelConsumption; // целочисленное поле, показывающее расход топлива на 1000км

    // констуктор класса с параметрами, внутри него создаётся экземпляр класса с параметрами, которые мы передали в конструктор
    protected Airplane(int capacity, int carryingCapacity, int rangeOfFlight, int fuelConsumption) {
        this.capacity = capacity; // Все методы класса вызываются экземплярами класса(если они не static). This - ключевое слово
        //которое указывает на объект, который вызвал данный метод.
        this.carryingCapacity = carryingCapacity;
        this.rangeOfFlight = rangeOfFlight;
        this.fuelConsumption = fuelConsumption;
    }

    public int getCapacity()
    {
        return capacity;
    } // метод класса, который возвращает вместимость пассажиров(ну или численность экипажа)

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    } // задаёт численность экипажа самолёта

    public int getCarryingCapacity() {
        return carryingCapacity;
    } //возвращает грузоподъёмность самолёта

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }// задаёт грузоподъёмность самолёта

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }//возвращает дальность полёта

    public void setRangeOfFlight(int rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }// задаёт дальность полёта

    public int getFuelConsumption() {
        return fuelConsumption;
    } //возвращает расход топлива

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }//задаёт расход топлива

    //@Override - аннотация, которая обозначает что данный метод переопределяет метод родительского класса.
    // В данном случае класс неявно наследуется от класса object, и именно его метод и будет переопределён.
    @Override
    public boolean equals(Object o) { //данный метод на вход получает какой-то объект и сравнивает этот объект с
        // текущим(который вызвал метод)
        if (this == o) return true; // обычный оператор сравнения == сраниваниает ссылки на эти объекты в памяти.
        // Если ссылки одинаковые, то это по факту один и тот же объект
        if (!(o instanceof Airplane)) return false; // instanceof - проверяет, является ли объект экземпляром класса.
        // Возваращает true или false
        Airplane airplane = (Airplane) o; // в круглых скобках здесь объект о явно приводится к типу Airplane, так как Airplane это потомок класса Object
        // и мы можем так сделать
        return getCapacity() == airplane.getCapacity() && getCarryingCapacity() == airplane.getCarryingCapacity() && getRangeOfFlight() == airplane.getRangeOfFlight() && getFuelConsumption() == airplane.getFuelConsumption();
    }

    @Override
    public int hashCode() { //вычисляет хеш-сумму объекта. Она вообще нужна для сравнения объектов, но не ебу нахуя,
        // если каждый раз метод сравнения переопределяется по-своему и не использует хеш объекта
        return Objects.hash(getCapacity(), getCarryingCapacity(), getRangeOfFlight(), getFuelConsumption());
    }
}