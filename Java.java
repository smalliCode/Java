public class Java{

    public static void main(String[] args) {


        /*
        * Variavel, tipos e valor:
        * String => tipo da variavel; nome => nome da variavel; aluno => valor da variavel.
        * Em java, String é uma classe que serve para armazenar textos, simbolos e espaços.
        */
        String nome ; // => criando uma variavel.
        nome = "Aluno";// => atribuindo valor a variavel.

        
        System.out.println(nome);// => mostrando o valor da nossa varivel, utilizando o println.

        /*
         * int => tipo de dado primitivo que salva numeros inteiros em uma faixa de valores.
         * A partir daqui vamos apenas descrever os tipos, ja que a definiçao de nome e valor sao os mesmos.
         */
        int numero;
        numero = 3;

        System.out.println(numero);

        /*
         * float => tipo de dado primitivo que salva numeros reais em uma faixa de valores.
         * O tipo float acompanha a letra 'f' em minusculo no final do seu valor.
         */
        float numeroReal = 3.5f; // => podemos fazer a criaçao e atribuiçao ao mesmo tempo.

        System.out.println(numeroReal);

    }
}