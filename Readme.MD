# Java Recursive and String Operations

### 1. `rusak(int n)`

```java
 // Rusak method
static int total = 0;
public static void rusak(int n){
     if (n == 0) {
         return;
     }

     for (int i = 0; i < n; i++) {
         System.out.println("Hello");
         total++;
     }
     rusak((int) n/2);
}
```
Method di atas akan menghitung berapa kali "Hello" dicetak
- Method ini akan mencetak "Hello" sebanyak `n` kali.
- Setiap kali "Hello" dicetak, variabel `total` akan bertambah 1.
- Kemudian method ini akan memanggil dirinya sendiri dengan `n` dibagi 2.
- Method ini akan berhenti ketika `n` sama dengan 0.
- Jika method ini dipanggi; `rusak(1000)` maka outputnya total Hello yang dicetak adalah `1994`.

### 2. `roger(int k, int b)`
```java
// roger method
public static int roger(int k, int b) {
    if (b == 1) return 1;
    else if (k % b == 0) return 1 + roger(k, --b);
    else return 0 + roger(k, --b);
}
```
Method di atas akan menghitung berapa kali `k` habis dibagi `b`
- Method ini akan mengembalikan 1 jika `b` sama dengan 1.
- Method ini akan mengembalikan 1 ditambah hasil dari method ini sendiri dengan `k` dan `b` dikurangi 1 jika `k` habis dibagi `b`.
- Method ini akan mengembalikan 0 ditambah hasil dari method ini sendiri dengan `k` dan `b` dikurangi 1 jika `k` tidak habis dibagi `b`.
- Jika method ini dipanggi; `roger(8,8)` maka outputnya adalah `4`.

### 3. `countUppercaseLowercaseNumberSymbols(String str)`

```java
// countUppercaseLowercaseNumberSymbols method
public static void countUppercaseLowercaseNumberSymbols(String text) {
    int uppercase = 0;
    int lowercase = 0;
    int number = 0;
    int symbols = 0;

    for (int i = 0; i < text.length(); i++) {
        char ch = text.charAt(i);

        if (Character.isUpperCase(ch)) {
            uppercase++;
        } else if (Character.isLowerCase(ch)) {
            lowercase++;
        } else if (Character.isDigit(ch)) {
            number++;
        } else {
            symbols++;
        }
    }

    System.out.println("Uppercase: " + uppercase);
    System.out.println("Lowercase: " + lowercase);
    System.out.println("Number: " + number);
    System.out.println("Symbols: " + symbols);
}   
```
Method di atas akan menghitung jumlah huruf besar, huruf kecil, angka, dan simbol dalam sebuah string.
- Method ini akan menginisialisasi variabel `uppercase`, `lowercase`, `number`, dan `symbols` dengan 0.
- Method ini akan melakukan perulangan sebanyak panjang dari string `text`.
- Method ini akan mengambil karakter pada index ke `i` dari string `text`.
- Jika karakter tersebut merupakan huruf besar, maka variabel `uppercase` akan bertambah 1.
- Jika karakter tersebut merupakan huruf kecil, maka variabel `lowercase` akan bertambah 1.
- Jika karakter tersebut merupakan angka, maka variabel `number` akan bertambah 1.
- Jika karakter tersebut merupakan simbol, maka variabel `symbols` akan bertambah 1.
- Jika method ini dipanggi; `countUppercaseLowercaseNumberSymbols("pemrogramanDasarJava1")` maka outputnya adalah:
```
Uppercase: 3
Lowercase: 18
Number: 1
Symbols: 0
```