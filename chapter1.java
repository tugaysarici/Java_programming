// Eclipse'de Java projesi oluştur ve sonrasında kodları yazmak için bir Class oluştur.

// Her java kodu en az bir tane class içerir. Burada örneğin Welcome bir class'dır.
// Bir class'ı çalıştırmak için, class bir main methodu içermelidir. Program buradan çalıştırılır.
// Main bloğu içerisindekiler birer Statement'dır ve her statement noktalı virgül ile bitmeli.
// Kod yazarken bloklara dikkat et, okunmasında ve statementların hangi bloğa ait olduğunun aşlaşılmasında kolaylık sağlar.
// { } süslü parantez, statementları kapsayan bir bloğu temsil eder.
// ( ) parantez, methodlar (fonksiyonlar) ile kullanılır.
// // bir yorum satırıdır. Koda etki etmeden not alabilirsin.
// " " tırnaklar, bir stringi çevreler.
// ; noktalı virgül, her statement sonunda kullanılır.
// class, public, private, void gibi kelimeler birer Resirved Word olarak isimlendirilir. 
public class Welcome { 
  public static void main(String[] args) { 
      //Kodlar bu blok içerisine yazılır.
  }
}

// Ekrana yazı yazmak için (sonuna ln yazılmazsa alt satıra geçmez)
System.out.println("Merhabalar");

//println'den dolayı hepsini alt alta yazdırır.
public class WelcomeWithThreeMessages { 
  public static void main(String[] args) { 
    System.out.println("Programming is fun!");
    System.out.println("Fundamentals First");
    System.out.println("Problem Driven");
  }
}

//print'li kısım string şeklinde. println'li kısım int bir değer döndürür.
public class ComputeExpression { 
  public static void main(String[] args) { 
    System.out.print("(10.5 + 2 * 3) / (45 – 3.5) = ");   //STRING
    System.out.println((10.5 + 2 * 3) / (45 - 3.5));      //INT
  }
}

// HATA TİPLERİ
// Syntax Error: compiler taranfından tespit edilir.
// Runtime Error: Programın yarıda kalmasına neden olur.
// Logic Error: Kodu yazan tarafından yapılan yanlış adımlar sebebiyle yanlış sonuç elde edilmesi.
