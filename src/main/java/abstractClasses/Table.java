package abstractClasses;

public class Table extends Furniture{

    private String shape;
    private int x;
    private int y;
    private String colour;

    public Table(String shape, int x, int y, String colour) {
        this.shape = shape;
        this.x = x;
        this.y = y;
        this.colour = colour;
    }

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    String getShape() {
        return this.shape;
    }

    @Override
    String getColor() {
        return this.colour;
    }

    @Override
    void colour(String colour) {
        this.colour = colour;
    }
}
