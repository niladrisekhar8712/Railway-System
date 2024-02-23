public class Journey {
    private Pair source;
    private Pair destination;

    public Pair getSource() {
        return source;
    }

    public Pair getDestination() {
        return destination;
    }

    public void setDestination(Pair destination) {
        this.destination = destination;
    }

    public Journey(Pair source, Pair destination) {
        this.source = source;
        this.destination = destination;
    }

    public Journey(Pair source) {
        this(source,null);
    }
}
