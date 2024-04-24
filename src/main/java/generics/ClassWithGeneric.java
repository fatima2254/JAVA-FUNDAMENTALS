package generics;

public class ClassWithGeneric<T> {

    // T stands for "Type"
    private T t;

    public ClassWithGeneric(T t) {
        this.t = t;
    }

    public ClassWithGeneric() {};

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
