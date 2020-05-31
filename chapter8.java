// Çok Boyutlu Diziler (Multidimensional Arrays)
// Örneğin:
double[][] distances = {{2, 1, 3}, {4, 7, 34}, {45, 31, 65}};

int[][] matrix = new int[10][10];
matrix[0][0] = 3;

// 2 boyutlu dizinin uzunluğu
int[][] x = new int[3][4];
x[0].length //4 döndürür
x[1].length //4 döndürür
x[2].length //4 döndürür
x.length //3 döndürür**
//--------------------------------------------------------------------------------
// 2 Boyutlu Dizi Döndüren Fonksiyon ve Fonksiyona 2 Boyutlu Diziyi Parametre olarak vermek
public static void main(String[] args) {
  int[][] m = getArray(); // Get an array
  // Display sum of elements
  System.out.println("\nSum of all elements is " + sum(m));
}

public static int[][] getArray() {
  // Create a Scanner
  Scanner input = new Scanner(System.in);

  // Enter array values
  int[][] m = new int[3][4];
  System.out.println("Enter " + m.length + " rows and "
    + m[0].length + " columns: ");
  for (int i = 0; i < m.length; i++)
    for (int j = 0; j < m[i].length; j++)
      m[i][j] = input.nextInt();

  return m;
}

public static int sum(int[][] m) {
  int total = 0;
  for (int row = 0; row < m.length; row++) {
    for (int column = 0; column < m[row].length; column++) {
      total += m[row][column];
    }
  }

  return total;
}
