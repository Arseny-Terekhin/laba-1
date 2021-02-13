import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("введите количество страниц");
       int m = in.nextInt();
       System.out.println("введите количество строк на одной странице");
       int k = in.nextInt();
       System.out.println("введите номер строки ");
       int n = in.nextInt();
       int stran = 0;
       while (n > (m * k)){
           System.out.println("введите другой номер строки, потому что данного номера строки нет в книге");
           n = in.nextInt();
       }
       if((n % k) == 0);{
           stran = n / k;
       }
       if((n % k) > 0 ){
           stran = n / k + 1;
       }
       System.out.println("данная строка находится на " + stran + " странице");


    }
}