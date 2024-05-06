//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
// new commit
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AuthorizedCarMap {
    private Map<String, Car> authorisedCars;
    private int Max;

    public AuthorizedCarMap(int maxIn) {
        this.Max = maxIn;
        this.authorisedCars = new HashMap();
    }

    public boolean isFull() {
        return this.authorisedCars.size() == this.Max;
    }

    public boolean isEmpty() {
        return this.authorisedCars.size() == 0;
    }

    public boolean addCar(Car carIn) {
        if (!this.isFull()) {
            this.authorisedCars.put(carIn.getCarRegistration(), carIn);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeCar(String RegistartionNumber) {
        if (this.authorisedCars.containsKey(RegistartionNumber)) {
            this.authorisedCars.remove(RegistartionNumber);
            return true;
        } else {
            return false;
        }
    }

    public Car getcar(String RegistrationNumber) {
        return this.authorisedCars.containsKey(RegistrationNumber) ? (Car)this.authorisedCars.get(RegistrationNumber) : null;
    }

    public int numberofRegisteredCars() {
        return this.authorisedCars.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Registered cars: \n");
        int count = 1;
        Iterator var3 = this.authorisedCars.entrySet().iterator();

        while(var3.hasNext()) {
            Map.Entry<String, Car> entry = (Map.Entry)var3.next();
            Car car = (Car)entry.getValue();
            sb.append(count++).append(". ").append("\nCar Name: ").append(car.getCarName()).append(", ").append("\nCar Registration: ").append(car.getCarRegistration()).append(", ").append("\nOwner's Name: ").append(car.getOwnersName()).append(",\n");
        }

        return sb.toString();
    }

    public Set<Map.Entry<String, Car>> entrySet() {
        return this.authorisedCars.entrySet();
    }
}
