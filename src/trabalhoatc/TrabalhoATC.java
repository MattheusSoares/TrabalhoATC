package trabalhoatc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import trabalhoatc.TagReader;
import trabalhoatc.FileManager;

public class TrabalhoATC {

    public static void main(String[] args) throws IOException {
        FileManager manager = new FileManager();
        System.out.println("Aspectos Teóricos da Computação");
        System.out.println("Entre com os comandos desejados:");

        Integer op = 0;
        while (op != 1) {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String tag = reader.readLine();

            Integer marcador = tag.indexOf(":");
            char[] aux;

            if (marcador != -1) {

                if (marcador == 0) {
                    aux = new char[2];
                    for (int i = 0; i < 2; i++) {
                        aux[i] = tag.charAt(i);
                    }
                } else {
                    aux = new char[marcador];
                    for (int i = 0; i < marcador; i++) {
                        aux[i] = tag.charAt(i);
                    }
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
                        manager.FileWriting("Test.txt", "tags n' stuff:");//provisório
                        break;
                    default:

                        if ((marcador > 0) && (subtag.equals(subtag.toUpperCase())) && " ".equals(tag.substring(subtag.length() + 1, subtag.length() + 2))) {


                            String value;
                            value = tag.substring(subtag.length() + 2, tag.length());

                            if(value.length()>1) TagReader.getInstance().verifyValue();
                            else TagReader.getInstance().setNewTag(subtag, value);
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
            } else {
                System.out.println("[ERROR] Padrão de tag não aceito");
                System.out.println("Entre com os comandos desejados:");
            }

        }

    }
}
