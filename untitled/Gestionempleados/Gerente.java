public  class Gerente extends Empleados {
    private String bonus;
    private int empleadosacargo;

    public Gerente(String nombre, String apellido, int salario, String departamento, int lenguaje, int horasextra) {
        super(nombre, apellido, salario, departamento);
        this.bonus = lenguaje;
        this.empleadosacargo = horasextra;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public int getEmpleadosacargo() {
        return empleadosacargo;
    }

    public void setEmpleadosacargo(int empleadosacargo) {
        this.empleadosacargo = empleadosacargo;
    }
}
