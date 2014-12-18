package laporan.pkg1;
public class Manager extends Pekerja {
    
    public static int TUNJANGAN_ESELON = 500;
    private int eselon;

    public Manager(int eselon, String nip, int golongan) {
        super(nip, golongan);
        this.eselon = eselon;
    }

    public Manager( String nama, String tempatLahir, String tanggalLahir
            ,String nip,int eselon,int golongan) {
        super( nama, tempatLahir, tanggalLahir,nip, golongan);
        this.eselon = eselon;
    }   

    public Manager(int eselon) {
        this.eselon = eselon;
    }
    
    @Override
    public int gaji(){
        return super.gaji()+TUNJANGAN_ESELON*getEselon();
    }

    public int getEselon() {
        return eselon;
    }


    public void setEselon(int eselon) {
        this.eselon = eselon;
    }

    
}
