// While Döngüsü
int counter = 0;
while (counter < 100){
  System.out.println("Welcome to Java!");
  counter++;
}

// Do-While Döngüsü
int counter = 0;
do{
  System.out.println("Welcome to Java!");
  counter++;
}while(counter < 100);  //bu kısımda ; kullanıldığına dikkat et

// For Döngüsü
int counter;
for(counter = 0; counter<100; counter++){
  System.out.println("Welcome to Java!");
}

// Döngü içerisindeki break çalışırsa döngüden çıkılır.
int counter;
for(counter = 0; counter<100; counter++){
  System.out.println("Welcome to Java!");
  if(counter == 50){
    break;
  }
}

// Döngü içerisinde continue kullanıldığında sadece o iterasyonu atlar.
int sum = 0;
int number = 0;

while (number < 20) {
  number++;
  if (number == 10 || number == 11) // 10 ve 11 sum'a katılmaz.
    continue;
  sum += number;
}
System.out.println("The sum is " + sum);
