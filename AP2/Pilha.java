public class Pilha {
    private int[] elementos;
    private int topo;
    
    public Pilha() {
        this.elementos = new int[5];
        
        this.topo = -1;
    }

    public void empilhar(int valor) {
        if (this.topo == 5 - 1) {
            System.out.println("Erro: Pilha cheia! Valor " + valor + " não foi empilhado.");
        } else {
            this.topo++; 
            this.elementos[this.topo] = valor;
            System.out.println("Valor " + valor + " empilhado.");
        }
    }

    public Integer desempilhar() {
        if (this.topo == -1) {
            System.out.println("Erro: Pilha vazia!");
            return null;
        } else {
            int valorRemovido = this.elementos[this.topo];
            this.topo--;
            return valorRemovido;
        }
    }
}