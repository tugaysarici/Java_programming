//Operators

package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        int a=10, b=20, c=30;
        
        //+'lar birleştirme olarak algılanıyor
        System.out.println("Result1: "+ a+b);
        
        //Toplama işlemini yaptıktan sonra birleşmesi sağlanır
        System.out.println("Result2: "+ (a+b));
        
        //Çarpma ve bölme daha öncelikli olduğu için burada sıkıntı çıkmaz
        System.out.println("Result3: "+ a*b);
        //Tam sayılarda işlem yapıldığı için sıfır çıkar.
        System.out.println("Result4: "+ a/b);
        //En baştaki float'a gerek var mıydı? anlamadım
        System.out.println("Result1: "+ (float)((float)a/(float)b));
        
        //Paranteze alınmazsa hata verir.
        System.out.println("Result5: "+ (a-b));
        
        //1011 >> 2 = 0010 (2)
        System.out.println("Result6: "+ (11>>2));
        
        //1011 << 2 = 101100 (44, dört bit olarak ele almadı, genişledi) 
        System.out.println("Result7: "+ (11<<2));
        
        //Pozitif sayılar için >>'den farkı yok. Unsigned shifting olarak kullanılıyor. Yani işaret bitini 0 yapıyor.
        System.out.println("Result8: "+ (-11>>>29));
        
        // ==  != gibi operatorlere daha sonra bakıcaz 
    }  
}
