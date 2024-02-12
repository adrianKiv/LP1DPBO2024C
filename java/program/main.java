/* 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-1 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
*/

import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<DPR> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        DPR test = new DPR();
        // meminta masukan perintah 
        int a = 0;
        do {
                test.displayMenu();
                try {
                    a = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Maksukan anda tidak ada dalam opsi!");
                    continue;
                }
                switch (a) {
                    case 1:
                        test.displayData(list);
                        break;
                    case 2:
                        test.addData(list, sc);
                        break;
                    case 3:
                        test.updateDataById(list, sc);
                        break;
                    case 4:
                        test.deleteById(list, sc);
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Perintah salah.");
                }
        } while (a != 5);

        sc.close();
    }
}
