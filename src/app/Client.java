package app;

import app.builders.JSF;
import app.components.Engine;
import app.director.AeroEngineer;
import app.product.Airplane;

public class Client {

    public static void main(String[] args) {

        //WRONG METHOD
        Airplane airplane = new Airplane("JSF", "Koninklijke Landmacht", 8.75,
                new Engine("Rolls Royce", 4500), 2, 0,
                "bomba killer", "little joe", null, 0, "white)");

        //System.out.println(airplane);

        /*
        OPDRACHT:
        Zoals je ziet is het aanmaken van een Airplane een echte crime: een ellenlange constructor
        die erg foutgevoelig is. Implementeer daarom een Builder-pattern. Ga als volgt te werk:

        a) Gegeven zijn o.a. vier pakketten voor builder-onderdelen. In het pakket 'product' staat
        al de klasse voor het uiteindelijke vliegtuig uitgewerkt. Hier zie je de 'verkeerde' constructor
        (zonder Builder-pattern) en ook de 'juiste' constructor (veel korter!). Werk tegen deze
        laatste constructor aan tijdens de opdracht.
        b) Kun je al beredeneren waarom in Airplane vooral al SETTERS staan? Waarom zijn die
        essentieel?
        c) Gegeven is ook de component-klasse Engine, dit is gewoon een attribuut van Airplane.
        d) De interface AirplaneBuilder schrijft alle methodes voor de onderliggende concrete builders
        voor. Vul deze klasse met (niet-geïmplementeerde) interface-methodes op basis van de attributenlijst
        van Airplane. Let op: type en customer worden al ingesteld met de constructor!
        e) Vul nu de concrete builder 'JSF' met buildmethodes. Implementeer eerst alles wat de interface
        voorschrijft. Maak nu een brug naar de setters in Airplane. Je bent vrij om de concrete
        attribuutwaarden zelf te kiezen.
        f) Wat is de rol hier van het attribuut 'airplane', en van de methode getAirplane()?
        g) Bouw naast de JSF eventueel ook een concrete builder-klasse voor een Boeing en een Cessna. Kies zelf
        welke attributen van toepassing zijn en welke waarden ze hebben.
        h) De AeroEngineer is onze 'director' die de vliegtuigen bouwt. Roep daar in de methode builderAirplane()
        alle relevante methodes in het attribuut airplaneBuilder aan.
        i) Zet de hele applicatie nu in werking vanuit deze main-klasse Client. Initialiseer eerst een AeroEngineer
        en een JSF-builder (met klantnaam!). Koppel vervolgens engineer en builder aan elkaar. Geef opdracht
        tot bouwen aan de engineer. Haal het gebouwde vliegtuig op bij de engineer en print deze in de console.
        */

        AeroEngineer jan = new AeroEngineer();
        JSF jsfBuilder = new JSF("Antartica Airlines");
        jan.setAirplaneBuilder(jsfBuilder);

        System.out.println(jan.getAirplane());

        jan.buildAirplane();
        System.out.println(jan.getAirplane());



    }
}
