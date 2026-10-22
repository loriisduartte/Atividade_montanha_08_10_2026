import java.util.Scanner;

// Classe App
public class App {
   

// Metodo main
    public static void main(String[] args) throws Exception {
    
    // Declaração das variáveis do programa

    Scanner ler = new Scanner(System.in);

        String senha = "";
        String resultado = "";

        boolean senhaAprovada = false;

        System.out.println("===== Avaliador de senhas =====");

        // WHILE: repete até a senha ser aprovada
        while (senhaAprovada == false) {

            System.out.println("Digite sua Senha:");

            senha = ler.nextLine();

            // Chama o segundo método para avaliar a senha
            resultado = avaliarSenha(senha);

            // Exibe a mensagem devolvida pelo método
            System.out.println(resultado);

            // Verifica se a senha foi aprovada
            if (resultado.equals("SUCESSO: Sua senha passou nos critérios básicos!")) {

                senhaAprovada = true;

            } // Fecha o IF

        } // Fecha o WHILE

        ler.close();

}
    // MÉTODO 2: AVALIAR SENHA
    public static String avaliarSenha(String senha) {

        // REGRA 1: VERIFICAR O TAMANHO DA SENHA

        if (senha.length() < 8) {

            return "DICA: A senha deve ter no mínimo 8 caracteres.";

        } // Fecha o IF do tamanho


        // REGRA 2: VERIFICAR SE EXISTE UM NÚMERO

        boolean temNumero = false;

        for (int i = 0; i < senha.length(); i++) {

            char caractere = senha.charAt(i);

            if (Character.isDigit(caractere)) {

                temNumero = true;
                break;

            } // Fecha o IF do número

        } // Fecha o FOR do número

        // Verifica se o FOR encontrou algum número
        if (temNumero == false) {

            return "DICA: Adicione pelo menos um número à sua senha.";

        } // Fecha o IF


        // REGRA 3: VERIFICAR SENHAS ÓBVIAS

        String[] senhasObvias = {"12345678", "senha123", "admin123"};

        for (int i = 0; i < senhasObvias.length; i++) {

            if (senha.equals(senhasObvias[i])) {

                return "ALERTA: Esta senha é muito comum ou óbvia.";

            } // Fecha o IF da comparação

        } // Fecha o FOR das senhas óbvias


        // REGRA 4: VERIFICAR LETRA MAIÚSCULA

        boolean temMaiuscula = false;

        for (int i = 0; i < senha.length(); i++) {

            char caractere = senha.charAt(i);

            if (Character.isUpperCase(caractere)) {

                temMaiuscula = true;
                break;

            } // Fecha o IF da letra maiúscula

        } // Fecha o FOR da letra maiúscula

        // Verifica se encontrou alguma letra maiúscula
        if (temMaiuscula == false) {

            return "DICA: Adicione pelo menos uma letra maiúscula à sua senha.";

        } // Fecha o IF


        // RESULTADO FINAL
        // Só chega aqui se passar pelas quatro regras

        return "SUCESSO: Sua senha passou nos critérios básicos!";
     }

            }















      


        

    
  
  
  
  
  
  
  
    
        
    
