public class Main{
    public static void main(String[] args) {
        RailwaySystem railwaySystem = new RailwaySystem();
        railwaySystem.checkIn(1,"Delhi",10);
        railwaySystem.checkOut(1,"Noida",20);
        System.out.println(railwaySystem.getAverage("Delhi","Noida"));
        railwaySystem.checkIn(2,"Delhi",12);
        railwaySystem.checkOut(2,"Noida",17);
        System.out.println(railwaySystem.getAverage("Delhi","Noida"));
    }
}