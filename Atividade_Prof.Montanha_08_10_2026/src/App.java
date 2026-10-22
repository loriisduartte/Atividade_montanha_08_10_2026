import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
           //Contruindo as variáveis e os comandos do programa

        Scanner ler = new Scanner(System.in);
        String senha = "";
        String [] senhasobvias = {"12345678", "senha123", "admin123"};
        System.out.println("========== Avaliador de senhas ========");
        System.out.println ("Digite sua Senha");
        senha = ler.nextLine();
        if (senha.length()<8) {
            System.out.println("A senha deve ter no mínimo 8 caracteres");
        }
        System.out.println ("Senha em avaliação");
        boolean temNumero = false; 
        
        for (int i = 0; i <senha.length(); i++){

            if (temNumero == false) {
            System.out.println("A senha deve ter pelo menos um caractere numérico");

            
            char caractere = senha.charAt(i);

            if (Character.isDigit(caractere)) {
                temNumero = true;
                 break;
           
       for 














           }}}

        ler.close();
        


        

    
  
  
  
  
  
  
  
    
        }
    }
