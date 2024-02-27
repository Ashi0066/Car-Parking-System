//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CarParkingGUI extends Application {
    private AuthorizedCarMap map;
    private ParkingControl parking;
    private final int WIDTH = 800;
    private final int HEIGHT = 500;
    private Label Heading = new Label("Vehicle Registration ");
    private Label Registrtaion = new Label("Registration ");
    private Label VehicleNameLable = new Label("Vehicle Name");
    private TextField VehicleNameField = new TextField();
    private Label VehicleRegisterationLabel = new Label("Vehicle Registration");
    private TextField VehicleRegisterationField = new TextField();
    private Label OwnersNamelabel = new Label("Vehicle Owners Name");
    private TextField OwnersNameField = new TextField();
    private Button VehicleRegistertationButton = new Button("Register Vehicle");
    private Button VehicleRemoveButton = new Button("Remove from list");
    private Button VehicleCheckButton = new Button("Check Vehicle ");
    private TextArea RegistrationDisplayTextArea = new TextArea();
    private Button NumberOfRegisteredVehiclesButton = new Button("Number of Registered Cars");
    private Button AllRegisterCarsButton = new Button("All Registered Cars");
    private Label Heading2 = new Label("Car Parking");
    private Label VehicleRegistrationParkLabel = new Label("Vehicle Registration");
    private TextField VehicleParkRegistrationField = new TextField();
    private Button ParkVehicleButton = new Button("Park Vehicle");
    private Button UnParkButton = new Button("UnPark");
    private Button CheckParkedButton = new Button("Check");
    private Label ParkingTextArealabel = new Label();
    private TextArea ParkingTextArea = new TextArea();
    private Button NubmberofParkedCarButton = new Button("Number Of Parked vehicles");
    private Button ShowParkedVehiclesButton = new Button("Show all Parked Cars");
    private Button SaveAndQuitButton = new Button("Save And Quit");
    Button clearButton = new Button("Clear");
    Button clearButton2 = new Button("Clear");

    public CarParkingGUI() {
    }

    public void start(Stage stage) {
        int MAX = 999;
        this.map = new AuthorizedCarMap(MAX);
        this.parking = new ParkingControl(MAX);
        FileHandler.parkCarReader(this.parking);
        FileHandler.ReadCarRecord(this.map);
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(this.RegistrationDisplayTextArea);
        scrollPane.setPrefSize(200.0, 100.0);
        HBox heading = new HBox(10.0);
        HBox VehicleRegistrationlabelHBox = new HBox(10.0);
        VehicleRegistrationlabelHBox.setSpacing(10.0);
        HBox VehicleRegistrationButtonHBox = new HBox(90.0);
        VehicleRegistrationButtonHBox.setPadding(new Insets(10.0, 0.0, 10.0, 50.0));
        HBox displayRegVehicleButtonHBox = new HBox(10.0);
        HBox heading2 = new HBox(10.0);
        HBox VehicleParklabelHBox = new HBox(10.0);
        HBox VehicleParkButtonHBox = new HBox(10.0);
        VehicleParkButtonHBox.setPadding(new Insets(2.0, 0.0, 2.0, 100.0));
        HBox ParkedVehicleShowButonHBox = new HBox(10.0);
        HBox SaveAndQuit = new HBox(10.0);
        SaveAndQuit.setPadding(new Insets(12.0, 30.0, 12.0, 0.0));
        heading.getChildren().addAll(new Node[]{this.Heading});
        VehicleRegistrationlabelHBox.getChildren().addAll(new Node[]{this.VehicleNameLable, this.VehicleNameField, this.VehicleRegisterationLabel, this.VehicleRegisterationField, this.OwnersNamelabel, this.OwnersNameField, this.clearButton});
        VehicleRegistrationButtonHBox.getChildren().addAll(new Node[]{this.VehicleRegistertationButton, this.VehicleRemoveButton, this.VehicleCheckButton});
        displayRegVehicleButtonHBox.getChildren().addAll(new Node[]{this.NumberOfRegisteredVehiclesButton, this.AllRegisterCarsButton});
        heading2.getChildren().addAll(new Node[]{this.Heading2});
        VehicleParklabelHBox.getChildren().addAll(new Node[]{this.VehicleRegistrationParkLabel, this.VehicleParkRegistrationField, this.clearButton2});
        VehicleParkButtonHBox.getChildren().addAll(new Node[]{this.ParkVehicleButton, this.UnParkButton});
        ParkedVehicleShowButonHBox.getChildren().addAll(new Node[]{this.ShowParkedVehiclesButton, this.NubmberofParkedCarButton});
        SaveAndQuit.getChildren().addAll(new Node[]{this.SaveAndQuitButton});
        VBox root = new VBox(9.0);
        root.getChildren().addAll(new Node[]{heading, VehicleRegistrationlabelHBox, VehicleRegistrationButtonHBox, this.RegistrationDisplayTextArea, displayRegVehicleButtonHBox, heading2, VehicleParklabelHBox, VehicleParkButtonHBox, this.ParkingTextArea, ParkedVehicleShowButonHBox, SaveAndQuit});
        Scene scene = new Scene(root, Color.LIGHTSKYBLUE);
        Font font = new Font("Gotham", 20.0);
        this.Heading.setFont(font);
        this.Heading2.setFont(font);
        heading.setAlignment(Pos.CENTER);
        heading.setBorder(new Border(new BorderStroke[]{new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, (CornerRadii)null, new BorderWidths(1.0))}));
        heading.setStyle("-fx-background-color: yellow;");
        heading2.setAlignment(Pos.CENTER);
        heading2.setBorder(new Border(new BorderStroke[]{new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID, (CornerRadii)null, new BorderWidths(1.0))}));
        heading2.setStyle("-fx-background-color: yellow;");
        VehicleRegistrationlabelHBox.setAlignment(Pos.CENTER);
        VehicleRegistrationButtonHBox.setAlignment(Pos.CENTER);
        displayRegVehicleButtonHBox.setAlignment(Pos.CENTER);
        VehicleParklabelHBox.setAlignment(Pos.CENTER);
        VehicleParkButtonHBox.setAlignment(Pos.CENTER);
        ParkedVehicleShowButonHBox.setAlignment(Pos.CENTER);
        SaveAndQuit.setAlignment(Pos.CENTER);
        root.setAlignment(Pos.CENTER);
        this.VehicleNameField.setMaxWidth(70.0);
        this.VehicleRegisterationField.setMaxWidth(70.0);
        this.OwnersNameField.setMaxWidth(70.0);
        this.clearButton.setOnAction((e) -> {
            this.VehicleNameField.clear();
            this.VehicleRegisterationField.clear();
            this.OwnersNameField.clear();
        });
        this.clearButton2.setOnAction((e) -> {
            this.VehicleParkRegistrationField.clear();
        });
        VehicleRegistrationlabelHBox.setMinWidth(800.0);
        VehicleRegistrationlabelHBox.setMaxWidth(800.0);
        VehicleRegistrationButtonHBox.setMinWidth(800.0);
        VehicleRegistrationButtonHBox.setMaxWidth(800.0);
        displayRegVehicleButtonHBox.setMinWidth(800.0);
        displayRegVehicleButtonHBox.setMaxWidth(800.0);
        VehicleParklabelHBox.setMinWidth(800.0);
        VehicleParklabelHBox.setMaxWidth(800.0);
        VehicleParkButtonHBox.setMinWidth(800.0);
        VehicleParkButtonHBox.setMaxWidth(800.0);
        ParkedVehicleShowButonHBox.setMinWidth(800.0);
        ParkedVehicleShowButonHBox.setMaxWidth(800.0);
        SaveAndQuit.setMinWidth(400.0);
        SaveAndQuit.setMaxWidth(400.0);
        root.setMinSize(800.0, 500.0);
        root.setMaxSize(800.0, 500.0);
        this.RegistrationDisplayTextArea.setMaxSize(720.0, 250.0);
        this.ParkingTextArea.setMaxSize(720.0, 250.0);
        BorderStroke style = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(0.0), new BorderWidths(2.0));
        root.setBorder(new Border(new BorderStroke[]{style}));
        root.setBackground(Background.EMPTY);
        this.VehicleRegistertationButton.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10.0), Insets.EMPTY)}));
        this.VehicleRemoveButton.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10.0), Insets.EMPTY)}));
        this.VehicleCheckButton.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10.0), Insets.EMPTY)}));
        this.NumberOfRegisteredVehiclesButton.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10.0), Insets.EMPTY)}));
        this.AllRegisterCarsButton.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10.0), Insets.EMPTY)}));
        this.ParkVehicleButton.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10.0), Insets.EMPTY)}));
        this.UnParkButton.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10.0), Insets.EMPTY)}));
        this.CheckParkedButton.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10.0), Insets.EMPTY)}));
        this.NubmberofParkedCarButton.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10.0), Insets.EMPTY)}));
        this.ShowParkedVehiclesButton.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.LIGHTYELLOW, new CornerRadii(10.0), Insets.EMPTY)}));
        this.SaveAndQuitButton.setBackground(new Background(new BackgroundFill[]{new BackgroundFill(Color.LIGHTSEAGREEN, new CornerRadii(10.0), Insets.EMPTY)}));
        this.VehicleRegistertationButton.setOnAction((e) -> {
            this.addVehicleHandler();
        });
        this.VehicleRemoveButton.setOnAction((e) -> {
            this.deleteCarHandler();
        });
        this.VehicleCheckButton.setOnAction((e) -> {
            this.CheckVehicleHandler();
        });
        this.NumberOfRegisteredVehiclesButton.setOnAction((e) -> {
            this.Numberofregistercarhandler();
        });
        this.AllRegisterCarsButton.setOnAction((e) -> {
            this.ShowRegisteredCarHandler();
        });
        this.ParkVehicleButton.setOnAction((e) -> {
            this.ParkCarHandler();
        });
        this.UnParkButton.setOnAction((e) -> {
            this.UnparkCarHandler();
        });
        this.NubmberofParkedCarButton.setOnAction((e) -> {
            this.ShowNumberOfParkedCarHandler();
        });
        this.ShowParkedVehiclesButton.setOnAction((e) -> {
            this.ShowAllParkedCars();
        });
        this.SaveAndQuitButton.setOnAction((e) -> {
            this.saveAndQuitHandler();
        });
        stage.setScene(scene);
        stage.setTitle("Car Parking Application");
        stage.setResizable(false);
        stage.setWidth(800.0);
        stage.setHeight(630.0);
        stage.show();
    }

    private void addVehicleHandler() {
        String VehicleName = this.VehicleNameField.getText();
        String VehicleRegisteration = this.VehicleRegisterationField.getText();
        String OwnersName = this.OwnersNameField.getText();
        if (VehicleName.length() != 0 && VehicleRegisteration.length() != 0 && OwnersName.length() != 0) {
            if (this.map.getcar(VehicleRegisteration) != null) {
                this.RegistrationDisplayTextArea.setText("Vehicle has been already been registered");
            } else {
                Car CarIN = new Car(VehicleName, VehicleRegisteration, OwnersName);
                boolean ok = this.map.addCar(CarIN);
                if (!ok) {
                    this.RegistrationDisplayTextArea.setText("All the parking Spots Has been registered ");
                } else {
                    this.RegistrationDisplayTextArea.setText("Vehicle has been successfully registered");
                }
            }
        } else {
            this.RegistrationDisplayTextArea.setText("Vehicle name, registration and owner's name cannot be empty");
        }

    }

    private void deleteCarHandler() {
        String registrationNumber = this.VehicleRegisterationField.getText();
        if (!registrationNumber.isEmpty() && registrationNumber.length() != 0) {
            if (!this.map.removeCar(registrationNumber)) {
                this.RegistrationDisplayTextArea.setText("Vehicle Registration does not exist ");
            } else if (this.parking.toString().contains(registrationNumber)) {
                this.RegistrationDisplayTextArea.setText("Vehicle is parked please Remove vehicle from parking   ");
            } else {
                this.map.removeCar(registrationNumber);
                this.RegistrationDisplayTextArea.setText("Vehicle removed ");
            }
        } else {
            this.map.removeCar(registrationNumber);
            this.RegistrationDisplayTextArea.setText("Vehicle Registration can not be empty");
        }

    }

    private void CheckVehicleHandler() {
        String regisatration = this.VehicleRegisterationField.getText();
        if (this.map.getcar(regisatration) != null) {
            this.RegistrationDisplayTextArea.setText("The Vehicle with registration number  " + regisatration + " is registered ");
        } else {
            this.RegistrationDisplayTextArea.setText("The vehicle with registration number  " + regisatration + "  is not registered");
        }

    }

    private void Numberofregistercarhandler() {
        String noReg = "" + this.map.numberofRegisteredCars();
        this.RegistrationDisplayTextArea.setText(noReg);
    }

    private void ShowRegisteredCarHandler() {
        if (this.map.isEmpty()) {
            this.RegistrationDisplayTextArea.setText(" No vehicle is registered yet ");
        } else {
            this.RegistrationDisplayTextArea.setText(String.valueOf(this.map.toString()));
        }

    }

    private void ParkCarHandler() {
        String Registration = this.VehicleParkRegistrationField.getText();
        if (Registration.length() != 0 && !Registration.isEmpty()) {
            Car car = this.map.getcar(Registration);
            if (car == null) {
                this.ParkingTextArea.setText("This Car " + Registration + " in not registered in the System");
            } else if (this.parking.isFull()) {
                this.ParkingTextArea.setText("The Car park is full");
            } else if (this.parking.toString().contains(Registration)) {
                this.ParkingTextArea.setText("car is already parked");
            } else {
                boolean parked = this.parking.parkCar(Registration, this.map);
                if (!parked) {
                    return;
                }

                this.ParkingTextArea.setText("car " + Registration + " has been Parked");
            }
        } else {
            this.ParkingTextArea.setText("Registration Number can not be empty ");
        }

    }

    private void UnparkCarHandler() {
        String Registration = this.VehicleParkRegistrationField.getText();
        boolean success = this.parking.unPark(Registration);
        if (success) {
            this.ParkingTextArea.setText("Car " + Registration + " Has been removed");
        } else {
            this.ParkingTextArea.setText("Car " + Registration + " Doe Not exist ");
        }

        if (Registration.length() == 0) {
            this.ParkingTextArea.setText(" Registration number can not be empty");
        }

    }

    private void ShowNumberOfParkedCarHandler() {
        this.ParkingTextArea.setText("There are " + this.parking.NumberofParkedCars() + " Vehicle Registered");
    }

    private void ShowAllParkedCars() {
        if (this.parking.toString().isEmpty()) {
            this.ParkingTextArea.setText("There are no Vehicles parked yet ");
        } else {
            this.ParkingTextArea.setText(this.parking.toString());
        }

    }

    private void saveAndQuitHandler() {
        FileHandler.saveCarRecord(this.map);
        FileHandler.carParkFile(this.parking);
        Platform.exit();
    }
}
