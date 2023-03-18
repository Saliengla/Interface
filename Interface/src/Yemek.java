public abstract class Yemek {

    protected String yemekAdi;
    protected String malzemeler;
    protected int porsiyon;


    public Yemek(String yemekAdi, String malzemeler, int porsiyon) {
        this.yemekAdi = yemekAdi;
        this.malzemeler = malzemeler;
        this.porsiyon = porsiyon;
    }


    public abstract String hazirla();


    public boolean malzemeKontrol(String malzemeler) {
        return false;
    }


    public String aciDurumu() {
        if (yemekAdi.equals("Bol Acili"))
            return yemekAdi.concat(" Cigkofte");

        else
            return "Acısız Cigkofte";
    }
}
