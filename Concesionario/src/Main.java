public class Main {
    public static void main(String[] args) {
        CocheElectrico tesla = new CocheElectrico("Tesla", "Model S", 90000, 250, 600, 1.5);
        CocheDeportivo ferrari = new CocheDeportivo("Ferrari", "F8", 280000, 340, 720);

        System.out.println(tesla);
        System.out.println(ferrari);
    }
}
