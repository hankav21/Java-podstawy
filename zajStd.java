
public class klasa {
    public static void main(String[] args) {
//        int i = (int)21.21; //rzutowanie
//        double d = 21.333333333333333333;
//        float f = 33.333333f;
//        System.out.println("i: " + i);
//        System.out.println("d: " + d);
//        System.out.println("f: " + f);
//
//        char c = 'a';
//
//        boolean a = true, b = false;
//
//        if(!a || b) {
//            System.out.println(a || b);
//            b= !b;
//        } else if (a) System.out.println(a);


//        for (i = 1; i <=10; i++) {
//            for (int j = 1; j <= i; j++)
//                System.out.print(j);
//            System.out.println();
//        }

//        //romb
//        int x = 5;
//        for (i = 0; i < x; i++){
//            for (int j = 0; j < i;  j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (i = x ; i > 0; i--){
//            for (int j = i; j < x;  j++)
//                System.out.print(" ");
//            for (int j = i; j > 0; j--)
//                System.out.print("*");
//            System.out.println();
//        }


//        int t[]; //deklaracja
//        t = new int[10];
//        t[2] = 3;
//        for( i = 0; i <10; i++)
//            System.out.println(t[i]);
//
//
//
//        //foricz - do iteracji tablic
//        for(int   z: t)
//            System.out.println(z);

        //zaj 2 ................
//        int[] i = new int[5];
//        int[] tab = {1,2,3,4}; //tworzeenie tab
//
//        int a = 2;
//        f(a, tab);
//        System.out.println(a);
//        for (int x : tab) System.out.println(x);

//        int[] x= f();
//        for(int xx: x) System.out.println(xx);
//        for(int xx: f()) System.out.println(xx);


//        System.out.println(najmniejszy_z_3(11,-2,3));
//          trojkat_z_liczb(5);
        trojkat_z_liczb_pokolei(5);
        int[] y = {1,2,3};
//        System.out.println(suma_z_tab(y));
        System.out.println(czy_jest_watrosc_w_tab(y,4));

    }

    ///zaj 2 .........................
    ///metody
    static int f(int pa, int[] ti){
        System.out.println(ti[pa]);
        //static gdy nie jest twrzona/powiazana z obiekrtem
        pa = 4;
        for(int i = 0; i<ti.length; i++) ti[i] = 21;
        return 21;
    }

    static int f(int x){
//        if(x>0) return 1;
//        if(x<0) return 2;
//        //if(x>0) return 3;
//        return  3;

        ////vs
        if (x>0) return 1;
        else if (x<0) return 2;
        else return 3;
        /////^to bd działac

    }

    static int[] f(){
        int[] i = {1,2};
        return  i;
    }

    static int najmniejszy_z_3(int a, int b, int c){
//        a = min
        if (a > b) a = b;
        if (a > c) a = c;
        return a;
    }

    static void trojkat_z_liczb(int x){
        for(int i = 0; i <= x; i++) {
            for( int j = 0; j < i; j++)
                System.out.print(i);
            System.out.println();
        }
    }

    static void trojkat_z_liczb_pokolei(int x){
        int y = 0;
        for(int i = 1; i <= x; i++) {
            for( int j = 1; j <= i; j++){
                y++;

                System.out.print(y + " ");
            }
            System.out.println();

            /*
            1
            23
            456

             */
        }
    }

    static  int suma_z_tab(int[] tab){
        int suma = 0;
        for( int x : tab) suma += x;
        return suma;

    }

    static boolean czy_jest_watrosc_w_tab(int[] tab, int x){
        for(int i : tab) if (i == x) return true;
        return false;
    }

}

