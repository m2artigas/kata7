package control;

import java.net.MalformedURLException;

import static spark.Spark.*;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        DBConnection flightDB = new DBConnection();

        port(8080);

        get("/flights/all", (req, res) -> {
            return flightDB.selectAllFlights();
        });

        get("/flights/day/:day", (req, res) -> {
            return flightDB.selectFlightsFromDayOfWeek(req.params(":day"));
        });

        get("/flights/distance/bigger/:distance", (req, res) -> {
            return flightDB.selectFlightsWithBiggerDistance(req.params(":distance"));
        });

        get("/flights/distance/lower/:distance", (req, res) -> {
            return flightDB.selectFlightsWithLowerDistance(req.params(":distance"));
        });

        get("/flights/cancelled", (req, res) -> {
            return flightDB.selectCancelled();
        });

        get("/flights/diverted", (req, res) -> {
            return flightDB.selectDiverted();
        });
    }


}
