package logica;

public class Gato extends Mascota{
    private boolean toxoplasmosis;

    public Gato(String nombre, String raza, String color, int edad, boolean toxoplasmosis, boolean disponible) {
        super(nombre, raza, color, edad, disponible);
        this.toxoplasmosis = toxoplasmosis;
    }

    public boolean isToxoplasmosis() {
        return toxoplasmosis;
    }

    public void setToxoplasmosis(boolean toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }

}