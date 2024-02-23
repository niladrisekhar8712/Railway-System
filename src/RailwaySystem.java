import java.util.HashMap;
import java.util.Map;

public class RailwaySystem {
    private Map<Integer,Journey> records;

    public RailwaySystem() {
        this.records = new HashMap<>();
    }

    void checkIn(int passID, String station, int time){
        Pair src = new Pair(station,time);
        records.put(passID,new Journey(src));
    }

    void checkOut(int passID, String station, int time){
        Pair src = new Pair(station,time);
        records.get(passID).setDestination(new Pair(station,time));
    }

    double getAverage(String source, String destination){
        double totalTime = 0.0;
        int passengerCount = 0;
        for(Map.Entry<Integer,Journey> record : records.entrySet()){
            String srcStation = record.getValue().getSource().getStation();
            if(record.getValue().getDestination() == null) continue; // passenger with that id hasn't reached destination
            String destStation = record.getValue().getDestination().getStation();
            double checkIn = record.getValue().getSource().getTime();
            double checkOut = record.getValue().getDestination().getTime();
            if((srcStation.equals(source) && destStation.equals(destination)) || (srcStation.equals(destination) && destStation.equals(source))){
                passengerCount++;
                totalTime += checkOut - checkIn;
            }
        }
        return totalTime/passengerCount;
    }
}