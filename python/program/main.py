
    # Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-1 dalam mata kuliah DPBO
    # untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 

from DPR import DPR

data_list = []  # Initialize an empty list to store DPR instances
dpr_instance = DPR()  # Create an instance of the DPR class

# meminta masukan perintah 
while True:
    dpr_instance.display_menu()
    try:
        choice = int(input("Masukkan pilihan Anda: "))
    except ValueError:
        print("Masukan tidak valid. Mohon masukkan angka 1-5.")
        continue

    if choice == 1:
        dpr_instance.display_data(data_list)
    elif choice == 2:
        dpr_instance.add_data(data_list)
    elif choice == 3:
        dpr_instance.update_data_by_id(data_list)
    elif choice == 4:
        dpr_instance.delete_by_id(data_list)
    elif choice == 5:
        print("Exiting program...")
        break
    else:
        print("Perintah salah.")
