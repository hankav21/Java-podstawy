package polimorfizm;

public class Kot extends Zwierze{
    public Kot(String nazwa){
        super(nazwa);
    }

    @Override
    public void dajGlos(){
        System.out.println("Kot o nazwie " + getNazwa());
    }

    public void zamrucz(){
        System.out.println("mrrrr");
    }
}
