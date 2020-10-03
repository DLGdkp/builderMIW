package app.builders;

import app.components.Engine;
import app.product.Airplane;

public class Cessna implements AirplaneBuilder {

    private Airplane airplane;

    public Cessna(String name) {
        this.airplane = new Airplane();
        this.airplane.setCustomer(name);
        this.airplane.setType("Cessna");
    }

    @Override
    public void buildWings() {
        airplane.setWingspan(8.75);
    }

    @Override
    public void buildEngine() {
        airplane.setEngine(new Engine("Rolls Royce", 4500));
    }

    @Override
    public void buildSeats() {
        airplane.setNumberSeats(2, 4);
    }

    @Override
    public void buildWeapons() {
        airplane.setWeapons(null, null);
    }

    @Override
    public void buildServices() {
        airplane.setCoffeeMachine("Senseo");
        airplane.setToilets(1);
    }

    @Override
    public void buildColor() {
        airplane.setColor("white");
    }

    @Override
    public Airplane getAirplane() {
        return airplane;
    }
}
