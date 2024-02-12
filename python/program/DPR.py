
    # Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-1 dalam mata kuliah DPBO
    # untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 

import random  # Import modul random untuk digunakan dalam generate ID DPR

class DPR:
    def __init__(self, ID="", nama="", nama_B="", nama_P=""):
        self.ID = ID
        self.nama = nama
        self.nama_B = nama_B
        self.nama_P = nama_P

    # Getter dan setter untuk masing-masing atribut
    def get_ID(self):
        return self.ID
    def set_ID(self, ID):
        self.ID = ID

    def get_nama(self):
        return self.nama
    def set_nama(self, nama):
        self.nama = nama

    def get_nama_B(self):
        return self.nama_B
    def set_nama_B(self, nama_B):
        self.nama_B = nama_B

    def get_nama_P(self):
        return self.nama_P
    def set_nama_P(self, nama_P):
        self.nama_P = nama_P

    # Metode untuk menampilkan menu pilihan
    def display_menu(self):
        print("\nSilahkan pilih perintah dibawah:")
        print("1. Tampilkan data")
        print("2. Tambahkan data")
        print("3. Perbarui data")
        print("4. Hapus data")
        print("5. Keluar")

    # Metode untuk menampilkan data DPR
    def display_data(self, data_list):
        if not data_list:
            print("Data masih kosong.")
        else:
            # Hitung lebar kolom
            max_id = 2
            max_nama = 4
            max_namaB = 11
            max_namaP = 11
            
            for dpr in data_list:
                if len(dpr.get_ID()) > max_id:
                    max_id = len(dpr.get_ID())
                if len(dpr.get_nama()) > max_nama:
                    max_nama = len(dpr.get_nama())
                if len(dpr.get_nama_B()) > max_namaB:
                    max_namaB = len(dpr.get_nama_B())
                if len(dpr.get_nama_P()) > max_namaP:
                    max_namaP = len(dpr.get_nama_P())       

            # Tampilkan baris header
            header = f"| {'NO':<2} | {'ID':<{max_id}} | {'NAMA':<{max_nama}} | {'NAMA BIDANG':<{max_namaB}} | {'NAMA PARTAI':<{max_namaP}} |"
            line = '+' + '-' * (len(header) - 2) + '+'
            print(line)
            print(header)
            print(line)

            # Tampilkan baris data
            for i, dpr in enumerate(data_list, start=1):
                row = f"| {i:<2} | {dpr.get_ID():<{max_id}} | {dpr.get_nama():<{max_nama}} | {dpr.get_nama_B():<{max_namaB}} | {dpr.get_nama_P():<{max_namaP}} |"
                print(row)

            print(line)

    # Metode untuk menambahkan data DPR
    def add_data(self, data_list):
        num_data = int(input("masukan jumlah data: "))

        for _ in range(num_data):
            ID = str(input("Masukan ID :"))
            nama = str(input("Masukan Nama :"))
            nama_B = str(input("Masukan Nama Bidang :"))
            nama_P = str(input("Masukan Nama Partai :"))

            # Buat objek DPR baru dan tambahkan ke daftar
            dpr = DPR(ID, nama, nama_B, nama_P)
            data_list.append(dpr)

            print("Data berhasil ditambahkan.")

    # Metode untuk memperbarui data DPR berdasarkan ID
    def update_data_by_id(self, data_list):
        def find_index_of_dpr_by_id(data_list, ID):
            for i, dpr in enumerate(data_list):
                if dpr.get_ID() == ID:
                    return i
            return -1

        ID_update = str(input("masukan ID yang di ubah :"))
        index = find_index_of_dpr_by_id(data_list, ID_update)

        if index != -1:
            ID = str(input("Masukan ID baru :"))
            nama = str(input("Masukan Nama baru :"))
            nama_B = str(input("Masukan Nama bidang baru :"))
            nama_P = str(input("Masukan Nama partai baru :"))

            data_list[index] = DPR(ID, nama, nama_B, nama_P)

            print("Data berhasil diperbarui.")
        else:
            print("Data dengan ID", ID_update, "tidak ditemukan.")

    # Metode untuk menghapus data DPR berdasarkan ID
    def delete_by_id(self, data_list):
        def find_index_of_dpr_by_id(data_list, ID):
            for i, dpr in enumerate(data_list):
                if dpr.get_ID() == ID:
                    return i
            return -1

        ID = str(input("masukan ID yang ingin di hapus : "))

        index = find_index_of_dpr_by_id(data_list, ID)

        if index != -1:
            del data_list[index]
            print("Data berhasil dihapus.")
        else:
            print("Data dengan ID", ID, "tidak ditemukan.")
