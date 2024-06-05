package interfaces;

public class Dog implements Animal, Pet{

    private final String name;
    private final Integer age;
    private final String size;

    public Dog(String name, Integer age, String size) {
        this.name = name;
        this.age = age;
        this.size = size;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Integer getAge() {
        return null;
    }

    public String getSize() {
        return this.size;
    }

    @Override
    public boolean isLoveChildren() {
        return true;
    }
}
