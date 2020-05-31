// Tek Boyutlu Diziler (Single-Dimensional Arrays)
// veriTipi[] değişkenAdı;
// değişkenAdı = new veriTipi[arraySize];

// Örneğin:
double [] myList;
myList = new double [10];

// Ya da bu iki satırı tek seferde:
double[] myList = new double [10];

// Dizinin Boyutu
myList.length

// Diziye atama yapılmadığında numeric türdeki dizide 0; char türündeki dizide '\u0000'; boolean türündeki dizide false atanır.

// Elemanlara erişme
myList[index]

// Aşağıdaki şekilde tek satırda tanımlama ve atama yapılabilir.
double[] myList = {1.9, 2.6, 3.5};

// Dikkat! Aşağıdaki şekilde kullanamazsın!
double[] myList;
myList = {1.9, 2.9, 3.4, 3.5}; //SYNTAX ERROR

// Diziyi bastırmak için farklı bir kullanım
for (dizininVeriTürü value: diziAdı) {
// Buradaki value, dizinin mevcut indexindeki değeri, her for da bu değer sonraki oluyor. Bu değeri işleyebilirisin.
}
//--------------------------------------------------------------------------------
// Dizileri Kopyalamak

// Aşağıdaki şekilde dizinin başlangıç adresini diğer dizininkiyle aynı yapabilirsin.
list2 = list1

// Ya da döngü kullanarak dizinin indexindekini diğerinin aynı indexine eşitleyebilirsin.
targetArray[i] = sourceArray[i];

// arraycopy
System.arraycopy(kaynakDizi, kaynakPozisyonu, hedefDizi, hedefPozisyonu);

// Bir dizi, bir fonksiyona parametre olarak geçerken main içerisinde:
int[] list = {3, 1, 2, 6, 4, 2};
printArray(list);
// Fonksiyonda
public static void printArray(int[] array) {
  for (int i = 0; i < array.length; i++) {
    System.out.print(array[i] + " ");
  }
}

// Aşağıdaki kodda int swap ve dizi içerisinde swap işlemi gösteriliyor. C'de olduğu gibi & kullanılmadığına dikkat et.
public class TestPassArray {
  /** Main method */
  public static void main(String[] args) {
    int[] a = {1, 2};
    // Swap elements using the swap method
    System.out.println("Before invoking swap");
    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    swap(a[0], a[1]);
    System.out.println("After invoking swap");
    System.out.println("array is {" + a[0] + ", " + a[1] + "}");

    // Swap elements using the swapFirstTwoInArray method
    System.out.println("Before invoking swapFirstTwoInArray");
    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
    swapFirstTwoInArray(a);
    System.out.println("After invoking swapFirstTwoInArray");
    System.out.println("array is {" + a[0] + ", " + a[1] + "}");
  }
  /** Swap two variables */
  public static void swap(int n1, int n2) {
    int temp = n1;
    n1 = n2;
    n2 = temp;
  }
  /** Swap the first two elements in the array */
  public static void swapFirstTwoInArray(int[] array) {
    int temp = array[0];
    array[0] = array[1];
    array[1] = temp;
  }
}
//--------------------------------------------------------------------------------
// Fonksiyonda return ile dizi döndürmek. Mainde:
int[] list1 = {1, 2, 3, 4, 5, 6};
int[] list2 = reverse(list1);
Fonksiyon:
public static int[] reverse(int[] list) {
  int[] result = new int[list.length];
  for (int i = 0, j = result.length - 1;
    i < list.length; i++, j--) {
    result[j] = list[i];
  }
  return result;
}
//--------------------------------------------------------------------------------
// Binary Search ile elemanın indexini bulma. *Dizinin sıralı verilmesi gerekli*
int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
System.out.println("Index is " + java.util.Arrays.binarySearch(list, 11));

// Dizi elemanlarını dizi içerisinde sıralamk için
double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
java.util.Arrays.sort(numbers);

// Diziyi String olarak döndürmek için
Array.toString(diziAdı)
//--------------------------------------------------------------------------------
// ÖNEMLİ**
// Class A'dan Class B'ye string dizisi yollama.

public class A {
  public static void main(String[] args) {
    String[] strings = {"New York", "Boston", "Atlanta"};
    B.main(strings);
  }
}

class B {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++)
      System.out.println(args[i]);
  }
}
