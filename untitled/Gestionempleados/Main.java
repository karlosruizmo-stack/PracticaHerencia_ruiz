public class Main {
    public static void main(String[] args) {
        Programador p1 = new Programador("Karlos", "Quilca", 1300, "Sistemas", "Java", 4);

        Gerente g1 = new Gerente("Lem", "Ruiz", 1100, "Recursos Humanos", 500, 10);

        System.out.println("--- Información de Empleados ---");
        System.out.println(p1.toString());
        System.out.println(g1.toString());
    }
}
