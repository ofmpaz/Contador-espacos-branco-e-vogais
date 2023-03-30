# Contador-espacos-branco-e-vogais

Este programa em Java lê uma string digitada pelo usuário e conta o número de espaços em branco e vogais nela presente.

### Como usar
Para utilizar o programa, execute a classe Main. Será solicitado que o usuário digite uma string. Após a digitação, o programa irá contar o número de espaços em branco e vogais presentes na string e imprimir o resultado na tela.

### Como funciona
O programa utiliza a classe Scanner para ler uma string digitada pelo usuário através do método nextLine(). A string é então dividida em palavras usando o método split() e armazenada em um array de Strings.

Em seguida, é definido um array de caracteres contendo as vogais. São criadas variáveis para armazenar o número de espaços em branco e vogais presentes na string.

Dentro do loop for, o programa verifica se a string atual é vazia ou não. Se não for vazia, significa que há um espaço em branco antes dela, e a variável espacosEmBranco é incrementada. Em seguida, é utilizado um segundo loop for para verificar cada caractere da string atual com as vogais. Se um caractere for uma vogal, a variável quantVogais é incrementada.

Por fim, o programa imprime o número de espaços em branco e vogais presentes na string utilizando o método println() da classe System.out.

### Limitações
O programa considera como vogais apenas os caracteres "a", "e", "i", "o" e "u". Caracteres acentuados e letras maiúsculas não são considerados como vogais.

O programa também considera qualquer caractere que não seja uma letra como um espaço em branco. Isso pode levar a uma contagem incorreta em casos onde a string contém caracteres especiais que não deveriam ser contados como espaços em branco.
