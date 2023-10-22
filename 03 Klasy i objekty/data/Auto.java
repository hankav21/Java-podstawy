package data;

public class Auto {
//    po zdefiniowniu klasy staje sie ona nowym typem danych
    //szablon
    Pojazd pojazd; //agregacja = obiekt składa sie z innych objektów
    //protected - ogranicza dostep  do jednego pakietu
    //private - dostep tylko z klasy w ktorej sie znajdujemy
    protected int liczbaDrzwi;
    private int rok;


    public Auto(){
        pojazd = new Pojazd();
    }

    public Auto(int liczbaDrzwi){
        pojazd = new Pojazd();
        this.liczbaDrzwi = liczbaDrzwi;
    }

    public Auto(int liczbaDrzwi, String model, String kolor, int przejechane_km){
        pojazd = new Pojazd(model, kolor, przejechane_km);
        this.liczbaDrzwi = liczbaDrzwi;
    }

    public Auto(int liczbaDrzwi, String model, String kolor, int przejechane_km, int rok_produkcji){
        pojazd = new Pojazd(model, kolor, przejechane_km);
        this.liczbaDrzwi = liczbaDrzwi;
        rok = rok_produkcji;
    }

    //kompozycja = istnienie obiektu bez swojego rodzica nie ma sensu np. smierc osoby = zniszczenie obiektu mózgu

//    metody
//    typ_zwracany nazwaMetody(opcjonalne_parametry)

    public void wyswietl_informacje() {
        System.out.println("Model: " + pojazd.model + " Kolor: " + pojazd.kolor +
                " Przejechane km: " + pojazd.przejechane_km + " Liczba drzwi: " + liczbaDrzwi);
    }

    public void komentarz_na_temat_modelu(){
        switch(pojazd.model){
            case "Mustang":
                System.out.println("Mustang: do patatajania po drogach");
                break;
            case "Suzuki":
                System.out.println("Suzuki: Do przelatywania nad rondami");
                break;
            default:
                System.out.println("Marka tak nudna ze nie mam na jej temat nic do powiedzenia");

        }
    }

    //getery i setery
    public void setRok(int rok){
        if(rok >=0)
            this.rok = rok;
        else System.out.println("Rok niepoprawny");
    }

    public int getRok(){
        return rok;
    }
    //alt + insert => generowanie


}
