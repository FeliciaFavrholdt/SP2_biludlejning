package RentACar;

/*
Abstrakt Klasse AFuelCar. Denne klasse skal nedarve fra Acar. Den skal tilføje to metoder:
a. abstract String getFuelType(); // should return “Gasoline” or “Diesel”
b. int kmPrLitre(); // should return how many kilometres the car can drive on 1 litre of fuel
Lav en attribut til at gemme kilometer per liter og initialisér den i konstruktøren.
 */

public abstract class AFuelCar extends ACar {
    //FIELDS
    protected int kmPrLitre;
    protected String fuelType = "";

    //CONSTRUCTOR
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, String fuelType) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
        this.fuelType = fuelType;
    }

    // should return “Gasoline” or “Diesel”
    public abstract String getFuelType(String fuelType);

    // should return how many kilometres the car can drive on 1 litre of fuel
    int kmPrLitre(){
        return kmPrLitre;
    }

    //TOSTRING
    @Override
    public String toString() {
        return  super.toString() + kmPrLitre + fuelType;
    }
}
