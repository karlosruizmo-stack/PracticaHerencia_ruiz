public class CocheElectrico extends Coche {
    private int autonomia;
    private double tiempoCarga;

    public CocheElectrico(String marca, String modelo, double precio, int vel, int autonomia, double tiempo) {
        super(marca, modelo, precio, vel);
        this.autonomia = autonomia;
        this.tiempoCarga = tiempo;
    }

    @Override
    public String toString() {
        return "electrico: " + super.toString() + "autonomía: " + autonomia + "km | Carga: " + tiempoCarga + "h";
    }
}
