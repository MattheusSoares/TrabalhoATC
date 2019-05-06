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

            System.out.println(tag.indexOf(":"));

            char[] aux = new char[2];
            for (int i = 0; i < 2; i++) {
                aux[i] = tag.charAt(i);
            }

            String subtag = new String(aux);

            switch (subtag) {

                case ":f":
                    System.out.println("[INFO] Dividindo tags do arquivo...");
                    /*    divisão de tags do arquivo informado    */
                    break;
                case ":l":
                    System.out.println("[INFO] Carregando um arquivo com definições de tags...");
                    manager.FileReading("Test.txt");

                    break;
                case ":o":
                    System.out.println("[INFO] Especificando o caminho do arquivo de saída para a divisão de tags...");
                    /*    especifica o caminho do arquivo de saída para a divisão de tags*/
                    break;
                case ":p":
                    System.out.println("[INFO] Realizando a divisão em tags da entrada informada...");
                    /*    realiza a divisão em tags da entrada informada*/
                    break;
                case ":q":
                    op = 1;
                    System.out.println("[INFO] Saindo...");
                    System.exit(0);
                    break;
                case ":s":
                    System.out.println("[INFO] Salvando as tags...");
                    manager.FileWriting("Test.txt", "tags n' stuff:");
                    break;
                default:
                    if (tag.equals(tag.toUpperCase()) && ":".equals(tag.substring(tag.length() - 1))) {
                        /*
                        
                        Fazer tratamento das tags, verificar a digitação
                        Tratamento da expressão regular 
                        Tratamento dos valores das tags
                        
                        
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
