package Joptionpane;
import javax.swing.JOptionPane;

public class ExerciciosPane {
    
    public static void main(String[] args) {
        
     
        Object[] Itens= {"ADS","Gestao de TI","Banco de dados"};// object seria um array
        JOptionPane.showInputDialog(null,"Escolha um curso","CURSOS FACENS",// subtitulo"Escolha um curso" e titulo da caixa " CURSOS FACENS"
        JOptionPane.QUESTION_MESSAGE,null,Itens,"ADS"); // o ads é o que aparecera na barra de escolhas na primeira vista do usuario
       
      
    
    }
    
}
