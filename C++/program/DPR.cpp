/* 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-1 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
*/

#include <iostream>
#include <string>
#include <bits/stdc++.h>

using namespace std;

class DPR{
    // atribut private
    private:
    string ID;
    string name;
    string nama_B;
    string nama_P;
    // atribut public
    public:

        // konstruktor
        DPR(){
            this->ID = "";
            this->name = "";
            this->nama_B = "";
            this->nama_P = "";
        }

        DPR(string ID, string name, string nama_B, string nama_P){
            this->ID = ID;
            this->name = name;
            this->nama_B = nama_B;
            this->nama_P = nama_P;
        }

        // get dan set
        string get_ID() const{
            return this->ID;
        }

        void set_ID(string ID){
            this->ID = ID;
        }

        string get_name(){
            return this->name;
        }

        void set_name(string name){
            this->name = name;
        }

        string get_nama_B(){
            return this->nama_B;
        }

        void set_nama_B(string nama_B){
            this->nama_B = nama_B;
        }

        string get_nama_P(){
            return this->nama_P;
        }

        void set_nama_P(string nama_P){
            this->nama_P = nama_P;
        }
        
        // destructor
        ~DPR(){

        }
};