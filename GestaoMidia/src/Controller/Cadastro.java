package Controller;

public interface Cadastro <T> {
    void adicionar (T item);
    void remover (T item);
    void listar();
}
