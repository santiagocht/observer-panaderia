public class Main {
    public static void main(String[] args) {

        Panaderia panaderia = new Panaderia();

        Vecino ana = new Vecino("Ana");
        Vecino luis = new Vecino("Luis");
        Vecino marta = new Vecino("Marta");

        System.out.println("==============================================");
        System.out.println("       Creamos Panaderia y Vecinos");
        System.out.println("==============================================");

        System.out.println("");
        System.out.println("==============================================");
        System.out.println("          Suscribimos a los vecinos");
        System.out.println("==============================================");

        panaderia.suscribir(ana);
        panaderia.suscribir(luis);
        panaderia.suscribir(marta);

        System.out.println("");
        System.out.println("==============================================");
        System.out.println("     Llega la mañana para sacar el pan");
        System.out.println("==============================================");

        panaderia.sacarPan();

    }
}