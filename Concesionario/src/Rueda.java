public class Rueda {
    private double desgaste; // 0.0 a 1.0
    private String estado;   // "Nuevo", "Usado", "Gastado"

    public Rueda(double desgaste, String estado) {
        this.desgaste = desgaste;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "[Estado: " + estado + ", Desgaste: " + (desgaste * 100) + "%]";
    }
}
