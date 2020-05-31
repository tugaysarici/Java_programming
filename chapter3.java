// BOOLEAN TİPİ VE İŞLEMLERİ
boolean b = (1 > 2); // false döndürür

// İLİŞKİSEL OPERATÖRLER
//< <= > >= == !=   operatörlerine göre true ya da false
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

public class TestBooleanOperators {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive an input
    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    if (number % 2 == 0 && number % 3 == 0)
      System.out.println(number + " is divisible by 2 and 3.");

    if (number % 2 == 0 || number % 3 == 0)
      System.out.println(number + " is divisible by 2 or 3.");

    if (number % 2 == 0 ^ number % 3 == 0)
      System.out.println(number + 
        " divisible by 2 or 3, but not both.");
  }
}
// ------------------------------------------------------------------------------------
// Switch Kullanımı
// Case'ler içerisinde break kullanılmazsa diğer case'ler de çalıştırılır.
// default isteğe bağlı kullanılır. Case'lere girilmezse çalışır.
// Switch içerisindeki değişken türü, case'dekilerle aynı olmalı.
public class ChineseZodiac {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    
    switch (year % 12) {
      case 0: System.out.println("monkey"); break;
      case 1: System.out.println("rooster"); break;
      case 2: System.out.println("dog"); break;
      case 3: System.out.println("pig"); break;
      case 4: System.out.println("rat"); break;
      case 5: System.out.println("ox"); break;
      case 6: System.out.println("tiger"); break;
      case 7: System.out.println("rabbit"); break;
      case 8: System.out.println("dragon"); break;
      case 9: System.out.println("snake"); break;
      case 10: System.out.println("horse"); break;
      case 11: System.out.println("sheep"); break;
      default: System.out.println("invalid"); System.exit(1);
    }
  }
}
  
// Koşulsal İfadelendirme (Conditional Expression)
// (boolean-expression) ? expression1 : expression2
// boolean-expression true ise expression1, false ise expression2 çalışır.
System.out.println((num % 2 == 0)? num + “is even” : num + “is odd”);
// ------------------------------------------------------------------------------------

// İşlem Öncelik Sırası (Operator Precedence)
 ()
 var++, var--
 +, - (Unary plus and minus), ++var,--var
 (type) Casting
 ! (Not)
 *, /, % (Multiplication, division, and remainder)
 +, - (Binary addition and subtraction)
 <, <=, >, >= (Relational operators)
 ==, !=; (Equality)
 ^ (Exclusive OR)
 && (Conditional AND) Short-circuit AND
 || (Conditional OR) Short-circuit OR
 =, +=, -=, *=, /=, %= (Assignment operator)
// ------------------------------------------------------------------------------------
