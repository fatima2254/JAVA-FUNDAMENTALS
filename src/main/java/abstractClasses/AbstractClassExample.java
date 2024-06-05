package abstractClasses;

import java.util.ArrayList;
import java.util.List;

public class AbstractClassExample {

    public void abstractClassCase() {
        Chair chair = new Chair("Chair shape", 1,1, "Black");
        Table table = new Table("Round", 1, 2, "White");

        List<Furniture> furniture = new ArrayList<>();
        furniture.add(chair);
        furniture.add(table);
    }
}
