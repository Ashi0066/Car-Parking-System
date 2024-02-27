//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Car {
    private String carName;
    private String carRegistration;
    private String ownersName;

    public Car(String carNameIn, String plateNumberIn, String residentNameIn) {
        this.carName = carNameIn;
        this.carRegistration = plateNumberIn;
        this.ownersName = residentNameIn;
    }

    public String getCarName() {
        return this.carName;
    }

    public String getCarRegistration() {
        return this.carRegistration;
    }

    public String getOwnersName() {
        return this.ownersName;
    }

    public String toString() {
        return "(" + this.carName + ")(" + this.ownersName + ")(" + this.carRegistration + ")";
    }
}
