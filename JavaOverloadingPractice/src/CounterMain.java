public class CounterMain {

    public static void main(String[] args) throws Exception {

        // Constructor that constructs counter with "startValue"
        Counter counterOne = new Counter(10);
        System.out.println("----Counter: " + counterOne.value());

        // Constructor that construct counter
        Counter counterTwo = new Counter();
        System.out.println("----Counter: " + counterTwo.value());

        // counterOne methods
        System.out.println("----counterOne----");
        System.out.println(counterOne);

        counterOne.increase();
        System.out.println(counterOne);

        counterOne.decrease();
        System.out.println(counterOne);

        counterOne.increase(25);
        System.out.println(counterOne);

        counterOne.increase(-25);
        System.out.println(counterOne);

        counterOne.decrease(10);
        System.out.println(counterOne);

        counterOne.decrease(-10);
        System.out.println(counterOne);

        // counterTwo Methods
        System.out.println("----counterTwo----");
        System.out.println(counterTwo);

        counterTwo.increase();
        System.out.println(counterTwo);

        counterTwo.decrease();
        System.out.println(counterTwo);

        counterTwo.increase(50);
        System.out.println(counterTwo);

        counterTwo.increase(-50);
        System.out.println(counterTwo);

        counterTwo.decrease(10);
        System.out.println(counterTwo);

        counterTwo.decrease(-10);
        System.out.println(counterTwo);
    }
}