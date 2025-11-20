package ABSTRACT;
public abstract class Personaje {
    private String nombre;
    protected int vida;
    protected int ataque;
    protected int defensa;
    protected int danoRealUltimoAtaque = 0;

    public Personaje(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public int getDanoRealUltimoAtaque() {
        return danoRealUltimoAtaque;
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void realizarAtaque(Personaje contrario) {
        // Activar la estrategia antes de atacar
        this.usarEstrategia();
        // Enviar el ataque directamente al contrario
        contrario.recibirAtaque(this.ataque);  // pasar el valor de ataque 
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void recibirAtaque(int dano) {
        int danoReal = dano - defensa;
        if (dano < defensa) {
            danoReal = 0;
        }
        this.danoRealUltimoAtaque = danoReal;

        vida -= danoReal;
        if (vida <= 0) {
            vida = 0;
        }

        System.out.println(nombre + " recibe " + danoReal + " de daño. Vida restante: " + vida);

    }

    public void curar(int cantidad) {
        this.vida += cantidad;
        System.out.println(this.nombre + " es curado con " + cantidad +
                " puntos. Vida actual: " + this.vida);
    }

    //denifir metodo abstracto  usarEstrategia
    public abstract void usarEstrategia();


}

