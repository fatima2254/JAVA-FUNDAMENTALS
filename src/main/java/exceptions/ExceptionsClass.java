package exceptions;

import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ExceptionsClass {


    @Test
    public void exceptionCase() {
        throw new RuntimeException("This is exception message");
    }

    @Test
    public void handleException() {
        try {
            throw new RuntimeException("Exception thrown in try block");
        } catch (RuntimeException e) {
            System.out.printf("Runtime exception with message `%s` has been caught", e.getMessage());
        }
    }

    @Test
    public void tryFinallyCase() {
        try {
            throw new RuntimeException("Exception thrown in try block");
        } finally {
            System.out.println("Finally block will be executed even if exception has been thrown");
        }
    }

    @Test
    public void checkedExceptionExample() throws IOException {
        Path path = Paths.get("players.dat");
        List<String> players = Files.readAllLines(path);
        System.out.println(players.size());
    }

    @Test
    public void checkedExceptionExample2() {
        Path path = Paths.get("players.dat");
        List<String> players = null;
        try {
            players = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(players.size());
    }

    @Test
    public void uncheckedException() {
        try {
            List<String> list = new ArrayList<>();
            list.add("String1");
            list.add("String2");
            list.add("String3");
            list.add("String4");
            System.out.println(list.get(5));
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("Index out of bounds exception caught: " + indexOutOfBoundsException.getMessage());
        }
    }

    @Test
    public void customExceptionUseCase() {
        try {
            List<String> list = new ArrayList<>();
            list.add("String1");
            list.add("String2");
            list.add("String3");
            list.add("String4");
            System.out.println(list.get(5));
        } catch (Exception e) {
            throw new MyAwesomeCustomException(e.getMessage());
        }
    }
}
