/* 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-1 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
*/

import java.util.ArrayList;
import java.util.Scanner;

// Deklarasi kelas DPR dengan atribut privat dan metode publik
public class DPR {
    // Atribut privat untuk menyimpan informasi tentang DPR
    private String ID;
    private String nama;
    private String nama_B;
    private String nama_P;

    // Konstruktor tanpa parameter, digunakan untuk membuat objek DPR dengan nilai default
    public DPR() {
        this.ID = "";
        this.nama = "";
        this.nama_B = "";
        this.nama_P = "";
    }

    // Konstruktor dengan parameter, digunakan untuk membuat objek DPR dengan nilai yang diberikan
    public DPR(String ID, String nama, String nama_B, String nama_P) {
        this.ID = ID;
        this.nama = nama;
        this.nama_B = nama_B;
        this.nama_P = nama_P;
    }

    // Metode getter dan setter untuk ID
    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    // Metode getter dan setter untuk nama
    public String getnama() {
        return this.nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    // Metode getter dan setter untuk nama_B
    public String getnama_B() {
        return this.nama_B;
    }

    public void setnama_B(String nama_B) {
        this.nama_B = nama_B;
    }

    // Metode getter dan setter untuk nama_P
    public String getnama_P() {
        return this.nama_P;
    }

    public void setnama_P(String nama_P) {
        this.nama_P = nama_P;
    }

    // Metode untuk menampilkan menu
    public void displayMenu() {
        System.out.println("\nSilahkan pilih perintah di bawah:");
        System.out.println("1. Tampilkan data");
        System.out.println("2. Tambahkan data");
        System.out.println("3. Perbarui data");
        System.out.println("4. Hapus data");
        System.out.println("5. Keluar");
    }

    // Metode untuk menampilkan data
    public void displayData(ArrayList<DPR> list) {
        if (list.isEmpty()) {
            System.out.println("Data masi kosong bro.");
        } else {
            // Print header row
            int no = 2;
            int maxid = 2;
            int maxnama = 4;
            int maxnamaB = 11;
            int maxnamaP = 11;
            // mencari string terpanjang
            for (int i = 0; i < list.size(); i++){
                DPR data = list.get(i);
                if ((list.get(i).getID()).length() > maxid) maxid = (list.get(i).getID()).length();
                if ((list.get(i).getnama()).length() > maxnama) maxnama = (list.get(i).getnama()).length();
                if ((list.get(i).getnama_B()).length() > maxnamaB) maxnamaB = (list.get(i).getnama_B()).length();
                if ((list.get(i).getnama_P()).length() > maxnamaP) maxnamaP = (list.get(i).getnama_P()).length();
            }

            System.out.print("+");
            for(int z = 0; z < no + 2; z++){
                System.out.print("-");
            }
            System.out.print("+");
            for(int z = 0; z < maxid + 2; z++){
                System.out.print("-");
            }
            System.out.print("+");
            for(int z = 0; z < maxnama + 2; z++){
                System.out.print("-");
            }
            System.out.print("+");
            for(int z = 0; z < maxnamaB + 2; z++){
                System.out.print("-");
            }
            System.out.print("+");
            for(int z = 0; z < maxnamaP + 2; z++){
                System.out.print("-");
            }
            System.out.print("+\n");

            System.out.print("| NO ");
            for(int z = 0; z < no - 2; z++){
                System.out.print(" ");
            }
            System.out.print("| ID ");
            for(int z = 0; z < maxid - 2; z++){
                System.out.print(" ");
            }
            System.out.print("| NAMA ");
            for(int z = 0; z < maxnama - 4; z++){
                System.out.print(" ");
            }
            System.out.print("| NAMA BIDANG ");
            for(int z = 0; z < maxnamaB - 11; z++){
                System.out.print(" ");
            }
            System.out.print("| NAMA PARTAI ");
            for(int z = 0; z < maxnamaP - 11; z++){
                System.out.print(" ");
            }
            System.out.print("|\n");

            System.out.print("+");
            for(int z = 0; z < no + 2; z++){
                System.out.print("-");
            }
            System.out.print("+");
            for(int z = 0; z < maxid + 2; z++){
                System.out.print("-");
            }
            System.out.print("+");
            for(int z = 0; z < maxnama + 2; z++){
                System.out.print("-");
            }
            System.out.print("+");
            for(int z = 0; z < maxnamaB + 2; z++){
                System.out.print("-");
            }
            System.out.print("+");
            for(int z = 0; z < maxnamaP + 2; z++){
                System.out.print("-");
            }
            System.out.print("+\n");
            // Print data rows
            for (int i = 0; i < list.size(); i++) {
                DPR human = list.get(i);

                System.out.print("| " + (i +  1) + ". ");
                System.out.print("| " + list.get(i).getID());
                for(int x = 0; x < (maxid + 1) - list.get(i).getID().length(); x++){
                    System.out.print(" ");
                }
                System.out.print("| " + list.get(i).getnama());
                for(int x = 0; x < (maxnama + 1) - list.get(i).getnama().length(); x++){
                    System.out.print(" ");
                }
                System.out.print("| " + list.get(i).getnama_B());
                for(int x = 0; x < (maxnamaB + 1) - list.get(i).getnama_B().length(); x++){ 
                    System.out.print(" ");
                }
                System.out.print("| " + list.get(i).getnama_P());
                for(int x = 0; x < (maxnamaP + 1) - list.get(i).getnama_P().length(); x++){
                    System.out.print(" ");
                }
                System.out.print("|\n");
            }

            System.out.print("+");
            for(int z = 0; z < no + 2; z++){
                System.out.print("-");
            }
            System.out.print("+");
            for(int z = 0; z < maxid + 2; z++){
                System.out.print("-");
            }
            System.out.print("+");
            for(int z = 0; z < maxnama + 2; z++){
                System.out.print("-");
            }
            System.out.print("+");
            for(int z = 0; z < maxnamaB + 2; z++){
                System.out.print("-");
            }
            System.out.print("+");
            for(int z = 0; z < maxnamaP + 2; z++){
                System.out.print("-");
            }
            System.out.print("+\n");
        }
    }

    // Metode untuk menambahkan data ke dalam ArrayList
    public void addData(ArrayList<DPR> list, Scanner sc) {
        System.out.println("Masukan jumlah data: ");
        int n = sc.nextInt();

        for (int i =  0; i < n; i++) {
            System.out.println("Masukan ID " + (i +  1) + ":");
            String ID = sc.next();
            System.out.println("Masukan Nama " + (i +  1) + ":");
            String nama = sc.next();
            System.out.println("Masukan Nama bidang " + (i +  1) + ":");
            String nama_B = sc.next();
            System.out.println("Masukan Nama partai " + (i +  1) + ":");
            String nama_P = sc.next();

            // Membuat objek DPR baru dan menambahkannya ke dalam ArrayList
            DPR temp = new DPR(ID, nama, nama_B, nama_P);
            list.add(temp);
            System.out.println("Data ditambahkan dengan sukses.");
        }
    }

    // Metode untuk memperbarui data berdasarkan ID
    public void updateDataById(ArrayList<DPR> list, Scanner sc) {
        System.out.println("Masukan ID data yang mau diperbarui: ");
        String IDupdate = sc.next();

        // Mencari indeks objek DPR berdasarkan ID
        int index = findIndexOfHumanById(list, IDupdate);

        if (index != -1) {
            System.out.println("Masukan ID baru:");
            String ID = sc.next();
            System.out.println("Masukan Nama baru:");
            String nama = sc.next();
            System.out.println("Masukan Nama bidang baru:");
            String nama_B = sc.next();
            System.out.println("Masukan Nama partai baru:");
            String nama_P = sc.next();

            // Membuat objek DPR baru dengan data yang diperbarui
            DPR updatedHuman = new DPR(ID, nama, nama_B, nama_P);
            // Mengganti objek lama dengan objek yang diperbarui
            list.set(index, updatedHuman);
            System.out.println("Data diperbarui dengan sukses.");
        } else {
            System.out.println("Data dengan ID " + IDupdate + " tidak ditemukan.");
        }
    }

    // Metode untuk menghapus data berdasarkan ID
    public void deleteById(ArrayList<DPR> list, Scanner sc) {
        System.out.println("Masukan ID data yang ingin dihapus: ");
        String ID = sc.next();

        // Mencari indeks objek DPR berdasarkan ID
        int index = findIndexOfHumanById(list, ID);

        if (index != -1) {
            // Menghapus objek dari ArrayList
            list.remove(index);
            System.out.println("Data dihapus dengan sukses.");
        } else {
            System.out.println("Data dengan ID " + ID + " tidak ditemukan.");
        }
    }

    // Metode helper untuk mencari indeks objek DPR berdasarkan ID
    public int findIndexOfHumanById(ArrayList<DPR> list, String ID) {
        for (int i =  0; i < list.size(); i++) {
            if (list.get(i).getID().equals(ID)) {
                return i; // Mengembalikan indeks tempat objek ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika objek tidak ditemukan
    }
    // Nahh, Java doesn't need a destructor.
}