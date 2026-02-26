public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int vida, int ataque, int defensa, int fuerza) {
        super(nombre, vida, ataque, defensa);
        this.fuerza = fuerza;
    }

    public void atacar(Personaje objetivo) {
        System.out.println(getNombre() + " lanza un shatter");
        int golpe = getAtaque() + fuerza;
        objetivo.recibirDano(golpe);
    }
}
