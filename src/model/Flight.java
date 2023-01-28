package model;

public class Flight {

    private final int weekDay;
    private final int  depTime;
    private final int depDelay;
    private final int arrTime;
    private final int arrDelay;
    private final int cancelled;
    private final int diverted;
    private final int airTime;
    private final int distance;


    public Flight(int weekDay, int depTime, int depDelay, int arrTime, int arrDelay, int cancelled, int diverted, int airTime, int distance) {
        this.weekDay = weekDay;
        this.depTime = depTime;
        this.depDelay = depDelay;
        this.arrTime = arrTime;
        this.arrDelay = arrDelay;
        this.cancelled = cancelled;
        this.diverted = diverted;
        this.airTime = airTime;
        this.distance = distance;
    }

    public int getWeekDay(){
        return this.weekDay;
    }

    public int getDepTime(){
        return this.depTime;
    }

    public int getAirTime() {
        return airTime;
    }

    public int getArrDelay() {
        return arrDelay;
    }

    public int getArrTime() {
        return arrTime;
    }

    public int getCancelled() {
        return cancelled;
    }

    public int getDepDelay() {
        return depDelay;
    }

    public int getDistance() {
        return distance;
    }

    public int getDiverted() {
        return diverted;
    }
}
