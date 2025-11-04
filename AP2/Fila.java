import java.util.NoSuchElementException;

public class Fila {

    private int[] elementos;
    private int inicio;
    private int fim;
    private int contador;
    
    public Fila() {
        this.elementos = new int[5];
        this.inicio = 0;
        this.fim = 0;   
        this.contador = 0;
    }

    public void enfileirar(int valor) {
        if (this.contador == 5) {
            System.out.println("Erro: Fila cheia! Valor " + valor + " não foi adicionado.");
        } else {
            this.elementos[this.fim] = valor;

            this.fim = (this.fim + 1) % 5;

            this.contador++;
            System.out.println("Valor " + valor + " enfileirado.");
        }
    }

    public int desenfileirar() {
        if (this.contador == 0) {
            throw new NoSuchElementException("Erro: Fila vazia!");
        } else {
            int valorRemovido = this.elementos[this.inicio];

            this.inicio = (this.inicio + 1) % 5;
    
            this.contador--;
            
            return valorRemovido;
        }
    }
}