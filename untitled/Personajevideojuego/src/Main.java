public class Main {
    public static void main(String[] args) {

        Guerrero Reinhart = new Guerrero("Reinhart", 100, 15, 10, 5);
        Mago Wuyang = new Mago("Wuyang", 80, 10, 5, 50, 20);
        
        Reinhart.atacar(Wuyang);

        Wuyang.lanzarHechizo(Reinhart);


        System.out.println("Estado final " + Reinhart.getNombre() + ": " + Reinhart.getVida() + " HP");
        System.out.println("Estado final " + Wuyang.getNombre() + ": " + Wuyang.getVida() + " HP");
    }
}
