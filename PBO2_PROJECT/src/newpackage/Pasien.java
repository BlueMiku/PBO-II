package newpackage;

public class Pasien{
    private String kodePasien;
    private String nama;
    private String alamat;
    private String resep;
    private String diagnosa;
    private String kodeKamar;
    private int tarifKamar;
    private String jenisLayanan;
    private int tarifLayanan;
    private String tanggalMasuk;
    private String tanggalKeluar;
    
    public Pasien() {
    }

    public Pasien(String kodePasien, String nama, String alamat, String resep, String diagnosa, String kodeKamar, int tarifKamar, String jenisLayanan, int tarifLayanan, String tanggalMasuk, String tanggalKeluar) throws Exception{
        setKodePasien(kodePasien);
        setNama(nama);
        this.alamat = alamat;
        setResep(resep);
        setDiagnosa(diagnosa);
        this.kodeKamar = kodeKamar;
        this.tarifKamar = tarifKamar;
        this.jenisLayanan = jenisLayanan;
        this.tarifLayanan = tarifLayanan;
        this.tanggalMasuk = tanggalMasuk;
        this.tanggalKeluar = tanggalKeluar;
    }

    public String getKodePasien() {
        return kodePasien;
    }

    public void setKodePasien(String kodePasien) throws Exception {
        String pola ="[A-Z][A-Z][0-9][0-9]";
        if( kodePasien.matches(pola)){
            this.kodePasien = kodePasien;
        }
        else{
            throw new Exception("Terdapat kesalahan dalam pengisian kode pasien");    
        }
    }

    public String getKodeKamar() {
        return kodeKamar;
    }

    public void setKodeKamar(String kodeKamar) {
        this.kodeKamar = kodeKamar;
    }

    public int getTarifKamar() {
        return tarifKamar;
    }

    public void setTarifKamar(int tarifKamar) {
        this.tarifKamar = tarifKamar;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    public int getTarifLayanan() {
        return tarifLayanan;
    }

    public void setTarifLayanan(int tarifLayanan) {
        this.tarifLayanan = tarifLayanan;
    }

    public String getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(String tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public String getTanggalKeluar() {
        return tanggalKeluar;
    }

    public void setTanggalKeluar(String tanggalKeluar) {
        this.tanggalKeluar = tanggalKeluar;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) throws Exception {
        String pola ="[A-Za-z]{3,30}";
        if(nama.matches(pola)){
            this.nama = nama;
        }
        else{
            throw new Exception("Terdapat kesalahan dalam pengisian Nama");    
        }
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public void setDiagnosa(String diagnosa) throws Exception {
        String pola ="[A-Za-z]{5,20}";
        if(diagnosa.matches(pola)){
            this.diagnosa = diagnosa;
        }
        else{
            throw new Exception("Terdapat kesalahan dalam pengisian Diagnosa");    
        }
    }

    public String getResep() {
        return resep;
    }

    public void setResep(String resep) throws Exception {
        String pola ="[A-Z][0-9][A-Z][0-9]";
        if(resep.matches(pola)){
            this.resep = resep;
        }
        else{
            throw new Exception("Terdapat kesalahan dalam pengisian Resep");    
        }
    }
    public static void main(String[] args) throws Exception {
        Pasien pl = new Pasien();
        pl.setNama("a");
//        System.out.println(pl.getKodePasien());
    }}
