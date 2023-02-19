
package Exercicio1;
import java.util.Scanner;


public class Retangulo {
    
    Scanner entrada = new Scanner(System.in);
    double base, altura;
    
    void imprimir(){
        System.out.println("Base de retangulo: " + this.base);
        System.out.println("Base de retangulo: " + this.altura);
        
        if (base == 0 || altura == 0){
            inserirValores();
        }
    }
    
    void mostrarArea(){
        double area = base*altura;
        
        System.out.println("Area de retangulo: " + area);
    }
    
    void mostrarPerimetro(){
        double perimetro = 2*base+2*altura;
        
        System.out.println("Perimetro de retangulo: " + perimetro);
    }
    
    void inserirValores(){
        System.out.println("Digite a base do retangulo: ");
        this.base = entrada.nextDouble();
        System.out.println("Digite a altura do retangulo: ");
        this.altura = entrada.nextDouble();
    }
}
