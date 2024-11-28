package programowanieOb.enums;

public class RoadSign {
    private Side direction;

    public RoadSign(Side direction) {
        this.direction = direction;
    }

    public boolean isDirectedIn(Side checkDirection) {
        return direction ==checkDirection;
    }

    public Side getDirection() {
        return direction;
    }

    public int getDegrees() {
        return direction.getDegree();
    }
}
