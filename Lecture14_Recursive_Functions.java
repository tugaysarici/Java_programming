//Öz yineleme (RECURSİVE)

package javaapplication1;

public class JavaApplication1 {
    
    //1-10 arası sayıların toplanması
    public static int f(int x){
        if(x == 10) return 10;
        return x + f(x+1);
    }
    
    //fibonacci hesabı
    public static int fibo(int n){
        if(n == 0) return 1;
        if(n == 1) return 1;
        return fibo(n-1) + fibo(n-2);
    }
    
    public static void main(String[] args) {
        //1-10 arası sayıların toplamı
        System.out.println(f(0));
        
        //fibonacci hesabı
        for(int i=0; i<=10; i++){
            System.out.println(fibo(i));            
        }
        
    }  
}
