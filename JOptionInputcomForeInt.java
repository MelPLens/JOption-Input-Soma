
package Joptionpane;
import javax.swing.JOptionPane;

public class ExerciciosPane {
    // EXERCICIO 1
    
//Faça uma programa Java que receba um número inteiro
//positivo como entrada do usuário através da classe
//JOptionPane e imprima seus divisores (Ex: Divisores de 12
//são os números 1, 2, 3, 4, 6 e 12).
   

    public static void main(String[] args) {
        
        // caixa de entrada - Os dados são lidos como strings, e depois convertidos para inteiros
        String str = JOptionPane.showInputDialog("Digite um número"); 

        int num = Integer.parseInt(str);//integer torna uma string em um numero inteiro
        
           for (int i = 1; i<=num; i++) { // para i for igual a 1 e i for menor ou igual a numero, i vai adicionar + 1 a cada entrada
           if(num%i==0){ // se numero multiplicado por i igual a zero
           System.out.println(i);
 
      }
      }
      }
