// Object Oriented Kısmı Burada Başlıyor
public class Araba {
    private double varsayilanMotorHacmi = 1399;
    //constructor
    Araba() {
        System.out.println("Araba nesnesi oluşturuldu, varsayilan motor hacmi değeri: " + varsayilanMotorHacmi);
    }
    //constructor
    Araba(double yeniMotorHacmi) {
        varsayilanMotorHacmi = yeniMotorHacmi;
        System.out.println("Araba nesnesi oluşturuldu, yeni varasayilan motor hacmi değeri:  " + varsayilanMotorHacmi);
    }
    //metot
    void calistir() {
        System.out.println("Araba çalışmaya başladı!");
    }
    public double getVarsayilanMotorHacmi() {
        return varsayilanMotorHacmi;
    }
    public void setVarsayilanMotorHacmi(double varsayilanMotorHacmi) {
        this.varsayilanMotorHacmi = varsayilanMotorHacmi;
    }
}

public class ArabaTest {
  public static void main(String[] args) {
      Araba arabaNesnesi = new Araba();
      arabaNesnesi.calistir();
    
      Araba baskaArabaNesnesi = new Araba(2997);
      baskaArabaNesnesi.calistir();
    
      System.out.println(baskaArabaNesnesi.getVarsayilanMotorHacmi()); /* Class'daki değişkenleri
direk mainden değil de class içerisinden değiştirmek daha iyi bir kullanımdır*/
      baskaArabaNesnesi.setVarsayilanMotorHacmi(5997);
      System.out.println(baskaArabaNesnesi.getVarsayilanMotorHacmi());
  }
}
//--------------------------------------------------------------------------------
// Erişim Belirleyiciler
Modifier      Class Package Subclass World
public        Y     Y       Y        Y
protected     Y     Y       Y        N
no modifier   Y     Y       N        N
private       Y     N       N        N
//--------------------------------------------------------------------------------
// Kalıtım (Inheritance) sağlanırken extends kullanılır.
// Araba -> Volkswagen -> Binek -> Jetta
// Bu örnekte BinekAraba sınıfından oluşturulacak nesne, Araba sınıfı içindeki tüm özelliklere ulaşma hakkına sahiptir.
public class BinekAraba extends Araba {
}

// Soyutlama (Abstraction)
/*Biz Araba sınıfını kullanan bir kullanıcı olarak marşa basıldığında arabayı çalıştıran
metodun ne yaptığıyla veya araba çalışırken benzin veya motorin tüketiminin nasıl
hesaplandığıyla değil de sonuçlarıyla ilgileniyor olmalıyız.*/

// Kapsülleme (Encapsulation)
// Oluşturduğumuz sınıfa diğer sınıflardan erişim yetkisi verme işlemleri

// Polymorphism (Çok Biçimlilik)
public class Araba {
    public double getBenzinDepoBuyuklugu() {
        return 50.0;
    }
}
public class BinekAraba extends Araba {
    @Override
    public double getBenzinDepoBuyuklugu() {
        return 60.0;
    }
}
public class TicariAraba extends Araba {
    @Override
    public double getBenzinDepoBuyuklugu() {
        return 100.0;
    }
}
// Burada Araba class'ı içerisindeki yapı diğerlerinde kullanılıyor. Birden fazla class'ta kullanım kolaylığı
//--------------------------------------------------------------------------------
// Encapsulation
// Encapsulation olmadan herkes kafasına göre değişiklik yapabilir:
public class EncapsulationDemo1 {
  public static void main(String[] args) {
    EncapsulationDemo ed = new EncapsulationDemo();
    ed.ad = "mobilhanem";
  }
}
class EncapsulationDemo {
  public String ad;
}

// Encapsulation sayesinde bu problem önlenir:
public class EncapsulationDemo2 {
  public static void main(String[] args) {
    EncapsulationDemo ed = new EncapsulationDemo();
    ed.setAd("mobilhanem");
    System.out.println(ed.getAd());
  }
}
class EncapsulationDemo {
  private String ad;
    public void setAd(String ad) {
      this.ad = ad; 
    }
    public String getAd() {
      return ad; 
    }
}
//--------------------------------------------------------------------------------
//--------------------------------------------------------------------------------
//--------------------------------------------------------------------------------
