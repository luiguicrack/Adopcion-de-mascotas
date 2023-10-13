package logica;

public class Perro extends Mascota {
    private int nivelEntrenamiento;

    public Perro(String nombre, String raza, String color, int edad, int nivelEntrenamiento, boolean disponible) {
        super(nombre, raza, color, edad, disponible);
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    public int getNivelEntrenamiento() {
        return nivelEntrenamiento;
    }

    public void setNivelEntrenamiento(int nivelEntrenamiento) {
        this.nivelEntrenamiento = nivelEntrenamiento;
    }

    
}
