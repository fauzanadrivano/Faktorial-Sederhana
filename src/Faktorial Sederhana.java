import java.util.Scanner;

class Faktorial {
    static int faktorial(int a){
        int hasil = 1;
        for (int i = a; i > 0; i--){
            hasil *= i;
        }
        return hasil;
    }
    public static void tampil(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suatu bilangan : ");
        int x = input.nextInt();
        System.out.println("Nilai faktorial "+ x + " adalah " + faktorial(x));
    }
}

public class Tugas1{
    public static void main(String[] args) {
        Faktorial.tampil();
    }
}
