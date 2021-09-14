import java.util.Scanner;

public class Products {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========== Dark Store ============");
        System.out.println("Digite o produto que deseja cadastrar");
        String produto = scanner.next();
        System.out.println("Cor:");
        String cor = scanner.next();
        System.out.println("Tamanho:");
        String tam = scanner.next();

        System.out.println("Digite o valor do produto");
        double preco = scanner.nextDouble();

        System.out.println("=========== Cadastro realizado com sucesso! ============");
        System.out.printf("Produto cadastrado:  %s, \n cor: %s \n tamanho: %s \n preço: %f\n",produto, cor, tam, preco);
        System.out.println("Deseja continuar cadastrando?");
    }


    }

