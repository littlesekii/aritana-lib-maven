package lib.littlesekii.aritana;

public class Main {
	final static private String LIB_VERSION = "v0.0.1";

    public static String version() {
        return "Aritana Library " + LIB_VERSION;
    }

    public static void main(String[] args) {
        System.out.println("Booting Aritana Library...");
        System.out.println(version());
    }
}
