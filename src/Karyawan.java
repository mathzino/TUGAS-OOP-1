/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Karyawan {
     String nama;
     String alamat;
     String pengalaman;
     String skill;
     String departemen;

    public Karyawan(String nama, String alamat, String pengalaman, String skill, String departemen) {
        this.nama = nama;
        this.alamat = alamat;
        this.pengalaman = pengalaman;
        this.skill = skill;
        this.departemen = departemen;
    }

    

    public double hitungGaji() {
        double gaji = 0;

        switch (departemen) {
            case "IT" -> gaji = 8000000;
            case "HRD" -> gaji = 5000000;
            case "Finance" -> gaji = 4000000;
            default -> {
                System.out.println("Departemen tidak valid");
                System.exit(0);
            }
        }

        switch (pengalaman) {
            case "pemula" -> gaji += 500000;
            case "menengah" -> gaji += 1000000;
            case "expert" -> gaji += 2000000;
            default -> {
                System.out.println("Pengalaman tidak valid");
                System.exit(0);
            }
        }

        switch (skill) {
            case "web" -> gaji += 1000000;
            case "mobile" -> gaji += 2000000;
            case "desktop" -> gaji += 2500000;
            default -> {
                System.out.println("Skill tidak valid");
                System.exit(0);
            }
        }

        return gaji;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Skill: " + skill);
        System.out.println("Pengalaman: " + pengalaman);
        System.out.println("Gaji: " + hitungGaji());
    }
}
