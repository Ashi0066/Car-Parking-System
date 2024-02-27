//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FileHandler {
    public FileHandler() {
    }

    public static void saveCarRecord(AuthorizedCarMap mapIn) {
        try {
            FileWriter carFile = new FileWriter("cars.txt");
            BufferedWriter carStream = new BufferedWriter(carFile);
            Set<Map.Entry<String, Car>> entrySet = mapIn.entrySet();
            Iterator var4 = entrySet.iterator();

            while(var4.hasNext()) {
                Map.Entry<String, Car> entry = (Map.Entry)var4.next();
                String platenumber = (String)entry.getKey();
                Car car = (Car)entry.getValue();
                String line = platenumber + "\t" + car.getCarName() + "\t" + car.getOwnersName();
                carStream.write(line);
                carStream.newLine();
            }

            carStream.close();
            carFile.close();
        } catch (IOException var9) {
            System.out.println("Error writing file ");
        }

    }

    public static void ReadCarRecord(AuthorizedCarMap mapIn) {
        try {
            new String("");
            new String("");
            new String("");
            FileReader carFile = new FileReader("cars.txt");
            BufferedReader carStream = new BufferedReader(carFile);
            String line = carStream.readLine();

            while((line = carStream.readLine()) != null) {
                String[] container = line.split("\t");
                String tempCarName = container[0];
                String tempPlatenumber = container[1];
                String tempResidentName = container[2];
                Car car = new Car(tempPlatenumber, tempCarName, tempResidentName);
                mapIn.addCar(car);
            }

            carStream.close();
            carFile.close();
        } catch (IOException var9) {
            System.out.println("File not found ");
        }

    }

    public static void carParkFile(ParkingControl parking) {
        try {
            FileWriter carFile = new FileWriter("Parkcars.txt");
            BufferedWriter carStream = new BufferedWriter(carFile);

            for(int i = 0; i < parking.Parkinglist.size(); ++i) {
                String cardata = (String)parking.Parkinglist.get(i);
                carStream.write(cardata);
                carStream.newLine();
            }

            carStream.close();
            carFile.close();
        } catch (IOException var5) {
            System.out.println("file not found");
        }

    }

    public static void parkCarReader(ParkingControl parkingControl) {
        try {
            FileReader carFile = new FileReader("Parkcars.txt");
            BufferedReader carStream = new BufferedReader(carFile);
            new String("");

            String line;
            while((line = carStream.readLine()) != null) {
                parkingControl.Parkinglist.add(line);
            }

            carStream.close();
            carFile.close();
        } catch (IOException var5) {
            System.out.println("File not found  ");
        }

    }
}
