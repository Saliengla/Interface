public class CigKofte extends Yemek {

    public CigKofte(String yemekAdi, String malzemeler, int porsiyon) {

        super(yemekAdi, malzemeler, porsiyon);
    }

    @Override
    public String hazirla() {

        return malzemeler + "malzemelerini karistir ve guzelce yogur";
    }


    public String toString() {
        return aciDurumu() + "{" + "\n" +
                "Hazirla=" + hazirla() + "\n" +
                "Porsiyon=" + porsiyon + "\n" +
                '}';
    }

}