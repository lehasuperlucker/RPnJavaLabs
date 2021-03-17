package Company;
import Planes.Airplane;

import java.util.ArrayList;
import java.util.Comparator;

public class AirplaneCompany { //класс авиакомпании
    private String name;//имя компании
    private ArrayList<Airplane> listOfPlanes = new ArrayList<Airplane>();//поле класса, которое содержит
    // список самолётов компании

    public AirplaneCompany(String name){
        this.name = name;
    }//конструктор класса с одним параметром - именем компании

    public AirplaneCompany(String name, ArrayList<Airplane> listOfPlanes) {
        this.name = name;
        this.listOfPlanes = listOfPlanes;
    } //конструктор класса, в который еще передаётся список самолётов

    public void AddPlane(Airplane airplane){
        this.listOfPlanes.add(airplane);
    } //метод для добавления самолёта с список самолётов компании

    public String getName() {
        return name;
    } //возвращает имя авиакомпании

    public void setName(String name) {
        this.name = name;
    } //задаёт имя авиакомпании

    public ArrayList<Airplane> getListOfPlanes() {
        return listOfPlanes;
    } //возвращает список самолётов компании

    public int CalculateTotalCapacity () { //метод, который считает общее количество пассажиров
        int totalCapacity = 0; // общая вместимость самолётов компании
        for (Airplane plane: listOfPlanes) { // а это так называемый foreach: цикл for на стероидах: если цикл for
            // повторяет одно и то же действие определённое количество раз, то foreach идёт по последовательности
            // элементов и выполняет определенное действие для каждого элемента
            totalCapacity += plane.getCapacity();//к общей вместимости прибавляет вместимость каждого самолёта
        }
        return totalCapacity;//возвращает рассчитанную общую вместимость
    }

    public int CalculateTotalCarryingCapacity() {// то же самое, только считает общую грузоподъёмность
        int totalCarryingCapacity = 0;
        for (Airplane plane: listOfPlanes) {
            totalCarryingCapacity += plane.getCarryingCapacity();
        }
        return  totalCarryingCapacity;
    }

    public void sortPlanesByFlightRange() { //сортирует самолёты по дальности полёта
        listOfPlanes.sort(new Comparator<Airplane>() {//здесь используется метод сортировки, который есть у коллекции List
            // На вход этот метод принимает компаратор - инструкцию, по которой метод будет сравнивать объекты
            public int compare(Airplane o1, Airplane o2) { //на защите так можешь и сказать - посмотрела как
                // делать компаратор в гугле
                return Integer.compare(o1.getRangeOfFlight(), o2.getRangeOfFlight());//используется метод compare
                // класса Integer, который сравнивает два целых числа(здесь это дальности полётов)
            }
        });
    }

    public ArrayList<Airplane> findPlanesByFuelConsumption(int lowerRange, int upperRange) {
        //этот метод принимает на вход верхнюю и нижнюю границу расхода топлива для поиска
        //и возвращает список самолётов, которые входят в этот диапазон
        ArrayList<Airplane> listOfAcceptablePlanes = new ArrayList<Airplane>();//объявляем пустой список, в который
        // будем добавлять самолёты, подходящие под диапазон
        for (Airplane plane://опять цикл foreach, для каждого самолёта проверяем, попадает ли его расход топлива в
            // требуемый диапазон: если да, то добавляем этот самолёт в ранее созданный список,
            // если нет - просто пропускаем
             listOfPlanes) {
            if (lowerRange < plane.getFuelConsumption() && plane.getFuelConsumption() < upperRange)
                listOfAcceptablePlanes.add(plane);
        }
        return listOfAcceptablePlanes;
    }

    public void ShowPlanes() {//выводит список самолётов авиакомпании
        int i = 1;
        for (Airplane plane: listOfPlanes) {//опять в цикле foreach вызываем метод toString каждого самолёта,
            // который выводит в консоль строковое представление данного самолёта
            System.out.print(i + ". " + plane.toString());
            i++;
        }
    }
}
