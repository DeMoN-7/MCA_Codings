import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class basic {
    public static void main(String[] args) {
        String inputFile="input.txt";
        String outputFile="output.txt";

        try{

        InputStream inputStream = new FileInputStream(inputFile);
        OutputStream outputStream = new FileOutputStream(outputFile);
        byte [] buffer = new byte[1024];
        int byter;
        while ((byter=inputStream.read(buffer))!=-1) {
            outputStream.write(buffer,0,byter);
        }
        }
        catch(Exception e){
            System.out.println(e);
        }
        

    }
}
