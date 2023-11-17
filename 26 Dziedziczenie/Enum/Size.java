package Enum;
//enumy = takie stale z wiekszymi mozliwosciami pozwalajace nam ograniczyc to co wprowadzamy do pola
//monirwaz dziedziczymy po enum dziedziczymy po jej klasie wartosci
/*
valuer = wsystkei wartosci z klasy
name = nazwa danej wartosci z uwzglednieneim liter
ordinal = numer porzadkowy (od 0)
valueOf
 */

//typ wyliczeniowy z zalozenie reprezentuje zestaw stalych
public enum Size {
    XSMALL("bd mały"),SMALL("Mały"), MEDIUM("średni"), LARGE("duzy");
    //^liczymy od zera

    //ponieaz z zalozenia sa taele zmienne tu to tez dodatkowe nasze zmienne nie powinny sie zmieniac
    final private String description;

    //w enumie konstruktor musi byc prywatny
    Size(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public  Size fromDescription(String d) {
//        switch(d){
//            case SMALL.getDescription():
//                return SMALL
//        }
        Size[] val = values();
        for (Size size: val ) {
            if (size.getDescription().equals(d))
                return size;

        }
        return null;

    }

}
