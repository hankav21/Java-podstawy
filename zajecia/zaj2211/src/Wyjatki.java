public class Wyjatki {

    //musimy dac wszystkei wyjatki checkt ktore moga byc zgloszone w tej metodzie
    static  void except() throws ClassNotFoundException{
        throw new ClassNotFoundException("moj wyjatek");
    }

    public static void main(String[] args) {
        int a =0, b = 0;

        //mozna je zagniezdzac
        try {
            except();
            //throw new ArithmeticException("moj wyjatek");
            a = a/b;

        }
        catch (ArithmeticException e){
            System.out.println("dpz: " + e);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("xxx");
    }
}
