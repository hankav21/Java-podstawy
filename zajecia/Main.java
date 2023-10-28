import java.time.*;
public class Main {
    public static void main(String[] args) {

        Trojkat tr= new Trojkat(3,4,5);
        System.out.println("obwod: " +tr.getPerim());
        System.out.println(("prostokatny: " + tr.isReactang()));

        Person os = new Person("Grzergorz", "male", 2021, 121.31);
        System.out.println(os.getAge());
        System.out.println(os.isFemale());

        queue queue = new queue(5);
        stack stack = new stack(6);


        System.out.println("queue max: "+ queue.max + " now: "+ queue.now);

        for (int i = 0; i < 7; i++){
            queue.push(i);
            stack.push(i);
        }

        for (int i = 0; i< 4; i++){
            System.out.println("queue: " + queue.pop());
        }

        for (int i = 0; i< 4; i++){
            System.out.println("stack: " + stack.pop());
        }



        stackTr stk_tr = new stackTr(3);
        Trojkat trojkat = new Trojkat( 1,1,1);
        stk_tr.push(trojkat);
        stk_tr.push(new Trojkat(2,2,2));
        stk_tr.push(new Trojkat(3,3,3));
        }
    }
