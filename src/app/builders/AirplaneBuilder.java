package app.builders;

import app.components.Engine;
import app.product.Airplane;

public interface AirplaneBuilder {

    /*
    Implementeer hier de interface-methodes op basis van de attributenlijst van Airplane.
    Eén voorbeeld: public void buildWings();
    */
    public void buildWings();

    public void buildEngine();

    public void buildSeats();

    public void buildWeapons();

    public void buildServices();

    public void buildColor();

    public Airplane getAirplane();

}
