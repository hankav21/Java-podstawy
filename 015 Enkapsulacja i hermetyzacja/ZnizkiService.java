public class ZnizkiService {

    public double obliczCenePoObnizce(Klient klient, double cena){
        double cenaObnizona = cena;
        if (klient.isKlientPremium() && cena > 1000) {
            //cenaObnizona = cenaObnizona -0.15 * cenaObnizona;
            cenaObnizona *= 0.85;
        } else if (cena > 1000) {
            cenaObnizona *= 0.9;
        } else if (klient.isKlientPremium()) {
            cenaObnizona *= 0.95;
        }
        return cenaObnizona;
    }
}
