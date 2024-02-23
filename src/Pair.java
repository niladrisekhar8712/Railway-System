public class Pair {
    private String station;
    private double time;

    public Pair(String station, double time) {
        this.station = station;
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public String getStation() {
        return station;
    }
}