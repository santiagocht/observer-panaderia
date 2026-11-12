import java.util.ArrayList;

public class Panaderia implements Observable {

    private ArrayList<Vecino> vecinosSuscritos = new ArrayList<>();

    public void sacarPan() {
        System.out.println(">> Salio el pan caliente");
        notificar("Hay pan fresco");
    }

    @Override
    public void suscribir(Vecino v) {
        System.out.println("Se ha suscrito el vecino: " + v.nombre);
        vecinosSuscritos.add(v);
    }

    @Override
    public void desuscribir(Vecino v) {
        System.out.println("Se ha desuscrito el vecino: " + v.nombre);
        vecinosSuscritos.removeIf(
            veci -> veci.nombre.equals(v.nombre)
        );
    }

    @Override
    public void notificar(String mensaje) {
        for (Vecino v : vecinosSuscritos) {
            v.actualizar(mensaje);
        }
    }
}