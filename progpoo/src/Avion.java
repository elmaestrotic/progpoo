public class Avion {
    //atributos
    private String modelo;
    private int capacidad;
    private String aerolinea;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    //Métodos

    public Avion() {//constructor por default
    }


    public Avion(String modelo, int capacidad) {//constructor que recibe dos parámetros
        this.modelo = modelo;
        this.capacidad = capacidad;
    }


    public Avion(String modelo, int capacidad, String aerolinea) {//constructor explícito
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.aerolinea = aerolinea;
    }

    void encender() {
        System.out.println("Avión encendido");
    }

    void acelerar() {
        System.out.println("Avión acelerando");
    }

    void despegar() {
        System.out.println("Aviónen el aire");
    }

    void volar() {
        System.out.println("Avión planeando");
    }

    void aterrizar() {
        System.out.println("Avión tocando tierra");
    }

    @Override
    public String toString() {
        return "Avion{" +
                "modelo='" + modelo + '\'' +
                ", capacidad=" + capacidad +
                ", aerolinea='" + aerolinea + '\'' +
                '}';
    }
}
