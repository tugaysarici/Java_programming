//Dosyalar (FILES)

package javaapplication1;

// sadece import java.io.*; yazarak io.nın altındakileri import edebiliriz.
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaApplication1 {
    
    public static void main(String[] args) {

        //Belgelerime a.txt diye bir dosya açmadan çalışmaz
        File f = new File("a.txt");
        try{
            // Dosyayı acip akrakter karakter okuduk
            FileReader fr = new FileReader(f);
            int c = fr.read();
            while(c!=-1){
                //k'ye type cast yapmazsak ascii değerlerini alırdık.
                char k = (char) c;
                System.out.print(k + " ");
                c = fr.read();
            }
            fr.close();
            
            //BufferedReader ile bir satırı komple okuduk.
            f = new File("a.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            System.out.println(br.readLine());
            br.close();
            //out.txt oluşturulur ve icine Deneme mesaji yazilir.
            File out = new File("out.txt");
            FileWriter fw = new FileWriter(out);
            fw.write("Deneme mesaji");
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }  
}
