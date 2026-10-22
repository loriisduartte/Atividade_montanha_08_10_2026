## Avaliador de Senhas


## 1. Apresentação do projeto

Disciplina: Algoritmos e Lógica de Programação
Professor: Alexandre Montanha
Linguagem: Java
Projeto: ValidaSenhaForte

Esta atividade foi elaborada com a finalidade de desenvolvimento de um programa Java que avalia senhas fictícias conforme critérios  definidos no exercício.

## 2. Objetivo do programa (Feature)

* Feature: Avaliar senha conforme critérios didáticos.
* Necessidade: Permitir que o usuário digite uma senha fictícia e receba orientações quando ela não atender aos requisitos definidos.
* Resultado esperado: O programa deve identificar a primeira regra não atendida e solicitar outra tentativa até que a senha seja    aprovada.

O programa foi pensado para permitir que o usuário digite uma senha e receba uma orientação sobre as regras que não foram atendidas.

Para que a senha seja aprovada o usuário precisa criar uma senha com os seguintes rerquisitos:

1. Possuir pelo menos 8 caracteres.

2. Conter pelo menos um número.

3. Não ser igual a uma das senhas óbvias cadastradas no vetor.

4. Conter pelo menos uma letra maiúscula.

Observação: Caso a senha seja reprovada, o programa solicita uma nova tentativa. O processo continua até que uma senha seja aprovada.



## 3. Estrutura do programa

O código está organizado dentro da classe App, utilizando dois métodos: 
Método main()

O método main() é responsável por iniciar o programa e controlar a interação com o usuário.

Nele são utilizados:

Scanner: recebe a senha digitada.

String senha: armazena temporariamente a entrada.

String resultado: recebe a mensagem da avaliação.

boolean senhaAprovada: controla o encerramento do programa.

while: permite repetir as tentativas até a aprovação.

System.out.println(): apresenta as orientações no console.

O método main() chama avaliarSenha(senha) e recebe a mensagem devolvida pela avaliação.

Método avaliarSenha(String senha)

O método avaliarSenha() recebe uma String como parâmetro, verifica as regras da atividade e retorna uma mensagem.

As verificações são realizadas conforme a seguir:

1. Primeira verificação — Comprimento

Utiliza if e length() para verificar se a senha possui pelo menos oito caracteres.

2. Segunda verificação — Presença de números

Utiliza um laço for para percorrer a senha. Os comandos charAt() e Character.isDigit() permitem verificar se existe algum dígito.

A variável booleana temNumero registra o resultado da busca.

3. Terceira verificação — Senhas óbvias

Utiliza um vetor String[] contendo as senhas "12345678", "senha123" e "admin123".

O laço for percorre o vetor e o método equals() compara a senha digitada com cada elemento.

4. Quarta verificação — Letras maiúsculas

Utiliza for, charAt() e Character.isUpperCase() para verificar se existe alguma letra maiúscula.

A variável booleana temMaiuscula registra o resultado.

Retorno do resultado

O comando return devolve a mensagem da primeira regra não atendida, encerrando a execução do método. Se nenhuma regra falhar, o método retorna a mensagem de sucesso.

## 4. Como executar o projeto

Abrir a pasta do projeto no Visual Studio Code.

Verificar se o JDK e as extensões de Java estão configurados.

Abrir o arquivo src/App.java.

Clicar em Run para executar a classe App.

Digitar uma senha fictícia no console e pressionar Enter.

Observar a mensagem de avaliação.

Se a senha for reprovada, digitar uma nova senha.

O programa será encerrado após uma aprovação.

## 5. Testes de funcionamento

1° Teste: Scanner e exibição da mensagem: 

Nesta etapa o scanner foi declarado para  ler os dados que o usuário fornece, para posteriormente avaliarmos a senha escolhida por ele. Definimos a String senha para que possamos receber o texto digitado pelo usuário, após o recebimento da entrada de dados é solicitado que seja feita a leitura do que o usuário nos forneceu.

2° Teste: Leitura do número de caracteres da senha: 

