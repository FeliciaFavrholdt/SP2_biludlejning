package RentACar;

/*
Der skal laves en klasse FleetOfCars, der indeholder en ArrayList<Car>, der kan indeholde alle bilerne,
som udlejningsfirmaet råder over. Klassen skal indeholde en metode til at tilføje en bil til flåden.
Den skal overskrive toString(), så den returnerer en String, der lister alle bilerne i flåden.
Sidst men ikke mindst skal den have en metode, getTotalRegistrationFeeForFleet(), der beregner
den samlede registreringsafgift for hele bilflåden.
 */

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<Car>();

      public ArrayList<Car> getFleet() {
        return fleet;
    }

    public void addCar(Car car) {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalRegistrationFee = 0;
        for (Car c : fleet) {
            totalRegistrationFee += c.getRegistrationFee();
        }
        return totalRegistrationFee;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "The total registration fee for all cars is: " + getTotalRegistrationFeeForFleet();
    }
}

