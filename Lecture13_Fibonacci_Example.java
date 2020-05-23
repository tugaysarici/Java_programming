// Fibonacci

package javaapplication1;

public class JavaApplication1 {
    

    public static void main(String[] args) {
	
        //fibanacci: 1 1 2 3 5 8 13 21 . . .
        int f = 1;
        int l = 0;
        int tut;
        for(int i=0; i<10; i++){
            System.out.println(f);
            tut = f;
            f += l;
            l = tut;
        }
        
        //İkinci yol
        // 1 1 2 3 5 8 13 21
        // a b c
        //   a b c
        //     a b c
        int a = 1;
        int b = 1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=0; i<10; i++){
            c = a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
	
	//Dizilerle Fibonacci Hesabı
        int fibo[] = new int[10];
        fibo[0] = 1;
        fibo[1] = 1;
        for(int i = 0; i<8; i++){
            fibo[i+2] = fibo[i] + fibo[i+1];
        }
        for(int i=0; i<10; i++){
            System.out.println(fibo[i]);
        }

    }  
}
