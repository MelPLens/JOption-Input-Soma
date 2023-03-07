
import javax.swing.JOptionPane;


public class exercicios3 {
   //EXERCICIO 2
//Faça uma classe Java que receba dois números inteiros
//positivos como entrada do usuário através da classe
//JOptionPane e imprima todos os números que estão entre o
//primeiro e o segundo número informado. Utilize a estrutura
//de repetição while para este exercício. (Ex: Entrada: 2 e 7
//saída: 3, 4, 5, 6).

public class exercicios {
    
public static void main(String[] args) {
 int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,
 "Digite o 1º número de 2"));
 int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,
 "Digite 2º número de 2"));
 int i = num1+1;
 while(i<num2){

 System.out.println(i);
 i++;
}
}
} 
}
