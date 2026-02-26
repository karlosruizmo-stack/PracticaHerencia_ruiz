public class CocheDeportivo extends Coche {
    private int caballos;
    private boolean modoCarrera;

    public CocheDeportivo(String marca, String modelo, double precio, int vel, int caballos) {
        super(marca, modelo, precio, vel);
        this.caballos = caballos;
        this.modoCarrera = false;
    }

    public void activarModoCarrera() {
        this.modoCarrera = true;
        System.out.println("¡Modo Carrera ACTIVADO para el " + getInfoBasica() + "!");
    }

    @Override
    public String toString() {
        return "🏎️ DEPORTIVO: " + super.toString() + " Potencia: " + caballos + " CV | Modo Carrera: " + (modoCarrera ? "SÍ" : "NO");
    }
}
