package app.builders;

import app.components.Engine;
import app.product.Airplane;

public class JSF implements AirplaneBuilder {

    private Airplane airplane;

    public JSF(String name) {
        this.airplane = new Airplane();
        this.airplane.setCustomer(name);
        this.airplane.setType("JSF");
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
        airplane.setNumberSeats(2, 0);
    }

    @Override
    public void buildWeapons() {
        airplane.setWeapons("bomba killer", "little joe");
    }

    @Override
    public void buildServices() {
        airplane.setCoffeeMachine(null);
        airplane.setToilets(0);
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
