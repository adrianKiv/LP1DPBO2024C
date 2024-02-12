<!-- 
    Saya Adrian Mulianto NIM [2200939] mengerjakan soal Latihan Praktikum-1 dalam mata kuliah DPBO
    untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin 
-->

<!-- Kelas DPR yang digunakan untuk merepresentasikan data DPR -->
<?php
    class DPR
    {
        // Atribut yang digunakan pada kelas DPR         
        private $ID = '';
        private $nama = '';
        private $namaB = '';
        private $namaP = '';
        private $foto = '';
        
        // Constructor
        public function __construct($ID = '', $nama = '', $namaB = '', $namaP = '', $foto = '')
        {
            $this->ID = $ID;
            $this->nama = $nama;
            $this->namaB = $namaB;
            $this->namaP = $namaP;
            $this->foto = $foto;
        }
        
        // Method set untuk set setiap atribut pada kelas mahasiswa
        public function setID($ID)
        {
            $this->ID = $ID;
        }

        public function setNama($nama)
        {
            $this->nama = $nama;
        }

        public function setNamaB($namaB)
        {
            $this->namaB = $namaB;
        }

        public function setNamaP($namaP)
        {
            $this->namaP = $namaP;
        }

        public function setFoto($foto)
        {
            $this->foto = $foto;
        }
        
        // Method get untuk get setiap atribut pada kelas mahasiswa
        public function getID()
        {
            return $this->ID;
        }

        public function getNama()
        {
            return $this->nama;
        }

        public function getNamaB()
        {
            return $this->namaB;
        }

        public function getNamaP()
        {
            return $this->namaP;
        }

        public function getFoto()
        {
            return $this->foto;
        }
        
        // Destructor
        function __destruct()
        {
            
        }
    }
?>