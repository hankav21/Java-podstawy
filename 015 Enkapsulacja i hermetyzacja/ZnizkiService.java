public class ZnizkiService {

    public double obliczCenePoObnizce(Klient klient, double cena){

        if (klient.isKlientPremium()) return obliczZnizkePremium(cena);
        return obliczStandardowaZnizke(cena);
    }

    private double obliczStandardowaZnizke (double cena){

        if (cena > 1000) return przyznajZnizke(cena,0.1);
        return cena;
    }

    private double obliczZnizkePremium(double cena){

        if (cena > 1000) return przyznajZnizke(cena, 0.15);
        return  cena * 0.9;
    }

    private double przyznajZnizke(double cena, double znizka){
        return  cena * (1 - znizka);
    }
}
