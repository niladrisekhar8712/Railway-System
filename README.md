# Railway-System
This program provides basic functionality for managing railway journeys and computing average journey times between specified stations.
## Pair
Java class is named Pair, and it represents a pair consisting of a station name (presumably representing a location) and a time value. Here's a breakdown of the class:

### Fields:

station: A private field of type String, which holds the name of the station.
time: A private field of type double, which holds the time value.
Constructor:

Pair(String station, double time): This is the constructor of the Pair class. It initializes the station and time fields with the values passed as arguments.
### Methods:

getTime(): This method returns the value of the time field.
getStation(): This method returns the value of the station field.
This class can be used to represent pairs of station names and their associated time values. It's a simple data structure commonly used in various applications.

## Journey
 Java class is named Journey, and it represents a journey consisting of a source pair and a destination pair. Here's a breakdown of the class:

### Fields:

source: A private field of type Pair, which represents the source pair of the journey.
destination: A private field of type Pair, which represents the destination pair of the journey.
Constructor:

Journey(Pair source, Pair destination): This is a constructor of the Journey class. It initializes both the source and destination fields with the pairs passed as arguments.
Journey(Pair source): This constructor is a shorthand for creating a journey with only a source pair. It calls the first constructor with the source argument and null for the destination, effectively initializing the destination to null.
### Methods:

getSource(): This method returns the source pair of the journey.
getDestination(): This method returns the destination pair of the journey.
setDestination(Pair destination): This method sets the destination pair of the journey to the provided pair.
This class allows for representing journeys between pairs, where each pair represents a station and a time associated with it.
## RailwaySystem
This Java class RailwaySystem appears to represent a simple system for managing railway journeys and calculating average journey times between given source and destination stations. Let's break down the class:

### Fields:

records: A Map that associates integer pass IDs with Journey objects. This map stores the records of journeys made by passengers.
Constructor:

RailwaySystem(): Initializes the records map as a new HashMap.
### Methods:

checkIn(int passID, String station, int time): This method records the check-in of a passenger identified by passID at a particular station and time. It creates a new Pair representing the source station and calls the Journey constructor to create a new journey with this source.
checkOut(int passID, String station, int time): This method records the check-out of a passenger identified by passID at a particular station and time. It retrieves the corresponding journey from the records map using the passID and sets the destination pair for that journey.
getAverage(String source, String destination): This method calculates the average journey time between two given stations (source and destination). It iterates through the records, calculates the total journey time for journeys between the specified stations, and divides it by the number of passengers to get the average journey time.
Overall, this class provides basic functionality for managing railway journeys and computing average journey times between specified stations.
