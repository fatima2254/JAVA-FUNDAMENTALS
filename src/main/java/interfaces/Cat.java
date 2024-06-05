package interfaces;

public class Cat implements Animal, Pet {

    private final String name;
    private final Integer age;
    private final String color;

    public Cat(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public boolean isLoveChildren() {
        return false;
    }
}
