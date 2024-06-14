package generics;

public interface Rectangle {

    default double getArea() {
        return getX() * getY();
    }
    double getX();
    double getY();
}
