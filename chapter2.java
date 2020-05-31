public class ComputeArea {
  public static void main(String[] args) {
    double radius; // Yarıçap için bellekte yer ayırır
    double area; // Alan için bellekte yer ayırır

    // Yarıçapa 20 değerini atar
    radius = 20;

    // Alanı hesaplar
    area = radius * radius * 3.14159; //

    // Sonucu ekrana yazdırır.
    System.out.println("The area for the circle of radius " + radius + " is " + area);
  }
}
// ------------------------------------------------------------------------------------
// SCANNER
// Konsoldan girdi okumak için Scanner objesi oluşturulur.
Scanner input = new Scanner(System in);

import java.util.Scanner; // Scanner için gerekli
public class ComputeAreaWithConsoleInput {
  public static void main(String[] args) {
    // Yarıçap değeri bu sefer kullanıcıdan alınır. Geri kalan her şey aynı.
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number for radius: ");
    double radius = input.nextDouble();

    double area = radius * radius * 3.14159;
    
    System.out.println("The area for the circle of radius " + radius + " is " + area);
  } 
}
// ------------------------------------------------------------------------------------

import java.util.Scanner; // Scanner için gerekli
public class ComputeAverage {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Tek bir Scanner objesi birden fazla değer alma için kullanılabilir.
    System.out.print("Enter three numbers: ");
    double number1 = input.nextDouble();
    double number2 = input.nextDouble();
    double number3 = input.nextDouble();

    // Ortalama hesabı
    double average = (number1 + number2 + number3) / 3;

    // Sonucun yazılması
    System.out.println("The average of " + number1 + " " + number2
      + " " + number3 + " is " + average);
  } 
}
// ------------------------------------------------------------------------------------

// IDENTIFIERS: harf / $ / _ ile başlamak zorunda. Sayı ile başlayamaz. Herhangi bir uzunlukta olabilir.

// DEĞİŞKEN TANIMLAMA
int x;
double radius;
char a; // a character variable

// ATAMA DURUMLARI
x = 1;
radius = 1.5;
a = 'G';

// HEM DEĞİŞKEN TANIMLAYIP HEM DE ATAMA
int x = 1;
char a = 'G';

// SABİTLERİ İSİMLENDİRME - BAŞINA final ALIR
final double PI  = 3.14;

// İSİMLENDİRME
// Değiken ve fonksiyon adların küçük harfle başlasın, ikinci kelimeleri büyük harfle başlasın. (radiusValue)
// Class isimlendirmesinde hepsi büyük harf ile başlasın. (ComputeArea)
// Sabitlerde hepsi büyük harf olsun ve kelimeleri _ ile ayır. (MAX_VALUE)

// byte 8 bit | short 16 bit | int 32 bit signed | long 64 bit | float 32 bit | double 64 bit
// Atama yaparken değişken türünün alabileceği maksimum boyutu göz önünde bulundur.
System.out.println("1.0 / 3.0 is " + 1.0 / 3.0);
// ekrana 1.0 / 3.0 is 0.3333333333333333 (16 basamak)
System.out.println("1.0F / 3.0F is " + 1.0F / 3.0F);
// ekrana 1.0F / 3.0F is 0.33333334 (7 basamak)
// ------------------------------------------------------------------------------------

Scanner input = new Scanner(System.in);
int value = input.nextInt();
// Buradaki nextInt() farklı şekillerde de kullanılabilir.
input.nextByte();     // int okur
input.nextShort();    // int okur
input.nextInt();      // int okur
input.nextLong();     // int okur 
input.nextFloat();    // number okur 
input.nextDouble();   // number okur
// ------------------------------------------------------------------------------------

// SAYISAL İŞLEMLER
// + - * / %
import java.util.Scanner;
public class DisplayTime {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer for seconds: ");
    int seconds = input.nextInt();
 
    int minutes = seconds / 60; // tam sayı bölmesi
    int remainingSeconds = seconds % 60; // Kalan bulma
    System.out.println(seconds + " seconds is " + minutes +  " minutes and " + remainingSeconds + " seconds");  
  }
}
// ------------------------------------------------------------------------------------

// ÜS ALMA (EXPONENT)
System.out.println(Math.pow(2, 3)); // 2'nin 3'üncü kuvveti
// Bilimsel gösterimde e kullanılınca yanındaki 10'un üssü olan sayıyı ifade eder.
// 1.23456e-2 ifadesi 0.0123456 sayısına eşittir.
// ------------------------------------------------------------------------------------

import java.util.Scanner;
public class FahrenheitToCelsius {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a degree in Fahrenheit: ");
    double fahrenheit = input.nextDouble(); 
    
    // Fahrenheit karşılığı alınır ve aşağıda Celcius hesaplanır.

    double celsius = (5.0 / 9) * (fahrenheit - 32);
    System.out.println("Fahrenheit " + fahrenheit + " is " + 
      celsius + " in Celsius");  
  }
}
// ------------------------------------------------------------------------------------

// SİSTEM SAATİNİ HESAPLAMA
public class ShowCurrentTime {
  public static void main(String[] args) {
    long totalMilliseconds = System.currentTimeMillis(); // bu fonksiyon 1970'den beri geçen zamanı mili saniye olarak alır.
    // Bu değer üstünden sistem zamanı hesaplanabilir.

    // Obtain the total seconds since midnight, Jan 1, 1970
    long totalSeconds = totalMilliseconds / 1000;

    // Compute the current second in the minute in the hour
    long currentSecond = totalSeconds % 60;

    // Obtain the total minutes
    long totalMinutes = totalSeconds / 60;

    // Compute the current minute in the hour
    long currentMinute = totalMinutes % 60;

    // Obtain the total hours
    long totalHours = totalMinutes / 60;

    // Compute the current hour
    long currentHour = totalHours % 24;

    // Display results
    System.out.println("Current time is " + currentHour + ":"
      + currentMinute + ":" + currentSecond + " GMT");
  }
}
// ------------------------------------------------------------------------------------

// ARTTIRILMIŞ ATAMA İŞLEMLERİ
i += 8; ile i = i + 8;
i -= 8; ile i = i - 8;
i *= 8; ile i = i * 8;
i /= 8; ile i = i / 8;
i %= 8; ile i = i % 8;
// ------------------------------------------------------------------------------------

// ARTTIRMA (INCREMENT) ve AZALTMA (DECREMENT) İŞLEMİ
int i = 1; // başlangıçta
int j = i++; // j'ye i değerini atar, i'yi sonra arttırır. (j=1, i=2)
int j = ++i; // i'yi arttırır ve arttırılmış değeri j'ye atar. (j=2, i=2)
int j = i--; // j'ye i değerini atar, i'yi sonra azaltır. (j=1, i=0)
int j = --i; // i'yi azaltır ve azaltılmış değeri j'ye atar. (j=0; i=0)
// ------------------------------------------------------------------------------------

//TİP DÖNÜŞTÜRME (TYPE CASTING)
// Implicit casting
double d = 3; // (tip genişletme)
// Explicit casting
int i = (int)3.0; // (tip daraltma)
int i = (int)3.9; // (Kesir kısmı atıldı)

import java.util.Scanner;
public class SalesTax {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter purchase amount: ");
    double purchaseAmount = input.nextDouble();
    
    double tax = purchaseAmount * 0.06;
    System.out.println("Sales tax is " + (int)(tax * 100) / 100.0);
  }
}
