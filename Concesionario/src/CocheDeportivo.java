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
        System.out.println("Iniciar carrera " + getInfoBasica() + ".");
    }

    @Override
    public String toString() {
        return " Deportivo: " + super.toString() + " Potencia: " + caballos + " Caballos , Modo Carrera: " + (modoCarrera ? "Si" : "No");
    }
}
