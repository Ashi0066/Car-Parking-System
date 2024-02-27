//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.InputMismatchException;

public class Menu {
    public Menu() {
    }

    public static void main(String[] args) {
        int MAX = 999;
        AuthorizedCarMap map = new AuthorizedCarMap(MAX);
        FileHandler.ReadCarRecord(map);
        ParkingControl parking = new ParkingControl(MAX);
        FileHandler.parkCarReader(parking);
        int choice = 0;

        do {
            try {
                System.out.println("                                     ");
                System.out.println("   ========================================================");
                System.out.println("   ||                      MENU                          ||");
                System.out.println("   ========================================================");
                System.out.println("                                                           ");
                System.out.println("   || 1. Register A car               ||");
                System.out.println("   || 2. Delete A car                 ||");
                System.out.println("   || 3. List Of All Registered Cars  ||");
                System.out.println("   || 4. Check Registered Car         ||");
                System.out.println("   || 5. Number Of Registered Cars    ||");
                System.out.println("   || 6. Park Car                     ||");
                System.out.println("   || 7. un-Park Car                  ||");
                System.out.println("   || 8. Number of Parked Car         ||");
                System.out.println("   || 9. All Parked Cars              ||");
                System.out.println("   || 10.Exit                         ||");
                System.out.println("   || Choose an option from (1-10)  ||");
                System.out.println("Please Enter your choice:- ");
                choice = EasyScanner.nextInt();
                switch (choice) {
                    case 1:
                        RegisterCarChoice(map);
                        break;
                    case 2:
                        DeleteCarChoice(map);
                        break;
                    case 3:
                        showcarsChoice(map);
                        break;
                    case 4:
                        checkRegisteredCar(map);
                        break;
                    case 5:
                        NumberofRegisteredCarChoice(map);
                        break;
                    case 6:
                        ParkCarChoice(parking, map);
                        break;
                    case 7:
                        UnParkCarChoice(parking);
                        break;
                    case 8:
                        NumberofParkedCarChoice(parking);
                        break;
                    case 9:
                        ParkedcarlistChoice(parking);
                        break;
                    case 10:
                        SaveAndquit(map, parking);
                        break;
                    default:
                        System.out.println("Invalid input,Please Choose option 1-10  ");
                }
            } catch (InputMismatchException var6) {
                System.out.println("Invalid input. Please enter a number between 1 and 10.");
            }
        } while(choice != 10);

    }

    static void RegisterCarChoice(AuthorizedCarMap mapin) {
        System.out.println("please enter car details");
        System.out.println("Vehicle Name");
        String VehicleName = "";
        boolean validCarName = false;

        while(!validCarName) {
            try {
                VehicleName = EasyScanner.nextString();
                if (!VehicleName.isEmpty()) {
                    validCarName = true;
                } else {
                    System.out.println("Vehicle Name can not be empty");
                }
            } catch (InputMismatchException var11) {
                System.out.println("Invalid input. Please enter a valid Vehicle Name.");
            }
        }

        System.out.println("Vehicle Registration");
        String VehicleRegisteration = "";
        boolean validRegistrationNumber = false;

        while(!validRegistrationNumber) {
            try {
                VehicleRegisteration = EasyScanner.nextString();
                if (!VehicleRegisteration.isEmpty()) {
                    validRegistrationNumber = true;
                } else {
                    System.out.println("Vehicle Registration can not be empty");
                }
            } catch (InputMismatchException var10) {
                System.out.println("Invalid input. Please enter a valid Vehicle registartion .");
            }
        }

        System.out.println("Vehicle Owner's Name");
        String OwnersName = "";
        boolean validOwnersName = false;

        while(!validOwnersName) {
            try {
                OwnersName = EasyScanner.nextString();
                if (!OwnersName.isEmpty()) {
                    validOwnersName = true;
                } else {
                    System.out.println("Vehicle Registration can not be empty");
                }
            } catch (InputMismatchException var9) {
                System.out.println("Invalid input. Please enter a valid Vehicle registartion .");
            }
        }

        Car CarIN = new Car(VehicleName, VehicleRegisteration, OwnersName);
        if (mapin.getcar(VehicleRegisteration) != null) {
            System.out.println(">>>>>>>>");
            System.out.println("Vehicle has been already been registered");
            System.out.println(">>>>>>>>");
        } else if (!mapin.isFull()) {
            boolean success = mapin.addCar(CarIN);
            if (success) {
                System.out.println(">>>>>>>>");
                System.out.println("Vehicle has been registered");
                System.out.println(">>>>>>>>");
            }
        } else {
            System.out.println(">>>>>>>>");
            System.out.println("All the parking Spots Has been registered ");
            System.out.println(">>>>>>>>");
        }

    }

