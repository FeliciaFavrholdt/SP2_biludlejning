package RentACar;

//OPGAVEBESKRIVELSE
/* I skal lave et system til en biludlejningsvirksomhed. Systemet skal automatisk kunne beregne den samlede registreringsafgift for hele flåden af bile som udlejningsfirmaet besidder.
De tre konkrete (ikke-abstrakte) klasser, GasolineCar, DieselCar og ElectricCar skal overskrive toString() metoden, så den returnerer en String, der repræsenterer bilen på en overskuelig måde.
Du kan evt. overskrive toString() i Acar klassen, så den returnerer en String med de attributter, der er fælles for alle biler og overskrive toString() i FuelCar klassen så den bruger
super klassens toString() og tilføjer km/l. Herefter kan de tre konkrete klasser kalde deres super-klassers toString() metode og blot tilføje de ekstra attributter, der er i den konkrete biltype.
Skriv en Main-klasse med en main-metode der instantierer et FleetOfCars-objekt og et antal bil- objekter af de 3 konkrete typer. Tilføj bilerne til flåden.
Skriv alle bilerne ud, og kald også getTotalRegistrationFeeForFleet() -metoden og skriv resultatet ud.
 */


public class Main {

    public static void main(String[] args) {
        FleetOfCars fleetOfCars = new FleetOfCars();

        //Diesel cars
        DieselCar dieselCarOne = new DieselCar("FM10083","BMW", "X4 2.0", 5, 17, "", true);
        DieselCar dieselCarTwo = new DieselCar("KN45690","SEAT", "Leon 2.0 TDi", 3, 22, "",true);

        //Gasoline cars
        GasolineCar gasolineCarOne = new GasolineCar("AB21233", "Honda", "Civic 1.6", 3, 28, "");
        GasolineCar gasolineCarTwo = new GasolineCar("DD18361", "Mitsubishi", "Outlander 2.0", 5, 15, "");

        //Electric cars
        ElectricCar electricCarOne = new ElectricCar("NL87294", "Ford Mustang", "Mach-E", 3, 500, 98);
        ElectricCar electricCarTwo = new ElectricCar("PH56239", "Peugeot", "e-2008", 5, 310, 50);

        //Add cars to arraylist
        fleetOfCars.addCar(dieselCarOne);
        fleetOfCars.addCar(dieselCarTwo);
        fleetOfCars.addCar(gasolineCarOne);
        fleetOfCars.addCar(gasolineCarTwo);
        fleetOfCars.addCar(electricCarOne);
        fleetOfCars.addCar(electricCarTwo);

        //outputs all added cars from arraylist
        for (Car c : fleetOfCars.getFleet()) {
            System.out.println(c + "\n");
        }

        //outputs total fee for all cars registered in the arraylist
        System.out.println(fleetOfCars);
    }
}