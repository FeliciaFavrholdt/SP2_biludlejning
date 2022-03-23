package RentACar;

/*
Interface Car. Skal have følgende metoder:
a. String getRegistrationNumber(); //The number on the number plate
b. String getMake(); // The make of the car e.g. Audi
c. String getModel(); // The model of the car e.g. A6
d. Int getNumberOfDoors(); // The number of doors
e. Int getRegistrationFee(); // Calculates the registration fee for the car
 */

public interface Car {
    //Number plate of car
    String getRegistrationNumber();

    // Make of car
    String getMake();

    // Model of car
    String getModel();

    // Number of doors in car
    int getNumberOfDoors();

    // Registration fee for the car
    int getRegistrationFee();
}