    static void NumberofParkedCarChoice(ParkingControl parking) {
        System.out.println(">>>>>>>>");
        System.out.println("There are " + parking.NumberofParkedCars() + " Vehicle Registered");
        System.out.println(">>>>>>>>");
    }

    static void DeleteCarChoice(AuthorizedCarMap mapin) {
        System.out.println("Please enter car Registration Number");
        String registrationNumber = "";
        boolean validRegistrationcheck = false;

        while(!validRegistrationcheck) {
            try {
                registrationNumber = EasyScanner.nextString();
                if (!registrationNumber.isEmpty()) {
                    validRegistrationcheck = true;
                } else {
                    System.out.println("Vehicle Registration can not be empty");
                }
            } catch (InputMismatchException var4) {
                System.out.println("Invalid input. Please enter a valid Vehicle registartion .");
            }
        }

        boolean success = mapin.removeCar(registrationNumber);
        if (success) {
            System.out.println(">>>>>>>>");
            System.out.println("Vehicle removed " + registrationNumber);
            System.out.println(">>>>>>>>");
        } else {
            System.out.println(">>>>>>>>");
            System.out.println("Vehicle does not exist ");
            System.out.println(">>>>>>>>");
        }

    }

    static void showcarsChoice(AuthorizedCarMap mapin) {
        if (mapin.isEmpty()) {
            System.out.println("Map is Empty");
        } else {
            System.out.println(">>>>>>>>");
            System.out.println(mapin);
            System.out.println(">>>>>>>>");
        }

    }

    static void checkRegisteredCar(AuthorizedCarMap mapin) {
        System.out.println("Enter the car registration number");
        String regisatration = EasyScanner.nextString();
        if (mapin.getcar(regisatration) != null) {
            System.out.println(">>>>>>>>");
            System.out.println("the car number  " + regisatration + " is registered ");
            System.out.println(">>>>>>>>");
        } else {
            System.out.println(">>>>>>>>");
            System.out.println("the Car number  " + regisatration + " is not registered");
            System.out.println(">>>>>>>>");
        }

    }

    static void NumberofRegisteredCarChoice(AuthorizedCarMap mapin) {
        System.out.println(">>>>>>>>");
        System.out.println(mapin.numberofRegisteredCars());
        System.out.println(">>>>>>>>");
    }

    static void ParkCarChoice(ParkingControl parking, AuthorizedCarMap mapin) {
        System.out.println("Enter Plate Number");
        String Registration = EasyScanner.nextString();
        Car car = mapin.getcar(Registration);
        if (car == null) {
            System.out.println(">>>>>>>>");
            System.out.println("This Car " + Registration + " in not registered in the System");
            System.out.println(">>>>>>>>");
        } else if (parking.isFull()) {
            System.out.println(">>>>>>>>");
            System.out.println("The Car park is full");
            System.out.println(">>>>>>>>");
        } else {
            boolean parked = parking.parkCar(Registration, mapin);
            if (!parked) {
                return;
            }

            System.out.println(">>>>>>>>");
            System.out.println("car " + Registration + " has been Parked");
            System.out.println(">>>>>>>>");
        }

    }

    static void UnParkCarChoice(ParkingControl parking) {
        System.out.println("Enter the registration of the vehicle you want to remove from the parking ");
        String Registration = EasyScanner.nextString();
        boolean success = parking.unPark(Registration);
        if (success) {
            System.out.println(">>>>>>>>");
            System.out.println("Car " + Registration + " Has been removed");
            System.out.println(">>>>>>>>");
        } else {
            System.out.println(">>>>>>>>");
            System.out.println("Car " + Registration + " Doe Not exist ");
            System.out.println(">>>>>>>>");
        }

    }

    static void ParkedcarlistChoice(ParkingControl parkingin) {
        System.out.println(parkingin.toString());
    }

    public static void SaveAndquit(AuthorizedCarMap mapin, ParkingControl parkingControl) {
        FileHandler.saveCarRecord(mapin);
        FileHandler.carParkFile(parkingControl);
    }
}
