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

        /*
         * double => tipo de dado primitivo que salva numeros reais em uma faixa de valores.
         * O tipo double salva o dobro de dados do que o float e podemos ou nao acompanhar o valor final
         * com 'd' minusculo.
         */
        double numeroDouble;
        numeroDouble = 7;

        

        System.out.println(numeroDouble);

            /*testes Aritméticos (+, -, *, /, %)
                Relacionais (==, !=, >, <, >=, <=)
                Lógicos (&&, ||, !)
                Incremento e Decremento (++, --)
                Atribuição (=, +=, -=, *=, /=, %=)*/

        int x = 2 + 4;
        int y = 4;
        System.out.println(x);
        x = x - 1;
        System.out.println(x);
        x = 4*(8/2);
        System.out.println(x);
        x = 4 + 2;
        System.out.println(x);
        x --;
        System.out.println(x);
        x ++;
        System.out.println(x);
        x = x + 4;
        System.out.println(x);
        x %= 2 *(2);
        System.out.println(x);
        if(x == y){
            y-= 2;
            System.out.println(y);
            x += 2;
            System.out.println(x);
        }else{
            y *= x;
        }
        boolean f = true;

        if(!f || x >= 3){
            x++;

        }else{
            if(y != x && x <= 2){
                x = 2 + (6 * 2);
            }
            f = false;
        }
        System.out.println(x);
        System.out.println(f);
        System.out.println(y);

        int n1 = 12;
        if(n1 > 0){
            System.out.println("Positivo");
        }else if(n1 == 0){
            System.out.println("Zero");
        }else{
            System.out.println("Negativo");
        }

        switch (2) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;

            default:
            System.out.println("Erro");
                break;
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 0;
        while (i < 10) {
            System.out.println(1 + i);
            i++;
            
        }
    }
}