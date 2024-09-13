public class PackageSorter {

    public static String sort(int width, int height, int length, double mass) {
        // Calculate volume
        long volume = (long) width * height * length;

        // Determine if the package is bulky
        boolean isBulky = volume >= 1000000 || width >= 150 || height >= 150 || length >= 150;

        // Determine if the package is heavy
        boolean isHeavy = mass >= 20;

        // Determine the stack based on the criteria
        if (isBulky && isHeavy) {
            return "REJECTED";
        } else if (isBulky || isHeavy) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sort(100, 100, 100, 10)); // STANDARD
        System.out.println(sort(200, 100, 100, 10)); // SPECIAL
        System.out.println(sort(100, 100, 100, 25)); // SPECIAL
        System.out.println(sort(200, 200, 200, 25)); // REJECTED
    }
}
