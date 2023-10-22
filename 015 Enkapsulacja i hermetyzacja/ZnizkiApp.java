public class ZnizkiApp {
    public static void main(String[] args) {
        String imie, nazwisko;
        boolean klientPremium = true;
        double cena = 1100;
        double cenaObnizona = cena;
        if (klientPremium && cena > 1000) {
            //cenaObnizona = cenaObnizona -0.15 * cenaObnizona;
            cenaObnizona *= 0.85;
        } else if (cena > 1000) {
            cenaObnizona *= 0.9;
        } else if (klientPremium) {
            cenaObnizona *= 0.95;
        }

        System.out.println("dzieki rabatowi zaoszczedzone zostalo: " + (cena - cenaObnizona) +  " zł");


    }
}
