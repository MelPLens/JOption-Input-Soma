package Joptionpane;
import javax.swing.JOptionPane;

public class ExerciciosPane {
    
    
    public static void main(String[] args) {
        
        int num1, num2, resultado; // int do tipo primitivo
        num1= Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero")); // o integer é para converter string para int(inteiro)
        num2= Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
        resultado = num1+num2;
        System.out.println("O resultado da soma é :"+ resultado);
         JOptionPane.showMessageDialog(null,"O Resultado da soma é :" + resultado, "RESULTADO",JOptionPane.QUESTION_MESSAGE); 
        // apos a virgula do resultado, é colocado o " RESULTADO" no qual seria o tirulo,JoptionPane mais o icone para adiocionar na caixa
        
 
     
    }
    
}
