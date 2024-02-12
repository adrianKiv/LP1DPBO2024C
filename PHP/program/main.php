<!-- 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-1 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
-->

<style>
  table {
    border:  2px solid black;
    border-collapse: collapse;
    width:  30%;
    margin-bottom:  20px; /* Jarak antara tabel */
  }
  th, td {
    padding:  4px;
    border:  1px solid black;
    text-align: left;
  }
</style>

<?php
  // Membuka elemen tabel dan menambahkan header
  echo "<table>
    <tr>
      <th>No</th>
      <th>ID</th>
      <th>NAMA</th>
      <th>NAMA BIDANG</th>
      <th>NAMA PARTAI</th>
      <th>FOTO</th>
    </tr>";

  // Memastikan kelas DPR telah didefinisikan
  require ('DPR.php');

  // Membuat array objek DPR
  $all_data = [];

  // Populating array all_data dengan objek DPR
  //mengisi array all_data dengan data sementara
  $data1 = new DPR("S1", "agus", "alat", "PDI", "<img src='../foto/oni.jpg' width='65' height='40'>");
  $data2 = new DPR("S2", "dadang", "acara", "GOLKAR", "<img src='../foto/oni.jpg' width='65' height='40'>");
  $data3 = new DPR("S3", "asep", "lapangan", "PAN", "<img src='../foto/oni.jpg' width='65' height='40'>");
  $data4 = new DPR("S4", "yan", "koordinir", "PDI", "<img src='../foto/oni.jpg' width='65' height='40'>");
  $data5 = new DPR("S5", "kiv", "acara", "PSI", "<img src='../foto/oni.jpg' width='65' height='40'>");
  $data6 = new DPR("S6", "nooel", "monitoring", "GOLKAR", "<img src='../foto/oni.jpg' width='65' height='40'>");

  // Menambahkan objek ke array all_data
  array_push($all_data, $data1);
  array_push($all_data, $data2);
  array_push($all_data, $data3);
  array_push($all_data, $data4);
  array_push($all_data, $data5);
  array_push($all_data, $data6);

  // Fungsi untuk menampilkan tabel berdasarkan array objek DPR
  function displayTable($all_data) {
    $index =  1; // Inisialisasi indeks untuk kolom No
    foreach ($all_data as $dpr) {
      echo "<tr>"; // menampilkan semua data
      echo "<td>" . $index++ . '.'. "</td>";
      echo "<td>" . $dpr->getID() . "</td>";
      echo "<td>" . $dpr->getNama() . "</td>";
      echo "<td>" . $dpr->getNamaB() . "</td>";
      echo "<td>" . $dpr->getNamaP() . "</td>";
      echo "<td>" . $dpr->getFoto() . "</td>";
      echo "</tr>";
    }
  }

  // Menampilkan tabel
  echo str_repeat("&nbsp",  60) . "<b>" . "Daftar Data Anggota DPR" . "</b>" . "<br>";
  displayTable($all_data);
  echo "</table>";

  // Operasi hapus
  $targetId = "S1"; // ID yang akan dihapus
  $cek =  0; // Variabel pengecekan apakah data ditemukan
  foreach ($all_data as $key => $dpr) {
    if ($dpr->getID() == $targetId) {
      $cek =  1; // Jika data ditemukan, ubah nilai cek menjadi  1
      unset($all_data[$key]); // Hapus item dari array
      break; // Keluar dari loop
    }
  }
  $all_data = array_values($all_data); // Re-indeks array

  // Menampilkan pesan pemberitahuan setelah operasi hapus
  if ($cek ==  1){
    echo "<i>" . "Data berhasil dihapus!" . "</i>" . "<br>" . "<br>";
  } 
  else{
    echo "<i>" . "Data tidak ditemukan!" . "</i>" . "<br>" . "<br>";
  }

  // Menampilkan tabel setelah data dihapus
  echo "<table>
    <tr>
      <th>No</th>
      <th>ID</th>
      <th>NAMA</th>
      <th>NAMA BIDANG</th>
      <th>NAMA PARTAI</th>
      <th>FOTO</th>
    </tr>";
  echo str_repeat("&nbsp",  40) . "<b>" . "Daftar Data Anggota DPR Setelah Dihapus" . "</b>" . "<br>";
  displayTable($all_data);
  echo "</table>";

  // Operasi update
  $targetId = "S2"; // ID yang akan diupdate
  $cek =  0; // Reset variabel pengecekan
  $newData = [ // data baru
    'nama' => 'ikan',
    'namaB' => 'kelautan',
    'namaP' => 'DDS',
    'foto' => '<img src="../foto/hiu.jpg" width="40" height="40">'
  ];
  foreach ($all_data as $key => $dpr) {
    if ($dpr->getID() == $targetId) { // mengubah data
      $dpr->setNama($newData['nama']);
      $dpr->setNamaB($newData['namaB']);
      $dpr->setNamaP($newData['namaP']);
      $dpr->setFoto($newData['foto']);
      $cek =  1; // Jika data ditemukan, ubah nilai cek menjadi  1
    }
  }

  // Menampilkan pesan pemberitahuan setelah operasi update
    if ($cek = 1){
      echo "<i>" . "Data berhasil diperbarui!" . "</i>" . "<br>" . "<br>";
    }
    else{
      echo "<i>" . "Data tidak ditemukan!" . "</i>" . "<br>" . "<br>";
    }

  // Menampilkan tabel setelah data diupdate
  echo "<table>
    <tr>
      <th>No</th>
      <th>ID</th>
      <th>NAMA</th>
      <th>NAMA BIDANG</th>
      <th>NAMA PARTAI</th>
      <th>FOTO</th>
    </tr>";
  echo str_repeat("&nbsp",  40) . "<b>" . "Daftar Data Anggota DPR Setelah Diperbarui" . "</b>" . "<br>";
  displayTable($all_data);
  echo "</table>";

?>