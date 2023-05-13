// Author: Muhammad Akbar Reishandy
package uts;
import uts.pegawai.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final Kepegawaian kepegawaian = new Kepegawaian();
    private static final ArrayList<Dosen> dosens = new ArrayList<>();
    private static final ArrayList<TenagaPendidikan> tenagaPendidikans = new ArrayList<>();

    public static void main(String[] args) {
        // There is no error checking on this one, so please do as the program say
        init();

        while (true) {
            System.out.print("""
                    --------------------
                    Kepegawaian UNIWARA
                    
                    1. Daftar gaji
                    2. Daftar pegawai
                    3. Tambah pegawai
                    
                    :q to quit
                    --------------------
                    > \s""");
            String input = sc.nextLine();

            if (input.equals("1")) {
                System.out.println("--------------------");
                kepegawaian.printList();
            }
            if (input.equals("2")) {
                System.out.println("--------------------");
                System.out.println("Dosen:");
                for (Dosen dosen: dosens) {
                    dosen.printData();
                    System.out.println();
                }
                System.out.println("Tenaga kependidikan:");
                for (TenagaPendidikan tenagaPendidikan: tenagaPendidikans) {
                    tenagaPendidikan.printData();
                    System.out.println();
                }
            }
            if (input.equals("3")) tambahPegawai();
            if (input.equals(":q")) break;
        }
    }

    private static void init() {
        Dosen dosen = new Dosen(
                "Kucing", "1221", "Perempuan",
                27, 50);
        TenagaPendidikan tenagaPendidikan = new TenagaPendidikan(
                "Ayam", "1223", "Laki-laki",
                19, 24);
        dosens.add(dosen);
        tenagaPendidikans.add(tenagaPendidikan);
        kepegawaian.add(dosen);
        kepegawaian.add(tenagaPendidikan);
    }

    private static void tambahPegawai() {
        String name, NIP, gender;
        int age, sks, kehadiran;
        System.out.print("""
                    --------------------
                    1. Dosen
                    2. Tenaga kependidikan
                    
                    :b to go back
                    --------------------
                    > \s""");

        String input = sc.nextLine();
        if (input.equals((":b"))) return;

        System.out.println("--------------------");
        System.out.print("Nama: ");
        name = sc.nextLine();
        System.out.print("NIP: ");
        NIP = sc.nextLine();
        System.out.print("Gender: ");
        gender = sc.nextLine();
        System.out.print("Umur: ");
        age = Integer.parseInt(sc.nextLine());

        if (input.equals("1")) {
            System.out.println("SKS: ");
            sks = Integer.parseInt(sc.nextLine());
            Dosen dosen = new Dosen(
                    name, NIP, gender, age, sks);
            dosens.add(dosen);
            kepegawaian.add(dosen);

        } else if (input.equals("2")) {
            System.out.println("SKS: ");
            kehadiran = Integer.parseInt(sc.nextLine());
            TenagaPendidikan tenagaPendidikan = new TenagaPendidikan(
                    name, NIP, gender, age, kehadiran);
            tenagaPendidikans.add(tenagaPendidikan);
            kepegawaian.add(tenagaPendidikan);
        }
    }
}
