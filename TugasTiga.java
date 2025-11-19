import java.util.Scanner;

public class TugasTiga {
    public static void main(String[] args) {
        // Array untuk menyimpan gaji pokok sesuai golongan
        long[] gajiPokok = {5000000, 6500000, 9500000};
        
        // Array untuk menyimpan persentase lembur
        double[] persenLembur = {30, 32, 34, 36, 38};
        
        Scanner scanner = new Scanner(System.in);
        
        // Input untuk validasi golongan karyawan
        System.out.print("Masukkan golongan karyawan (A/B/C): ");
        String golongan = scanner.next().toUpperCase();
        
        // Input untuk validasi jam lembur
        System.out.print("Masukkan jam lembur: ");
        int jamLembur = scanner.nextInt();
        
        // Variabel untuk menyimpan index golongan
        int indexGolongan = -1;
        
        // Menentukan index golongan dan gaji pokok
        if (golongan.equals("A")) {
            indexGolongan = 0;
        } else if (golongan.equals("B")) {
            indexGolongan = 1;
        } else if (golongan.equals("C")) {
            indexGolongan = 2;
        } else {
            System.out.println("Golongan tidak valid!");
            scanner.close();
            System.exit(0);
        }
        
        long gaji = gajiPokok[indexGolongan];
        double gajiLembur = 0;
        
        // Menghitung gaji lembur berdasarkan jam lembur
        if (jamLembur == 1) {
            gajiLembur = gaji * (persenLembur[0] / 100);
        } else if (jamLembur == 2) {
            gajiLembur = gaji * (persenLembur[1] / 100);
        } else if (jamLembur == 3) {
            gajiLembur = gaji * (persenLembur[2] / 100);
        } else if (jamLembur == 4) {
            gajiLembur = gaji * (persenLembur[3] / 100);
        } else if (jamLembur >= 5) {
            gajiLembur = gaji * (persenLembur[4] / 100);
        }
        
        // Menghitung total gaji
        long totalGaji = gaji + (long) gajiLembur;
        
        // Menampilkan hasil
        System.out.println("\n=== RINCIAN GAJI KARYAWAN ===");
        System.out.println("Golongan: " + golongan);
        System.out.println("Gaji Pokok: Rp " + gaji);
        System.out.println("Jam Lembur: " + jamLembur + " jam");
        System.out.println("Persentase Lembur: " + 
            (jamLembur > 0 ? persenLembur[Math.min(jamLembur-1, 4)] : 0) + "%");
        System.out.println("Gaji Lembur: Rp " + (long) gajiLembur);
        System.out.println("Total Gaji: Rp " + totalGaji);
        
        // Menutup scanner
        scanner.close();
    }
}