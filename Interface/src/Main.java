public class Main {
    public static void main(String[] args) {

        Pasta cikolataliPasta = new Pasta("Cikolatali pasta", "Kakao, sut, yumurta, un, vanilya, yag", 2);
        System.out.println(cikolataliPasta.toString());

        Pasta meyveliPasta = new Pasta("Meyveli pasta", "Kakao, sut, yumurta, un, vanilya, yag", 3);
        System.out.println(meyveliPasta.toString());

        Sutlac sutlac = new Sutlac("Sütlac","Pirinc, süt, seker" , 4);
        System.out.println(sutlac.toString());

        CigKofte cigKofte = new CigKofte("Bol Acili","Bulgur, salca, isot, pul biber,yag " ,1 );
        System.out.println(cigKofte.toString());

    }
}