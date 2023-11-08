public class zaj3 {
    public static void main(String[] args) {

        int[] tab = {1,2,3, -4, 99};
        int[] wyn = ile_parzystych_i_nieparzystych(tab);
        System.out.println("parzystych: " + wyn[0] + " nieparzystych: " + wyn[1]);
    }

    static int[] ile_parzystych_i_nieparzystych(int[] l){

        int parz = 0, nparz = 0;
        for(int i: l){
            if (i%2 == 0) parz++;
            else nparz++;
        }

        return new int[]{parz, nparz};
    }
}
