
/* Classe de exemplo para o exercício da Aula 01 de Variáveis, Tipos de Dados e Operadores Aritméticos.*/

public class criandoVariaveis {

    public static void main(String[] args){

        int i;
        //variável com nome igual > int i;
        int I;
        //variáveis em Java nao podem começar com números > int 1a;
        int _1a;
        int $aq;

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10;
        //"final int" é uma variável constante, ou seja, o valor uma vez atribuído não pode ser modificado > j = 15;
        int asrn24678md;
        //espaço no nome da variável não é permitido > int asrn246 78md;
        int asrn2$4678_md = 10;
        //caracteres especiais nao sao permitidos > int asrn2$46%78_md = 10;

        asrn24678md = 100;
        asrn2$4678_md = 10;

        int quantidadeProduto = 50;
        //nao começa com letra minuscula, nao segue boas praticas > int QuantidadeProduto;
        final int NUMERO_TENTATIVAS = 5;
        //definido como se fosse uma variavel comum, nao seguindo as boas praticas do "final". nao da erro de compilação, mas deve ser evitado > final int numeroTentativas = 5;
        int QUANTIDADE_OPCOES = 25; //segue as boas praticas de "final", não de int, mas não dá erro de compilação.
        //segue as boas práticas de começar com letra minúscula + notação camelo, mas é um nome sem expressividade > int qtdProd;

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);

    }

}