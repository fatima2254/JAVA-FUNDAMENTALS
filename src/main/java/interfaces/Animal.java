package interfaces;

public interface Animal {

    String getName();
    Integer getAge();

    default void sayHello() {
        System.out.println("Hello!");
    }
}
