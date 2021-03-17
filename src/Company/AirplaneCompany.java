package Company;
import Planes.Airplane;

import java.util.ArrayList;
import java.util.Comparator;

public class AirplaneCompany {
    private String name;
    private ArrayList<Airplane> listOfPlanes = new ArrayList<Airplane>();

    public AirplaneCompany(String name){
        this.name = name;
    }

    public AirplaneCompany(String name, ArrayList<Airplane> listOfPlanes) {
        this.name = name;
        this.listOfPlanes = listOfPlanes;
    }

    public void AddPlane(Airplane airplane){
        this.listOfPlanes.add(airplane);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Airplane> getListOfPlanes() {
        return listOfPlanes;
    }

    public int CalculateTotalCapacity () {
        int totalCapacity = 0;
        for (Airplane plane: listOfPlanes) {
            totalCapacity += plane.getCapacity();
        }
        return totalCapacity;
    }

    public int CalculateTotalCarryingCapacity() {
        int totalCarryingCapacity = 0;
        for (Airplane plane: listOfPlanes) {
            totalCarryingCapacity += plane.getCarryingCapacity();
        }
        return  totalCarryingCapacity;
    }

    public void sortPlanesByFlightRange() {
        listOfPlanes.sort(new Comparator<Airplane>() {
            public int compare(Airplane o1, Airplane o2) {
                return Integer.compare(o1.getRangeOfFlight(), o2.getRangeOfFlight());
            }
        });
    }

    public ArrayList<Airplane> findPlanesByFuelConsumption(int lowerRange, int upperRange) {
        ArrayList<Airplane> listOfAcceptablePlanes = new ArrayList<Airplane>();
        for (Airplane plane:
             listOfPlanes) {
            if (lowerRange < plane.getFuelConsumption() && plane.getFuelConsumption() < upperRange)
                listOfAcceptablePlanes.add(plane);
        }
        return listOfAcceptablePlanes;
    }

    public void ShowPlanes() {
        int i = 1;
        for (Airplane plane: listOfPlanes) {
            System.out.print(i + ". " + plane.toString());
            i++;
        }
    }
}
