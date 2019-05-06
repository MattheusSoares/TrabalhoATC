package trabalhoatc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mattheus
 */
public class FileManager {
    String fileName = "sample.txt";
    

    public void setFileName(String s){
        this.fileName = s;
    }
    
    public String getFileName(){
        return this.fileName;
    }
    
    
    public void FileWriting(String file_name, String fileContent) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_name));
        bufferedWriter.write(fileContent);
        bufferedWriter.close();

    }

    public void FileReading(String file_name) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file_name));
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();

    }

}
