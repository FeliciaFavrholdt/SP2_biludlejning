package RentACar;

/*
Abstrakt klasse ACar. Skal implementere Car interfacet og alle metoderne i dette,
undtagen getRegistrationFee(), som skal implementers i de konkrete klasser (i punkt 4,5 og 6).
Lav klasse attributter til at holde styr på registreringsnummer (nummerplade), mærke, model og antal døre.
(Husk at bruge engelske navne til alt). Overvej hvilke attributter det giver mening at lave final.
 */


public abstract class ACar implements Car {
    //FIELDS
    private String registrationNumber;
    final protected String make;
    final protected String model;
    final protected int numberOfDoors;

    //CONSTRUCTOR
    protected ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    //GETTERS
    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public String toString() {
        String stringT = "\nTHIS IS A REGISTERED CAR:";
        String stringMa = "\nCar make: " + make;
        String stringMo = "\nCar model: " + model;
        String stringD = "\nNumber of doors: " + numberOfDoors;
        String stringR = "\nNumber plate: " + registrationNumber;

        return stringT + stringMa + stringMo + stringD + stringR;
    }
}
