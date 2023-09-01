public class Main {
    public static void main(String[] args) {
        int a= 17;
        boolean is_prime = true;
        if (a%2==0||a%3==0||a%5==0||a%7==0)
            is_prime=false;
        System.out.println(is_prime);

    }
}