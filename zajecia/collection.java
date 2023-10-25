class collection {
    int[] array;
    int max, now;

    Trojkat[] arr_tr;
}

interface pushpop {
    int pop();
    Trojkat pop_tr();
    void push(int item);
}

class stack extends collection implements pushpop {
    public int pop(){
        int x = super.array[super.now];
        super.array[super.now] = 0;
        super.now--;
        return x;
    }
    public void push(int item) {
        if (super.max-1 > super.now){
            super.now++;
            super.array[now] = item;
            System.out.println("stack: " + item);
        } else System.out.println("full");
    }

    public stack(int max) {
        super.max = max;
        super.now = 0;
        array = new int[max];
    }

    //.......trojkaty..........
    public void push(Trojkat item) {
        if (super.max-1 > super.now){
            super.now++;
            super.arr_tr[now] = item;
            System.out.println("stack: " + item);
        } else System.out.println("full");
    }

}

class queue extends collection implements pushpop {
    public int pop(){
        int x = super.array[super.max - super.now];
        super.array[super.max - super.now] = 0;
        super.now--;
        return x;
    }
    public void push(int item) {
        if (super.max -1 > super.now){
            super.now++;
            super.array[now] = item;
            System.out.println("queue: " + item);
        } else System.out.println("full");
    }
    public queue(int max) {
        super.max = max;
        super.now = 0;
        super.array = new int[max];
    }

}

class stackTr extends collection implements pushpop {
    public Trojkat pop(){
        Trojkat x = super.arr_tr[super.now];
        super.now--;
        return x;
    }

    public stackTr(int max) {
        super.max = max;
        super.now = 0;
        arr_tr = new Trojkat[max];
    }

    //.......trojkaty..........
    public void push(Trojkat item) {
        if (super.max-1 > super.now){
            super.now++;
            super.arr_tr[now] = item;
            System.out.println("stack: " + item);
        } else System.out.println("full");
    }

}



//class stack extends collection implements  pushpop
//class queue extends collection implements  pushpop
//
//queue queue = new queue(5);
//stack stack = new stack(6);
//
//for (int i = 0, i< 7; i++){
//    gueue.push(i);
//    stack.push(i);
//        }
//
//
//        for (int i = 0, i< 4; i++){
//        print(queue.pop())
//        }
//
//        for (int i = 0, i< 4; i++){
//        print(stack.pop())
//        }
//        //full
//q: 0
//1
//2
//3
//stack: 5
//4
//3
//2