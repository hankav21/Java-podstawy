package protect;

class st2 <T> {
    T t;
    T[] array;
    T getT(){return t;}
}

class st{

    static <T> boolean contains(T[] x, T y) {
        boolean result = false;
        for (int i = 0; i < x.length; i++) {
            if (x[i].equals(y)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] t;
        t = new Integer[2];
        t[0] = 0;
        t[1] = 1;

        System.out.println(contains(t, 10));
    }


}
