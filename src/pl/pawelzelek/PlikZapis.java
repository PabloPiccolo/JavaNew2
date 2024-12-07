package pl.pawelzelek;

public class PlikZapis {
    public String fileName;
    public int sizeFile;
    boolean coJest;
    public String [] tablica;
    public static void SaveFile(){
        System.out.println("Zapis pliku");
    }
    public int addFile(){
        return sizeFile+100;
    }

    public PlikZapis(String fileName, int sizeFile, boolean coJest, String[] tablica) {
        this.fileName = fileName;
        this.sizeFile = sizeFile;
        this.coJest = coJest;
        this.tablica = tablica;
    }
}
