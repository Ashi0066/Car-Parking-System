//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;

public class ParkingControl {
    public ArrayList<String> Parkinglist;
    private int MaxCapacity;

    public ParkingControl(int Maxin) {
        this.MaxCapacity = Maxin;
        this.Parkinglist = new ArrayList();
    }

    public boolean parkCar(String carRegistration, AuthorizedCarMap authorizedcar) {
        if (this.Parkinglist.size() < this.MaxCapacity) {
            if (authorizedcar.getcar(carRegistration) != null) {
                if (!this.Parkinglist.contains(carRegistration)) {
                    this.Parkinglist.add(carRegistration);
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean unPark(String Registration) {
        if (this.Parkinglist.contains(Registration)) {
            this.Parkinglist.remove(Registration);
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        return this.Parkinglist.size() == this.MaxCapacity;
    }

    public String getparkedCar(int positionIn) {
        return (String)this.Parkinglist.get(positionIn);
    }

    public int NumberofParkedCars() {
        return this.Parkinglist.size();
    }

    public String toString() {
        return "" + this.Parkinglist;
    }
}
