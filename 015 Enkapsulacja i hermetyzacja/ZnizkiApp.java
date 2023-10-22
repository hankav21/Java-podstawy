public class ZnizkiApp {
    public static void main(String[] args) {


        Klient klient1 = new Klient("Wilchelma", "Zawiecha", true);
        double cena = 1100;
        double cenaObnizona;
        ZnizkiService serwisZnizkowy = new ZnizkiService();
        cenaObnizona = serwisZnizkowy.obliczCenePoObnizce(klient1,cena);

        System.out.println("dzieki rabatowi zaoszczedzone zostalo: " + (cena - cenaObnizona) +  " zł");


    }
}
