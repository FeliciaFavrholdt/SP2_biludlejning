package RentACar;

/*
Klasse ElectricCar. Denne klasse nedarver fra ACar. Den skal tilføje metoderne:
a. getBatteryCapacityKWh(); // returns the battery capacity in kilowatt hours
b. getMaxRangeKm(); // returns the maximum range in kilometres.
c. getWhPrKm(); // returns the power consumption in watt hours per driven kilometre.
Lav attributer til battery capacity og max range, som initialiseres i konstruktøren.
Beregn watt-timer per kilometer ud fra disse to attributter.

For en Elbil gælder de samme regler som for en benzinbil,
blot skal man først omregne watt-timer pr kilometer til km/l.
Det gøres ved at dividere Wh/km med 91,25 og dernæst dividere 100 med dette tal.
Se evt. formlen her: https://fdm.dk/alt-om-biler/dine- rettigheder/boder-afgifter/ejerafgift-elbil.
 */

public class ElectricCar extends ACar {
    //FIELDS
    protected int maxRange;
    protected int batteryCapacity;

    //CONSTRUCTOR
    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int maxRange, int batteryCapacity) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    //METHODS

    // returns the battery capacity in kWh
    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    // returns the maximum range in kilometres
    public int getMaxRangeKm() {
        return maxRange;
    }

    // returns the power consumption in watt hours per driven kilometre
    public int getWhPrKm() {
        return (batteryCapacity/maxRange) * 1000;
    }

    //GETTERS
    @Override
    public String getRegistrationNumber() {
        return super.getRegistrationNumber();
    }

    @Override
    public String getMake() {
        return super.getMake();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getNumberOfDoors() {
        return super.getNumberOfDoors();
    }

    @Override
    public int getRegistrationFee() {
        int registrationFee;
        int whPrKm = getWhPrKm()/91;

        if (whPrKm >= 21) {
            registrationFee = 330;
        } else if (whPrKm >= 15 && whPrKm < 20) {
            registrationFee = 1050;
        } else if (whPrKm >= 10 && whPrKm < 14) {
            registrationFee = 2340;
        } else if (whPrKm >= 5 && whPrKm < 9) {
            registrationFee = 5500;
        } else {
            registrationFee = 10470;
        }
        return registrationFee;
    }

    //TOSTRING
    @Override
    public String toString() {
        String stringMR = "\nThe max range in kilometres is: " + maxRange;
        String stringBC = "\nThe battery capacity in kWh is: " + batteryCapacity;

        return super.toString() + stringMR + stringBC;
    }
}
