public class Personaje {
    private String nombre;
    protected int vida;
    protected int ataque;
    protected int defensa;

    public Personaje(String n, int v, int a, int d) {
        this.nombre = n;
        this.vida = v;
        this.ataque = a;
        this.defensa = d;
    }
  public void realizarAtaque(Personaje contrario) {
        // Activar la estrategia antes de atacar
        usarEstrategia();
        // Enviar el ataque directamente al contrario
        contrario.recibirAtaque(this.ataque);  // pasar el valor de ataque 
    }
    //escribir métodos solicitados en la hoja de desarrollo
    public void recibirAtaque(int dano) {
           //implementar
   }
   //denifir metodo abstracto  usarEstrategia
    public abstract void usarEstrategia();

