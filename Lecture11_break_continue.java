//Break & Continue

package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
		
        //break ile sadece döngü kırılır.
        for(int i=0; i<10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        
        //continue döngüdeki mevcut değeri atlar.
        for(int i=0; i<10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
     
    }  
}
