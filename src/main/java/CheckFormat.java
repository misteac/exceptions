import customExceptions.ValueException;

import java.util.Locale;

public class CheckFormat {

    public static void checkDateFormat(String date) throws ValueException {
        char[] check = date.toCharArray();

        if(check.length == 10 && (check[2] == '.' && check[5] == '.')) {
        } else {
            throw new ValueException("Дата введена неверно.\n Правильный формат dd.mm.yyyy");
        }
    }

    public static void checkNumberFormat (String phoneNumber) throws ValueException {
        try {
            long check = Long.parseLong(phoneNumber);
        }catch (ValueException e) {
            throw new ValueException("Номер телефона введен неверно.\n Правильный формат 71112223344");
        }

    }
    public static void checkGenderFormat (String gender) throws ValueException {
        if (gender.length() == 1) {
            gender = gender.toLowerCase();
            if(gender.equals("m") || gender.equals("f")) {
                char[] chars = gender.toCharArray();
                char check = chars[0];
            } else {
                throw new ValueException("Пол введен неверно. \n Правильный формат: m/f");

            }
        } else {
            throw new ValueException("\"Пол введен неверно. \\n Правильный формат: m/f\"");
        }
    }
}


