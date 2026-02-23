/**
 * OOPSBannerApp - UC4
 * Prints "OOPS" banner using String array and loop
 * for better modularity and reusability.
 *
 * @author Prisha Chapla
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
                String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", "*     *", "*     *", "*     *", "*     *"),
                String.join("   ", " ***** ", " ***** ", " ***** ", " ***** ")
        };

        // Enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}