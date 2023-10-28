package polimorfizm;

public class Pies extends Zwierze{
    public Pies(String nazwa){
        super(nazwa);
    }

    @Override
    public void dajGlos(){
        System.out.println("Pies o nazwie " + getNazwa());
    }

    public void szczekaj(){
        System.out.println("Hal hau");
    }
}
