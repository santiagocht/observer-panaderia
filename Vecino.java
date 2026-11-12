public class Vecino implements Observer {

    String nombre;

    public Vecino(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Hola " + nombre + " ha llegado la notificación: " + mensaje);
        System.out.println(nombre + ": Ya va por pan");
    }
}