public class Lista {
    private int[] elementos;
    private int contador;

    public Lista() {
        this.elementos = new int[5];
        this.contador = 0;
    }

    public void inserir(int valor) {
        if (this.contador == 5) {
            System.out.println("Erro: A lista está cheia! Valor " + valor + " não foi inserido.");
        } else {
            this.elementos[this.contador] = valor;
            this.contador++;
            
            System.out.println("Valor " + valor + " inserido com sucesso.");
        }
    }

    public void mostrar() {
        if (this.contador == 0) {
            System.out.println("A lista está vazia.");
            return; 
        }

        System.out.println("--- Elementos da Lista ---");
        
        for (int i = 0; i < this.contador; i++) {
            System.out.println(this.elementos[i]);
        }
    }
}