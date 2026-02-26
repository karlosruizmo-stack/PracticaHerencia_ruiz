public  class Programador extends Empleados {
    private String lenguaje;
    private int horasextra;

    public Programador(String nombre, String apellido, int salario, String departamento, String lenguaje, int horasextra) {
        super(nombre, apellido, salario, departamento);
        this.lenguaje = lenguaje;
        this.horasextra = horasextra;
    }

    public Programador(String lenguaje, int horasextra) {
        this.lenguaje = lenguaje;
        this.horasextra = horasextra;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public int getHorasextra() {
        return horasextra;
    }

    public void setHorasextra(int horasextra) {
        this.horasextra = horasextra;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "lenguaje='" + lenguaje + '\'' +
                ", horasextra=" + horasextra +
                '}';
    }
}
