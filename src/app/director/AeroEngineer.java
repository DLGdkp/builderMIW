package app.director;

import app.builders.AirplaneBuilder;
import app.product.Airplane;

public class AeroEngineer {

    private AirplaneBuilder airplaneBuilder;

    public AeroEngineer() {
    }

    public void setAirplaneBuilder(AirplaneBuilder airplaneBuilder) {
        this.airplaneBuilder = airplaneBuilder;
    }

    public Airplane getAirplane() {
        return airplaneBuilder.getAirplane();
    }


    public void buildAirplane() {
        airplaneBuilder.buildColor();
        airplaneBuilder.buildEngine();
        airplaneBuilder.buildSeats();
        airplaneBuilder.buildServices();
        airplaneBuilder.buildWeapons();
        airplaneBuilder.buildWings();
    }

}
