// BOOLEAN TİPİ VE İŞLEMLERİ
boolean b = (1 > 2); // false döndürür

// İLİŞKİSEL OPERATÖRLER
//< <= > >= == !=   operatörlerine göre true ya da false

import java.util.Scanner;
public class AdditionQuiz {
  public static void main(String[] args) {
    int number1 = (int)(System.currentTimeMillis() % 10);
    int number2 = (int)(System.currentTimeMillis() / 10 % 10);

    // Kullanıcıdan gösterilen sayıların toplamını bulması istenir. Doğruysa True, yanlışsa False gösterilir.
    Scanner input = new Scanner(System.in);
    System.out.print("What is " + number1 + " + " + number2 + "? ");
    int answer = input.nextInt();
    System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
  }
}
// ------------------------------------------------------------------------------------
// KOŞULLAR (CONDITIONS)
// if, else if, else ile kurulur.

import java.util.Scanner; 
public class SubtractionQuiz {
  public static void main(String[] args) {
    // İki tane rastgele sayı üretir 1-10 arası
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);

    // İlk sayının ikinciden ufak olmaması lazım
    if (number1 < number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
    }

    // Kullanıcıdan bir cevap istenir
    System.out.print("What is " + number1 + " - " + number2 + "? ");
    Scanner input = new Scanner(System.in);
    int answer = input.nextInt();

    // Cevabın doğru olup olmadığı belirtilir.
    if (number1 - number2 == answer)
      System.out.println("You are correct!");
    else {
      System.out.println("Your answer is wrong.\n" + number1 + " - " + number2 + " should be " + (number1 - number2)); 
    }
  }
// ------------------------------------------------------------------------------------

// MANTIKSAL İŞLEMLER (LOGICAL OPERATORS)
! is not
%% is and
|| is or
^ is exclusive or (aynı ise false, farklı ise true)
// ------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------
// ------------------------------------------------------------------------------------
