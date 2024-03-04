import customExceptions.ArrayCountExceptions;
import customExceptions.EmptyStringExceptions;
import customExceptions.ValueException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            InitialData.scannerUser();
        } catch (ArrayCountExceptions | EmptyStringExceptions | ValueException | IOException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}



