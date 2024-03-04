
import customExceptions.ArrayCountExceptions;
import customExceptions.EmptyStringExceptions;
import customExceptions.ValueException;

import java.io.IOException;
import java.util.Scanner;

public class InitialData {

    public static void  scannerUser() throws ValueException, EmptyStringExceptions, ArrayCountExceptions, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные, разделенные пробелом: Фамилия Имя Отчество ДатаРождения Телефон Пол(m/f)");
        String input = scanner.nextLine();

        if(input.isEmpty()) {
            throw new EmptyStringExceptions("Введена пустая строка");
        }

        input = input.replaceAll("\\s+"," ").trim();
        String[] data = input.split(" ");
        if (data.length == 6) {
            CheckFormat.checkDateFormat(data[3]);
            CheckFormat.checkNumberFormat(data[4]);
            CheckFormat.checkGenderFormat(data[5]);
            Buffer.createNewFile(data);

        } else {
            throw new ArrayCountExceptions("Введите полные данные или возможно пропущен пробел");
        }

    }

}
