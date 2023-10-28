package polimorfizm;

public class Zwierze {
    private String nazwa;

    public Zwierze(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dajGlos(){
        System.out.println("Zwierze o nazwie " + nazwa);
    }
}
