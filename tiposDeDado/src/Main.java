/* Classe de exemplo para o exercício da Aula 02 de Variáveis, Tipos de Dados e Operadores Aritméticos.*/

public class Main {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //o tamanho está ultrapassando o limite que o "short" suporta > short s2 = 40000;

        //o tamanho está ultrapassando o limite que o "int" suporta > int i1 = -100000000000000;
        int i2 = 2000000000;

        long l1 = 10000000000000L;
        long l2 = 20004000500050L;

        //quando se coloca somente o número, sem o "f" no final, interpreta-se como "double" > float f1 = 4.5;
        float f2 = 10.68F;

        double d1 = 85.69;
        double d2 = 99.04D;

        char c1 = 'W';
        //o "char" comporta apenas 1 caracter > char c2 = 'Tw';
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se se et  t AJDISD &*#$& HSJA";

        //String dt1 = "09/02/1993";

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);

    }
}