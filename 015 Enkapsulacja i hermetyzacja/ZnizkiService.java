public class ZnizkiService {

    public double obliczCenePoObnizce(Klient klient, double cena){

        if (klient.isKlientPremium()) return obliczZnizkePremium(cena);
        return obliczStandardowaZnizke(cena);
    }

    private double obliczStandardowaZnizke (double cena){

        if (cena > 1000) return cena * 0.9;
        return cena;
    }

    private double obliczZnizkePremium(double cena){

        if (cena > 1000) return cena * 0.85;
        return  cena * 0.9;

    }
}
