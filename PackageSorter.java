public class PackageSorter {

    public static String sort(int width, int height, int length, double mass) {
        int volume = width * height * length;
        boolean isBulky = volume >= 1000000 || width >= 150 || height >= 150 || length >= 150;
        boolean isHeavy = mass >= 20;

        if (isBulky && isHeavy) {
            return "REJECTED";
        } else if (isBulky || isHeavy) {
            return "SPECIAL";
        } else {
            return "STANDARD";
        }
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println(sort(100, 100, 100, 10)); // STANDARD
        System.out.println(sort(200, 100, 100, 10)); // SPECIAL
        System.out.println(sort(100, 100, 100, 25)); // SPECIAL
        System.out.println(sort(200, 200, 200, 25)); // REJECTED
    }
}
