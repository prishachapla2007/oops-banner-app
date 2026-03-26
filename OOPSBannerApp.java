import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp - UC8
 * Use Map for Character Patterns
 * 
 * @author Prisha Chapla
 * @version 8.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patterns = getCharacterPatterns();

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(patterns.get(ch)[i]).append("   ");
            }

            System.out.println(line);
        }
    }

    public static Map<Character, String[]> getCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }
}