package simulator;

public class Piece {

    private final Point point;
    private Point location;

    public Piece(Point point) {
        this.point = point;
        this.location = point;
    }

    @Override
    public String toString() {
        return point + "=" + location;
    }

    public Point getPoint() {
        return point;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
}
