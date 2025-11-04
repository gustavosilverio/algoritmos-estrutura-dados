public class MyClass {
    public static void main(String[] args) {
        
        // Exercício 01 
        System.out.print("Exercício 01\n");
        Lista lista =  new Lista();
        
        lista.mostrar();
    
        lista.inserir(1);
        lista.inserir(5);
        lista.inserir(7);
        lista.inserir(8);
        lista.inserir(3);
        // lista.inserir(4);
        
        lista.mostrar();
        
        
        // Exercício 02
        System.out.println();
        System.out.print("Exercício 02\n");
        Pilha minhaPilha = new Pilha();

        System.out.println("Empilhando");
        minhaPilha.empilhar(10); 
        minhaPilha.empilhar(20); 
        minhaPilha.empilhar(30); 

    
        System.out.println("Desempilhando");
        System.out.println("Valor desempilhado: " + minhaPilha.desempilhar());
        System.out.println("Valor desempilhado: " + minhaPilha.desempilhar());
        
        
        // Exercício 03
        System.out.println();
        System.out.print("Exercício 03\n");
        Fila minhaFila = new Fila();
        
        System.out.println("Enfileirando");
        minhaFila.enfileirar(10); 
        minhaFila.enfileirar(20); 
        minhaFila.enfileirar(30); 

        System.out.println("Desenfileirando ");
        System.out.println("Valor removido: " + minhaFila.desenfileirar()); 
        System.out.println("Valor removido: " + minhaFila.desenfileirar());

        // Exercício 04
    }
}