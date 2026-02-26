public class Rueda {
    private double desgaste;
    private String estado;  

    public Rueda(double desgaste, String estado) {
        this.desgaste = desgaste;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "[Estado: " + estado + ", Desgaste: " + (desgaste * 100) + "%]";
    }
}