Foram colocados códigos para avaliar a quantidade de números em que a senha possui, dentro do for foi criada uma variável int para representar em qual posição o caractere numérico que está sendo verificado. 


3° teste: Achar pelo menos um caractere numérico na senha:

Neste teste, o for foi utilçizado para percorrer os caracteres da senha e verificar se existe pelo menos um número. O comando Character.isDigit(caractere) identifica se o caractere analisado é numérico. Quando encontra um número, a variável temNumero passa a ser verdadeira (true) e o break interrompe a repetição. Se nenhum número for encontrado, o programa retorna solicitando que o usuário adicione pelo menos um número na senha.

4° Teste: Criando o vetor de senhas proibidas

Nesta etapa, foi criado um vetor chamado senhasObvias, que verifica três senhas que não devem ser aceitas pelo programa.

Senhas proibidas: 12345678, senha123, admin123.

O for percorre cada posição do vetor e o equals() compara a senha digitada com as senhas armazenadas. Se encontrar uma senha exatamente igual, o programa retorna uma mensagem de alerta. Caso contrário, continua para a próxima verificação.

O método equals() diferencia letras maiúsculas de minúsculas. Por isso, senha123 é diferente de Senha123.

5° Teste: Verificar a existência de letras maiúsculas

Nesta etapa, foi adicionado a condição para verificar se a senha contém pelo menos uma letra maiúscula. Primeiro, criamos a variável temMaiuscula com o valor false. Em seguida, o for para percorre os caracteres da senha. O charAt(i) identifica o caractere da posição atual e o Character.isUpperCase() verifica se ele é uma letra maiúscula. Caso encontre uma letra maiúscula, a variável passa a ser verdadeira e o break interrompe a busca. Se nenhuma letra maiúscula for encontrada, o programa retorna uma mensagem solicitando a correção.

6° Teste: Repetição de tentativas com while

Nesta etapa, utilizamos o while para permitir que o usuário digite uma nova senha quando a anterior não atender aos requisitos. O while mantém o programa em execução enquanto a variável senhaAprovada for falsa.A cada tentativa, o programa recebe uma nova senha e chama o método avaliarSenha para verificar os critérios. O resultado é apresentado ao usuário através do System.out.println().

Quando a senha é aprovada, a variável senhaAprovada passa a ser verdadeira (true), encerrando a repetição.

Senhas utilizadas nos testes: 

caneca: Solicitar no mínimo 8 caracteres

Abcdefgh: Solicitar pelo menos um número

senha123: Alertar sobre senha óbvia

abcdefgh9:Solicitar letra maiúscula

Abcdefg1: Senha aprovada

Senha123: Senha aprovada

Gat0Gat0_Verd3!: Senha aprovada

Teste de múltiplas tentativas: executar o programa e informar, nessa ordem, caneca, senha123 e Abcdefg1. Verificar se as duas primeiras tentativas são reprovadas e se a execução termina após a terceira, o código tem o comando para verificar se condição do boolean é falsa, e caso não tenha números na senha o sistema indicará ao usuário que ele precisa colocar pelo menos um número na senha. 

## 6. Reflexão sobre segurança de senhas

A atividade despertou uma nova preocupação em relação as senhas, pessoalmente falndo, não dava muita importância até que fui hackeada o que levou a quase perda total de contas do linkedIn, Netflix, G-mail. Minhas senhas são fortes, entretanto notei que elas possuem um padrão específico e que com pouco conhecimento sobre quebra de senhas elas podem ser quebradas em ambientes onde a segurança não é altamente priorizada. 

Percebi que também há uma diferença entre atender a critérios básicos e possuir uma senha realmente forte e segura, e idealizadores desse tipo de projeto tem a responsabilidade de comunicar as possíveis falhas e limitações de senhas óbvias e orientar os usuários sobre segurança.

## 7. Conclusão

A atividade permitiu praticar a organização de um programa Java em métodos, a utilização de estruturas condicionais e de repetição e a análise de caracteres em Strings. A implementação também demonstra a importância de seguir uma ordem de validação e apresentar mensagens específicas para orientar o usuário.
