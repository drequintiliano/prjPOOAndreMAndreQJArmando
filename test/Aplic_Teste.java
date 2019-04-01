
import fatec.poo.model.Pessoa;
import java.util.Scanner;

 // @author Armando
 
public class Aplic_Teste {
    public static void main(String[] args) {        
        Scanner entrada = new Scanner(System.in);        
        
        String CPF;
        do{
        System.out.print("Digite o CPF: ");
        CPF = entrada.next();
        
        if(Pessoa.validarCPF(CPF)){
            System.out.println("\nCPF Válido!");
        }else{
            System.out.println("\nCPF Inválido!");
        }      
    }while(CPF!="0");

    }
}
