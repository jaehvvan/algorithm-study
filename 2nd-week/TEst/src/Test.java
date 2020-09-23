public class Test {
    public static void main(String[] args) {
        System.out.println(String.format("%d", 3));
        System.out.println(String.format("%s", "*"));
        System.out.println(String.format("%%"));
        System.out.printf(String.format("%%%ds*\n", 3), "");
        System.out.println(String.format("%%%ds", 3));
        System.out.printf(String.format("%%%ds", 3), "*");
    }
}