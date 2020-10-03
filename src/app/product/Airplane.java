package app.product;

import app.components.Engine;

public class Airplane {

    private String type;
    private String customer;
    private double wingspan;
    private Engine engine;
    private int crewSeats;
    private int passengerSeats;
    private String cannon;
    private String rocket;
    private String coffeeMachine;
    private int toilets;
    private String color;

    //WRONG CONSTRUCTOR
    public Airplane(String type, String customer, double wingspan, Engine engine, int crewSeats,
                    int passengerSeats, String cannon, String rocket, String coffeeMachine,
                    int toilets, String color) {
        this.type = type;
        this.customer = customer;
        this.wingspan = wingspan;
        this.engine = engine;
        this.crewSeats = crewSeats;
        this.passengerSeats = passengerSeats;
        this.cannon = cannon;
        this.rocket = rocket;
        this.coffeeMachine = coffeeMachine;
        this.toilets = toilets;
        this.color = color;
    }

    //RIGHT CONSTRUCTOR
    public Airplane(String type, String customer) {
        this.type = type;
        this.customer = customer;
    }

    public Airplane() {
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setNumberSeats(int crewSeats, int passengerSeats) {
        this.crewSeats = crewSeats;
        this.passengerSeats = passengerSeats;
    }

    public void setWeapons(String cannon, String rocket) {
        this.cannon = cannon;
        this.rocket = rocket;
    }

    public void setCoffeeMachine(String coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void setToilets(int toilets) {
        this.toilets = toilets;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Airplane:" +
                        "\n\tType: %s" +
                        "\n\tCustomer: %s" +
                        "\n\tWingspan: %.2f m" +
                        "\n\tEngine: %s" +
                        "\n\tCrew Seats: %d" +
                        "\n\tPassenger Seats: %d" +
                        "\n\tCannon: %s" +
                        "\n\tRocket: %s" +
                        "\n\tCoffee Machine: %s" +
                        "\n\tToilets: %d" +
                        "\n\tColor: %s",
                type, customer, wingspan, engine, crewSeats, passengerSeats,
                cannon, rocket, coffeeMachine, toilets, color);
    }

}
