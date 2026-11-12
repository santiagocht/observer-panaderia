public interface Observable {
    void suscribir(Vecino v);
    void desuscribir(Vecino v);
    void notificar(String mensaje);
}