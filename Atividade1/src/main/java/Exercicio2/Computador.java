
package Exercicio2;

public class Computador {
    String marca, cor, modelo;
    int nSerie;
    double preco;
    
    void imprimir(){
        System.out.println("Marca do computador: " + this.marca);
        System.out.println("Cor do computador: " + this.cor);
        System.out.println("Modelo do computador: " + this.modelo);
        System.out.println("Numero de Série do computador: " + this.nSerie);
        System.out.println("Preco do computador: R$" + this.preco);
        System.out.println();
    }
    
    void calcularValor(){
        if ("HP".equals(this.marca)){
            this.preco += this.preco * 0.3;
        } else if ("IBM".equals(this.marca)){
            this.preco += this.preco * 0.5;
        }
    }
    
    void alterarValor(double valor){
        if(valor > 0){
            this.preco = valor;
            System.out.println("Preco alterado com sucesso!");
            System.out.println();
        } else {
            System.out.println("Nao foi possivel modificar o preco!");
            System.out.println();
        }
        
    }
}
