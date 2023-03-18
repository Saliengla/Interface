public class Pasta extends Yemek implements Tatli{

    public Pasta(String yemekAdi, String malzemeler, int porsiyon) {
        super(yemekAdi, malzemeler, porsiyon);
    }


    @Override
    public boolean malzemeKontrol(String malzemeler) {

        if (malzemeler.equals("Kakao, sut, yumurta, un, vanilya, yag"))
            return true;

        else
            return false;
    }


    @Override
    public String hazirla() {

        if(malzemeKontrol(malzemeler)==true) {
            return malzemeler + " malzemelerini karistir ve firina at";
        }
        else
            return "Yanlış malzeme girdiniz";
    }


    @Override
    public String sekerKaristir() {

        if (yemekAdi.equals("Meyveli pasta"))
            return "Sekere gerek yok";

        else
            return "Malzemelere 2 kasik seker ekle ve karistir";
    }


    public String toString() {
        return  yemekAdi + "{" +"\n" +
                "Hazirla=" + hazirla() + "\n" +
                "Porsiyon=" + porsiyon + "\n" +
                "Seker=" +sekerKaristir() + "\n" +
                '}';
    }
}