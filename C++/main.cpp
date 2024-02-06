/* 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-1 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
*/

#include <bits/stdc++.h>
#include "DPR.cpp"

using namespace std; // deklarasi namespace

int main(){

    int a;
    int i, n = 0;
    string ID;
    string name;
    string nama_B;
    string nama_P;
    list<DPR> llist;

    do{ // looping selama masukan bukan 5 (keluar)
        cout << "1. Tampil"<< '\n';
        cout << "2. Tambah"<< '\n';
        cout << "3. Perbarui"<< '\n';
        cout << "4. Hapus"<< '\n';
        cout << "5. Keluar"<< '\n';
        cout << "masukan perintah : ";
        cin >> a;
        
        if(a == 1){ // jika masukan 1 maka tampilkan data
            if(llist.size() == 0){ // cek data apakah ada kosong
                cout << "data tidak ada" << '\n';
            }
            else{ // jika ada tampilkan data
                i = 0;
                cout << "Data :\n";
                for(list<DPR>::iterator it = llist.begin(); it != llist.end(); ++it){
                    cout << (i + 1) << ". " << it->get_ID() << " " << it->get_name() << " " << it->get_nama_B() << " " << it->get_nama_P() << '\n';
                    i++;
                }
                cout << '\n';
            }
        }
        else if(a == 2){ // jika masukan 2 maka tambah data
            // masukan banyak data
            int n;
            cout << "masukan banyak data : ";
            cin >> n;
            // loop pemasukan data ke list
            for(int i =  0; i < n; i++){
                DPR temp;
                cout << "Masukan ID : ";
                cin >> ID;
                cout << "Masukan Nama : ";
                cin >> name;
                cout << "Masukan Nama Bidang : ";
                cin >> nama_B;
                cout << "Masukan Nama Partai : ";
                cin >> nama_P;

                temp.set_ID(ID);    
                temp.set_name(name);
                temp.set_nama_B(nama_B);
                temp.set_nama_P(nama_P);

                // cek ID data apakah sudah ada jika ada data tidak akan di tambahkan
                if(find_if(llist.begin(), llist.end(), [&temp](const DPR& item){ return item.get_ID() == temp.get_ID(); }) != llist.end()){
                    cout << "ID Data yang ingin Anda tambah sudah ada" << "\n\n";
                }
                else{ // jika ID tidak ada data akan di tambahkan ke list
                    llist.push_back(temp);
                    cout << "Data berhasil ditambahkan"<< "\n\n";
                }
            }
        }
        else if(a ==  3){ // jika masukan 3 maka perbarui data
            // meminta masukan ID data yang ingin di perbarui
            cout << "Masukan ID data yang akan diperbarui : ";
            cin >> ID;

            // mencari data di list jika ada maka akan di perbarui
            DPR temp;
            auto it = find_if(llist.begin(), llist.end(), [&ID](const DPR& item){ return item.get_ID() == ID; });
            // jika ID ditemukan perbarui data
            if(it != llist.end()){
                cout << "Masukan ID baru : ";
                cin >> ID;
                cout << "Masukan Nama baru : ";
                cin >> name;
                cout << "Masukan Nama Bidang : ";
                cin >> nama_B;
                cout << "Masukan Nama Partai : ";
                cin >> nama_P;

                temp.set_ID(ID);    
                temp.set_name(name);
                temp.set_nama_B(nama_B);
                temp.set_nama_P(nama_P);

                *it = temp; // Update the item in the list

                cout << "Data berhasil diperbarui" << "\n\n";
            }
            else{
                cout << "Gagal menemukan data dengan ID tersebut" << "\n\n";
            }
        }
        else if(a ==   4){ // jika masukan 4 maka hapus data
            // meminta masukan ID data yang ingin di hapus
            cout << "Masukan ID data yang akan dihapus : ";
            cin >> ID;

            // mencari data dengan ID yang sesuai
            auto it = find_if(llist.begin(), llist.end(), [&ID](const DPR& item){ return item.get_ID() == ID; });

            // jika ID data ditemukan maka hapus datanya
            if(it != llist.end()){
                llist.erase(it); // Correctly erase the element at the iterator
                cout << "Data berhasil dihapus"<< "\n\n";
            }
            else{
                cout << "Gagal menemukan data dengan ID tersebut" << "\n\n";
            }
        }
    }while(a != 5);
    cout << "dadah~~~"<< '\n';


    return 0;
}