public class TestTime {
    public static void main(String[] args) {

        // Creating 2 new times
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // adding second
        t1.nextSecond();

        // Decrease second
        t2.previousSecond();

        // Displaying the times afte adding and decreasing a second
        System.out.println("t1 time after running nextSecond is " + t1.toString());
        System.out.println("t2 time after running previousSecond is " + t2.toString());
    }
}
