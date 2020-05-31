// FONKSİYONLAR (METHODS)
/*
a modifier (public static) a type (int) a functionName (parameters){
  -----
}
*/
// Fonksiyon başlığı altında tanımlanan değişkenler "formal parameters"
// Fonksiyon çağırılırken girilen değerler "actual parameter/argument"
// Fonksiyon bir şey döndürmüyorsa "void"

// Main method
  public static void main(String[] args) {
    int i = 5;
    int j = 2;
    int k = max(i, j);
    System.out.println("The maximum between " + i +
      " and " + j + " is " + k);
  }

// Return the max between two numbers
  public static int max(int num1, int num2) {
    int result;
    if (num1 > num2)
      result = num1;
    else
      result = num2;
    return result;
  }
//--------------------------------------------------------------------------------
// DİKKAT
public static int sign(int n) {
  if (n > 0)
    return 1;
  else if (n == 0)
    return 0;
  else  // burası else ifli bir ifade içerse ve else olmasa hata alırız. Java compiler kabul etmez.
    return –1;
}
//--------------------------------------------------------------------------------
// Pass by value (Main'deki değerde değişim yok)
public class Increment {
  public static void main(String[] args) {
    int x = 1;
    System.out.println("Before the call, x is " + x);
    increment(x);
    System.out.println("After the call, x is " + x);
  }

  public static void increment(int n) {
    n++;
    System.out.println("n inside the method is " + n);
  }
}
//--------------------------------------------------------------------------------
// Fonksiyon içerisinde tanımlanan değişken "local variable"
// Local variable, bulunduğu scope içerisinde geçerlidir.
