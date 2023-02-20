
package Exercicio2;

public class PrincipalComputador {
    public static void main(String[] args) {
        Computador computador1 = new Computador();
        
        computador1.marca = "IBM";
        computador1.cor = "Preto";
        computador1.modelo = "Personal Computer";
        computador1.nSerie = 5201516;
        computador1.preco = 1399.99;
        
        
        computador1.imprimir();
        computador1.calcularValor();
        computador1.imprimir();
        computador1.alterarValor(500.68);
        computador1.imprimir();
        computador1.alterarValor(-500.68);
        computador1.imprimir();
    }
}
