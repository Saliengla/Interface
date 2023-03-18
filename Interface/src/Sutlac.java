public class Sutlac extends Yemek implements Tatli{

    public Sutlac(String yemekAdi, String malzemeler, int porsiyon) {

        super(yemekAdi, malzemeler, porsiyon);
    }

    @Override
    public String hazirla() {

        return malzemeler + "malzemelerini karistir sonra firina at";
    }

    @Override
    public String sekerKaristir() {

        return "Malzemelere 2 kasik seker ekle ve karistir";
    }


    public String toString() {
        return yemekAdi + "{" +"\n" +
                "malzemeler=" + malzemeler + "\n" +
                "Porsiyon=" + porsiyon + "\n" +
                "Seker=" +sekerKaristir() + "\n" +
                '}';
    }
}