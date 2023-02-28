package caixa.de.dialogo;
import javax.swing.JOptionPane;

public class CaixaDeDialogo {
    
    public static void main(String[] args) {
        
        int num1, num2, resultado;
        Object[] Itens= {"ADS","Gestao de TI","Banco de dados"};// object seria um array
        JOptionPane.showInputDialog(null,"Escolha um curso","CURSOS FACENS",// subtitulo e titulo da caixa
        JOptionPane.PLAIN_MESSAGE,null,Itens,"ADS");// sem icone
        
      
        
     
    }
    
}
