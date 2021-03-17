package com.company;


import Company.AirplaneCompany;
import Planes.Airplane;
import Planes.CargoPlane;
import Planes.Kukuruznik;
import Planes.PassengerPlane;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        AirplaneCompany BelAvia = new AirplaneCompany("BelAvia");
        BelAvia.AddPlane(new Kukuruznik(2, 500,
                1600, 20, 60));
        BelAvia.AddPlane(new PassengerPlane(200, 3000,
                12000, 250, 10));
        BelAvia.AddPlane(new CargoPlane(10, 10000,
                5000, 300, 625));

        int totalCarryingCapacity = BelAvia.CalculateTotalCarryingCapacity();
        System.out.print("Общая грузоподъёмность воздушных судов авиакомпании: " + totalCarryingCapacity + '\n');
        int totalCapacity = BelAvia.CalculateTotalCapacity();
        System.out.print("Общая вместимость воздушных судов авиакомпании: " + totalCapacity + '\n');
        System.out.print("\nСписок воздушных судов компании до сортировки по дальности полёта: \n\n");
        BelAvia.ShowPlanes();
        BelAvia.sortPlanesByFlightRange();
        System.out.print("\nСписок воздушных судов компании после сортировки по дальности полёта: \n\n");
        BelAvia.ShowPlanes();
        ArrayList<Airplane> listOfPlanes = BelAvia.findPlanesByFuelConsumption(200, 350);
        System.out.print("\nСписок воздушный судов, чей расход топлива попадает в заданный диапазон\n\n");
        int i = 1;
        for (Airplane airplane: listOfPlanes) {
            System.out.print(i + ": " + airplane.toString());
            i++;
        }
    }
}
