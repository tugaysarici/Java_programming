// MATEMATİKSEL FONKSİYONLAR ve sabitler "Math" classı ile beraber kullanılır.
// Trigonometrik Fonksiyonlar

Math.sin(double a)
Math.cos(double a)
Math.tan(double a)
Math.acos(double a)
Math.asin(double a)
Math.atan(double a)
// Sabitler
Math.PI
Math.E

// Örneğin; Math.sin(Math.PI / 6) ifadesi 0.5 döndürür.

// Exponent (e üssü) Fonksiyonu
Math.exp(double a)

// ln Fonksiyonu
Math.log(double a)

// log Fonksiyonu
Math.log10(double a)

// Üst Alma Fonksiyonu (a üzeri b)
Math.pow(double a, double b)

// Karekök Alma Fonksionu
Math.sqrt(double a)

// Yuvarlama Fonksiyonları
// Üstteki en yakın tam sayıya
Math.ceil(double x)

// Alttaki en yakın tam sayıya
Math.floor(double x)

// En yakın tam sayıya (2.5'de 2'ye, 2.51'de 3'e yuvarladı)
Math.rint(double x)

// 0.5 eklenmiş hallerini alttaki en yakın tamsayıya
Math.round(double x)

// Minimum değer bulma
Math.min(2.5, 3.6)

// Maximum değer bulma
Math.max(2, 3)

// Mutlak değer bulma
Math.abs(-3.4)

// [0.0, 1.0) aralığında rastgele bir double sayı
Math.random()
// ------------------------------------------------------------------------------------

// Karakter (char )Veri Tipi
char a = 'A';
// Increment ve decrement işlemleri yapılırsa ascii'deki değerler baz alınır.

// \b backspace, \t tab, \n linefeed, \f formfeed, \r carriagereturn, \\backslash, \" doublequote
public class main {
	  public static void main(String[] args) {
		  char ch = 'B';
		  if (ch >= 'A' && ch <= 'Z')
			  System.out.println(ch + " is an uppercase letter");
		  else if (ch >= 'a' && ch <= 'z')
			  System.out.println(ch + " is a lowercase letter");
		  else if (ch >= '0' && ch <= '9')
			  System.out.println(ch + " is a numeric character");
	  }
}

// Karakter Sınıfındaki Fonksiyonlar
// Belirtilen karakter basamaksa "true"
Character.isDigit(ch)
  
// Belirtilen karakter harfse "true"
Character.isLetter(ch)
  
// Belirtilen karakter harf ya da basamaksa "true"
Character.isLetterOfDigit(ch)
  
// Belirtilen karakter küçük harfse "true"
Character.isLowerCase(ch)
  
// Belirtilen karakter büyük harfse "true"
Character.isUpperCase(ch)
  
// Belirtilen karakterin küçük harfli hali
Character.toLowerCase(ch)
  
// Belirtilen karakterin büyük harfli hali
Character.toUpperCase(ch)
// ------------------------------------------------------------------------------------
  
// String Veri Tipi (char tek karakter iken string karakterler kümesi tutar)
String message = "Welcome to Java";

// String Sınıfındaki Fonksiyonlar
// Kaç tane karakterden oluştuğu
message.length() 

// Belirlenen indexteki karakteri döndürür
message.charAt(index)
  
// String s1 ile mevcut stringin birleşmiş halini döndürür
// String s2 = message + s1
message.concat(s1)
  
// Stringdeki tüm harflerin büyük halini döndürür
message.toUpperCase()

// Stringdeki tüm harflerin küçük halini döndürür
message.toLowerCase()
  
// Stringin başındaki ve sonundaki boşlukların silinmiş halini döndürür
message.trim()
// ------------------------------------------------------------------------------------
  
// Konsoldan string okumak
Scanner input = new Scanner(System.in);
System.out.print("Enter three words separated by spaces: ");
String s1 = input.next();
String s2 = input.next();
String s3 = input.next();
System.out.println("s1 is " + s1);
System.out.println("s2 is " + s2);
System.out.println("s3 is " + s3);

// Okunan String'deki karakteri okumak
Scanner input = new Scanner(System.in);
System.out.print("Enter a character: ");
String s = input.nextLine();
char ch = s.charAt(0);
System.out.println("The character entered is " + ch);
// ------------------------------------------------------------------------------------

// Stringleri Kıyaslamak
// message s1'e eşitse true döndürür
message.equals(s1)
  
// Harflerin büyük ya da küçük olması önemsenmeden message s1'e eşitse true döndürür
message.equalsIgnoreCase(s1)
  
// Sıralamaları eşitse 0, message daha önceyse <0, sonrayda >0
message.compareTo(s1)
  
// Harfler önemsenmeden
message.compareToIgnoreCase(s1)
  
// Message'nin başı prefix ile başlıyorsa true
message.starsWith(prefix)
  
// Message, suffix ile bitiyorsa
message.endsWith(suffix)

// Alt stringler elde etme
// Belirtilen indexden sona kadar olan string'i döndürür
message.substring(Index)
	
// Belirtilen başlangıç indexinden bitiş indexine kadar olan stringi döndürür
message.substring(beginIndex, endIndex)

// String içerisinde String/Char Bulma
// ch karakterinin string içerisinde görüldüğü ilk indexi basar. -1 basarsa görülmemiştir
messaga.indexOf(ch)

// fromIndex'ten sonraki bulunduğu ilk indexi basar
message.indexOf(ch, fromIndex)

// Yukarıdaki 2 fonksiyon string için de geçerlidir.
message.indexOf(s1)
messsage.indexOf(s1, fromIndex)

// ch karakteriin string içerisindeki son görüldüğü indexi basar.
message.lastIndexOf(ch)

// fromIndex'ten önceki son görüldüğü index
message.lastIndexOf(ch, fromIndex)
	
// Yukarıdaki 2 fonksiyon string için de geçerli.
message.lastIndexOf(s1)
message.lastIndexOf(s1, fromIndex)

// Örnek
int k = s.indexOf(' ');
String firstName = s.substring(0, k);
String lastName = s.substring(k + 1);	
// ------------------------------------------------------------------------------------
// String ile Number araındaki Dönüşüm (Conversion)
// String to Number
int intValue = Integer.parseInt(intString);
double doubleValue = Double.parseDouble(doubleString);

// Number to String
String s = number + "";

// Sık kullanılan belirticiler 
%b boolean(true false)
%c a character('a')
%d a decimal integer(200)
%f a floating point number(45.46000)
%e a scientific notation(4.556000e+01)
%s string("Java is so cool")
