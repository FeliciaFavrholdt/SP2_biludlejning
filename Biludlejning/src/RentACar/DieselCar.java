package RentACar;

/*
Klasse DieselCar. Denne klasse nedarver også fra AFuelCar og skal også implementere de to abstrakte metoder getFuelType() og getRegistrationFee().
Herudover skal der være en metode, hasParticleFilter(), der fortæller om bilen har et partikelfilter monteret.

Registreringsafgiften skal beregnes ud fra beskrivelsen:
For en Dieselbil er der samme afgift som for benzinbilen, plus en udligningsafgift, som også er afhængig af km/l.
Hvis bilen kører mellem 20 km/l og 50 km/l er udligningsafgiften 130 kr,
kører den mellem 15 km/l og 20 km/l er den 1390 kr,
kører den mellem 10 km/l og 15 km/l er den 1850 kr,
kører den mellem 5 km/l og 10 km/l er den 2770 kr,
og kører den under 5 km/l er den 15260 kr.
Der er desuden en partikeludledningsafgift på 1000 kr hvis bilen ikke har et partikelfilter monteret.
 */

public class DieselCar extends AFuelCar {
    //FIELDS
    boolean particleFilter;
    String fuelType = getFuelType("Diesel");

    //CONSTRUCTOR
    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, String fuelType, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre, fuelType);
        this.particleFilter = hasParticleFilter(particleFilter);
    }

    public boolean hasParticleFilter(boolean particleFilter) {
        return particleFilter;
    }

    @Override
    public String getFuelType(String fuelType) {
        return fuelType;
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee;
        int particleCost = 1000;

        if (kmPrLitre >= 21) {
            registrationFee = 130;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            registrationFee = 1390;
        } else if (kmPrLitre >= 10 && kmPrLitre < 14) {
            registrationFee = 1850;
        } else if (kmPrLitre >= 5 && kmPrLitre < 9) {
            registrationFee = 2770;
        } else {
            registrationFee = 15260;
        }

        if(!particleFilter) {
            registrationFee += particleCost;
        }
        return registrationFee;
    }

    //TOSTRING
    @Override
    public String toString() {
        String stringFuel = "\nFuel type: " + fuelType;
        String stringP = "\nParticle filter: " + particleFilter;

        return super.toString() + stringFuel + stringP;
    }
}

