// Koşullar, if, else if, else (CONDITIONS)

// ==, !=, <, <=, >, >= gibi koşul ifadeleri ile kullanılır.

package lecture1;

public class Main {
	public static void main(String[] args) {
		int i = 15;
		if(i==10) {
			System.out.println("i'nin değeri 10.");
		}
		else if(i<10) {
			System.out.println("i'nin degeri 10'dan dusuk.");
		}
		else {
			System.out.println("i'nin degeri 10'dan farkli ve 10'dan kucuk degildir.");
		}
		System.out.println("Kontrolsuz");
	}
}
