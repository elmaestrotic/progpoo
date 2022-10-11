public class Main {

    public static void main(String[] args) {

        Avion obj1 = new Avion("2020", 100, "Avianca");

        obj1.encender();
        obj1.acelerar();
        obj1.despegar();
        obj1.volar();
        obj1.aterrizar();

        Avion obj2 = new Avion("2021", 80);
        obj2.encender();
        obj2.acelerar();
        obj1.despegar();

        Avion obj3 = new Avion();
        obj3.encender();
        obj3.setCapacidad(20);//modificar capacidad mediante método setCapacidad
       obj1.setAerolinea("Viva Colombia");

        System.out.println("La aerolínea actual del primer avión es: "+obj1.getAerolinea());
        System.out.println(obj2);
        System.out.println(obj3);


        Avioneta obj4 = new Avioneta();//clase heredada

                obj4.encender();
                obj4.despegar();
                obj4.volar();

    }


}
