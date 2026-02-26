public class Mago extends Personaje {
    private int mana;
    private int poderMagico;

    public Mago(String nombre, int vida, int ataque, int defensa, int mana, int poderMagico) {
        super(nombre, vida, ataque, defensa);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public void lanzarHechizo(Personaje objetivo) {
        if (mana >= 10) {
            System.out.println(getNombre() + " lanza una bola de agua");
            int golpe = getAtaque() + poderMagico;
            objetivo.recibirDano(golpe);
            mana -= 10;
        } else {
            System.out.println(getNombre() + " no tienes maná suficiente");
        }
    }
}
