package generics;

public abstract class Box {

    double x;
    double y;
    double z;

     Box(double x, double y, double z) {
         this.x = x;
         this.y = y;
         this.z = z;
     }

    double getSurfaceArea() {
        return 2 * getX() * getY() + 2 * getX() * getY() + 2 * getY() * getZ();
    }

    double getVolume() {
         return getX() * getY() * getZ();
    }

    double getX() {
        return x;
    }
    double getY() {
        return y;
    }
    double getZ(){
        return z;
    }

    @Override
    public String toString() {
        return "Box[" + x + "x" + y + "x" + z + "]";
    }
}
