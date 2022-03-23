package RentACar;

/*
Klasse GasolineCar. Denne klasse nedarver fra AFuelCar og skal implementerede to abstrakte metoder getFuelType() og getRegistrationFee().

Registreringsafgiften skal beregnes ud fra beskrivelsen:
For en Benzinbil er afgiften afhængig af kilometer pr liter.
Hvis den kører mellem 20 km/l og 50 km/l er prisen 330 kr,
mellem 15 km/l og 20 km/l er prisen 1050 kr,
mellem 10 km/l og 15 km/l er prisen 2340 kr,
mellem 5 km/l og 10 km/l er prisen 5500kr,
og under 5 km/l er prisen 10470 kr.
 */

public class GasolineCar extends AFuelCar {
    //FIELDS
    String fuelType = getFuelType("Gasoline");

    //CONSTRUCTOR
    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, String fuelType) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre, fuelType);
    }

    //GETTERS
    @Override
    public String getFuelType(String fuelType) {
        return fuelType;
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee;

        if (kmPrLitre >= 21) {
            registrationFee = 330;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            registrationFee = 1050;
        } else if (kmPrLitre >= 10 && kmPrLitre < 14) {
            registrationFee = 2340;
        } else if (kmPrLitre >= 5 && kmPrLitre < 9) {
            registrationFee = 5500;
        } else {
            registrationFee = 10470;
        }
        return registrationFee;
    }

    //TOSTRING
    @Override
    public String toString() {
        String stringFuel = "\nFueltype: " + fuelType;

        return super.toString() + stringFuel;
    }
}

