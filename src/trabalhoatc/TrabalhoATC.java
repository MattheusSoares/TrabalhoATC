package trabalhoatc;

import java.io.IOException;
import java.util.Scanner;
import trabalhoatc.TagReader;
import trabalhoatc.FileManager;

public class TrabalhoATC {

    public static void main(String[] args) throws IOException {
        FileManager manager = new FileManager();
        System.out.println("Aspectos Teóricos da Computação");
        System.out.println("Entre com os comandos desejados:");

        Scanner sc = new Scanner(System.in);
        Integer op = 0;
        while (op != 1) {

            String tag = sc.next();

            switch (tag) {

                case ":f":
                    System.out.println("Dividindo tags do arquivo...");
                    /*    divisão de tags do arquivo informado    */
                    break;
                case ":l":
                    System.out.println("Carregando um arquivo com definições de tags...");
                    manager.FileReading("Test.txt");

                    break;
                case ":o":
                    System.out.println("Especificando o caminho do arquivo de saída para a divisão de tags...");
                    /*    especifica o caminho do arquivo de saída para a divisão de tags*/
                    break;
                case ":p":
                    System.out.println("Realizando a divisão em tags da entrada informada...");
                    /*    realiza a divisão em tags da entrada informada*/
                    break;
                case ":q":
                    op = 1;
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                case ":s":
                    System.out.println("Salvando as tags...");
                    manager.FileWriting("Test.txt", "tags n' stuff:");
                    break;
                default:
                    if (tag.equals(tag.toUpperCase()) && ":".equals(tag.substring(tag.length() - 1))) {

                        /*
                    Fazer tratamento das tags, verificar a digitação

                    Realizar as operações das tags de comando: escrita e leitura de 
                    arquivo; salvamento de tags e afins
                         */
                    } else {
                        System.out.println("[ERROR] Padrão de tag não aceito");
                    }
                    break;
            }
            System.out.println("Entre com os comandos desejados:");
        }

    }

}
