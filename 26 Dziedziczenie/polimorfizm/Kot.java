package polimorfizm;

public class Kot extends Zwierze{
    private int wiek;

    public Kot(String nazwa){
        super(nazwa);
    }
    public Kot(String nazwa, int wiek){
        super(nazwa);
        this.wiek = wiek;
    }

    @Override
    public void dajGlos(){
        System.out.println("Kot o nazwie " + getNazwa());
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)    //jeśli 2 referencje wskazuja na ten sam obiekt to zwracamy true
            return true;
        //odtad zakladamy ze 2 referencje nie wskazuja na ten sam obbiekt
        if(obj == null)     //tu zakladamy ze probujemy porownac obiek z referencja null => obiekt nie moze byc jednosczesnie nullem wiec fałsz
            return false;
        if(getClass() != obj.getClass())    //jesli klasy sie nie zgadzaja to zwrcamy falsz
            return false;
        Kot other = (Kot) obj;  //poniewaz po porzednim wiemy ze to jest nasza klasa wiec tworzymy z niej obiekt kota (rzutowanie referencji zeby mozna bylo uzywac wszytskiego z kota)
        if(wiek != other.wiek)  //poniewaz wiek jest ttypem prostym mozemy porownac go zwyklym operatorem
            return false;
        if(getNazwa() == null ){    //poniewaz String jest obiektowym typem sprawdzamy czy korykowliwek z nich jest nulllem
            if(other.getNazwa() != null)
                return false;
        }else if (!getNazwa().equals(other.getNazwa()))
            return false;
        return true;    //jesli zaden z ifow nic nie wylapal to znaczy ze obiekty sa takie same
    }

    public void zamrucz(){
        System.out.println("mrrrr");
    }
}
