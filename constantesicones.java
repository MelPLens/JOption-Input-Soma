package caixa.de.dialogo;
import javax.swing.JOptionPane;

public class CaixaDeDialogo {
    
    public static void main(String[] args) {
        
        int num1, num2, resultado;
        num1= Integer.parseInt(JOptionPane.showInputDialog("insira o primeiro numero")); // o integer é para converter string para int(inteiro)
        num2= Integer.parseInt(JOptionPane.showInputDialog("insira o segundo numero"));
        resultado = num1+num2;
        System.out.println("O resultado da soma é :"+ resultado);
        JOptionPane.showMessageDialog(null,"O Resultado da soma é :" + resultado, "RESULTADO",JOptionPane.QUESTION_MESSAGE); // apos a virgula do resultado, é colocado o " RESULTADO" no qual seria o tirulo,JoptionPane mais o icone para adiocionar na caixa
        
        //CONSTANTES
        
     
    }
    
}
