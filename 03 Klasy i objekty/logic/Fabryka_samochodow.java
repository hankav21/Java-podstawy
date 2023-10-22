public class Fabryka_samochodow {
    Auto wyprodukuj(String model, String kolor, int liczbaDrzwi) {
        Auto auto = new Auto();
        auto.pojazd.model = model;
        auto.pojazd.kolor = kolor;
        auto.liczbaDrzwi = liczbaDrzwi;
        auto.pojazd.przejechane_km = 0;

        return auto;
    }

}
