public class Coche {
    private String marca;
    private String modelo;
    private double precio;
    private int velMaxima;
    private Rueda[] ruedas; 

    public Coche(String marca, String modelo, double precio, int velMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.velMaxima = velMaxima;
        this.ruedas = new Rueda[]{
                new Rueda(0.0, "Nuevo"), new Rueda(0.0, "Nuevo"),
                new Rueda(0.0, "Nuevo"), new Rueda(0.0, "Nuevo")
        };
    }

    public String getInfoBasica() {
        return marca + " " + modelo + " (" + velMaxima + " km/h) - $" + precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(getInfoBasica() + "\nEstado de ruedas:\n");
        for (int i = 0; i < ruedas.length; i++) {
            sb.append("Rueda").append(i + 1).append(": ").append(ruedas[i]).append("\n");
        }//Esto lo pregunte por ia
        return sb.toString();
    }
}
