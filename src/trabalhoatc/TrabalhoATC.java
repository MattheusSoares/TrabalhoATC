package trabalhoatc;

import java.util.Scanner;
import trabalhoatc.TagReader;
import trabalhoatc.FileManager;

public class TrabalhoATC {

    public static void main(String[] args) {
        /*
            String op = new String();
            While(op!=":q"){
                ->código abaixo
                op = tag;
            }
        
        */
            Scanner sc = new Scanner(System.in);
            
            String tag = sc.next();
            System.out.println(tag);
            /*
            Fazer tratamento das tags, verificar a digitação
            
            Realizar as operações das tags de comando: escrita e leitura de 
            arquivo; salvamento de tags e afins
            
            */
            
            /*if (tag.equals(":l")){
                CARREGAR TAGS DO ARQUIVO
            }*/
            
                        
            String value = sc.next();
            System.out.println(value);
            
            /*Verificar e validar valor de value*/
                        
            sc.close();
    }
    
}
