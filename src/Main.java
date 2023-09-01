public class Main {//hw4
    public static void main(String[] args)
    {
        int n = 6381;
        boolean is_divisible= false;
        while (!is_divisible) {
            if (n % 387 == 0 && n % 6381 == 0)
                is_divisible = true;
            else {
                is_divisible = false;
                n++;
            }

        }
        System.out.println(n);

    }
}