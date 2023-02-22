import java.util.Scanner;


public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan alamat: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan pengalaman (pemula/menengah/expert): ");
        String pengalaman = input.nextLine();

        System.out.print("Masukkan skill (web/mobile/desktop): ");
        String skill = input.nextLine();

        System.out.print("Masukkan departemen (IT/HRD/Finance): ");
        String departemen = input.nextLine();

        Karyawan karyawan = new Karyawan(nama, alamat, pengalaman, skill, departemen);
        karyawan.tampilkanData();
    }
}
