/* Classe de exemplo para o exercício da Aula 04 de Variáveis, Tipos de Dado e Operadores Aritméticos */

public class Main {
    public static void main(String[] args) {

        byte b1;
        short s1 = 1000;
        b1 = (byte) s1; // downcast com perda de informação, pois o short tem uma capacidade maior que o byte, então estamos reduzindo a capacidade de representação do short para caber em um byte

        long l1;
        int i1 = 10;
        l1 = i1; // upcast onde o inteiro foi promovido para long, sobrando espaço de representação

        int i2;
        long l2 = 1000000000000000000L;
        i2 = (int) l2; // downcast com perda de informaçao, pois o long tem um valor muito maior do que o limite máximo que um inteiro suporta

        int i3;
        long l3 = 10000L;
        i3 = (int) l3; // downcast sem perda de informação, pois o valor de l3 cabe dentro de um int

        double d1;
        float f1 = 10.5f; // upcast onde o float foi promovido para double, sobrando espaço de representação
        d1 = f1;

        float f2;
        float f3;
        double d2 = 10000.58d;
        f2 = (float) d2; // downcast sem perda de informação, pois o valor de d2 cabe dentro de um float (tem apenas 2 casas decimais)
        double d3 = 10000.5888888888888888888888888888888888888888888d;
        f3 = (float) d3; // downcast com perda de informação, pois o float não suporta tantas casas decimais

        int i4;
        float f4 = 11.5697f; // downcast com perda de informação, pois int não comporta valores fracionados, apenas inteiros
        i4 = (int) f4;

        System.out.println("b1: " + b1);
        System.out.println("l1: " + l1);
        System.out.println("i2: " + i2);
        System.out.println("i3: " + i3);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);
        System.out.println("i4: " + i4);

        b1 = (byte) d3; // downcast com perda de informação, pois o byte é muito pequeno

        System.out.println("b1: " + b1);

    }
}