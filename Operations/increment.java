package Operations;

public class increment {
    public static void main(String[] args) {
      System.out.println(
        "Incrementing an integer:");
        int x = 5;
        System.out.println(
            "Initial value of x: " + ++x);
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(--x);
        System.out.println(x);
        System.out.println(x--);
        System.out.println(x);
        int y = 10;
        System.out.println(
            "Combined Operation: "+ (x + y));
        System.out.println(++x + y);//6+10=16
        System.out.println(x + ++y);//6+11=17
        System.out.println(x++ + y++);//6+11=17
        System.out.println(x + y);//7+12=19
        System.out.println(--x + y);//6+12=18
        System.out.println(x + y--);//6+12=18
        System.out.println(--x + ++y);//5+12=17
        System.out.println(--y + x);//11+5=16
        System.out.println(x + ++y);//5+12=17
        System.out.println(x-- - y);//5-12=-7
        System.out.println(--y + y);//11+11=22
        System.out.println(y - ++y);//11-12
        System.out.println(--x - --y);//4-4
        System.out.println(x);//3
        System.out.println(y);//11
        System.out.println(x + ++y);//3+12
        System.out.println(y/x);
        System.out.println(x);

    }
}
