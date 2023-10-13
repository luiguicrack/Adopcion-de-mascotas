package logica;

public abstract class Mascota {
    private String nombre;
    private String raza;
    private String color;
    private int edad;
    private boolean disponible;

    public Mascota(String nombre, String raza, String color, int edad, boolean disponible) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    
}  

