package dti.crmsis.back.utils;

import java.util.HashMap;
import java.util.Map;

public class StringUtils {
    private static final Map<Character, String> TRANSLIT_TABLE = new HashMap<>();

    static {
        String[][] pairs = {
                {"А", "A"},
                {"Б", "B"},
                {"В", "V"},
                {"Г", "G"},
                {"Д", "D"},
                {"Е", "E"},
                {"Ё", "E"},
                {"Ж", "Zh"},
                {"З", "Z"},
                {"И", "I"},
                {"Й", "Y"},
                {"К", "K"},
                {"Л", "L"},
                {"М", "M"},
                {"Н", "N"},
                {"О", "O"},
                {"П", "P"},
                {"Р", "R"},
                {"С", "S"},
                {"Т", "T"},
                {"У", "U"},
                {"Ф", "F"},
                {"Х", "Kh"},
                {"Ц", "Ts"},
                {"Ч", "Ch"},
                {"Ш", "Sh"},
                {"Щ", "Shch"},
                {"Ы", "Y"},
                {"Э", "E"},
                {"Ю", "Yu"},
                {"Я", "Ya"},
                {"Ь", ""},
                {"Ъ", ""},
                {"а", "a"},
                {"б", "b"},
                {"в", "v"},
                {"г", "g"},
                {"д", "d"},
                {"е", "e"},
                {"ё", "e"},
                {"ж", "zh"},
                {"з", "z"},
                {"и", "i"},
                {"й", "y"},
                {"к", "k"},
                {"л", "l"},
                {"м", "m"},
                {"н", "n"},
                {"о", "o"},
                {"п", "p"},
                {"р", "r"},
                {"с", "s"},
                {"т", "t"},
                {"у", "u"},
                {"ф", "f"},
                {"х", "kh"},
                {"ц", "ts"},
                {"ч", "ch"},
                {"ш", "sh"},
                {"щ", "shch"},
                {"ы", "y"},
                {"э", "e"},
                {"ю", "yu"},
                {"я", "ya"},
                {"ь", ""},
                {"ъ", ""},
                {"Є", "Ye"},
                {"І", "I"},
                {"Ї", "Yi"},
                {"Ґ", "G"},
                {"є", "ye"},
                {"і", "i"},
                {"ї", "yi"},
                {"ґ", "g"}
        };

        for (String[] pair : pairs) {
            TRANSLIT_TABLE.put(pair[0].charAt(0), pair[1]);
        }
    }


    public static String translit(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        String cleaned = input.trim().replaceAll("\\s+", "_");

        for (char c : cleaned.toCharArray()) {
            sb.append(TRANSLIT_TABLE.getOrDefault(c, String.valueOf(c)));
        }

        // Заменяем все символы кроме латиницы, цифр и нижнего подчёркивания
        return sb.toString().replaceAll("[^a-zA-Z0-9_]", "_");
    }

}
