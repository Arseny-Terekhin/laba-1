import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите n и x");
        float n = in.nextFloat(), x = in.nextFloat(), s = 0;
        for(float i = 0; i <= n; i++){
            s += 1.0 / ((2.0 * n + 1.0) * Math.pow(x,(2.0 * n + 1.0) ));

        }
        s *= 2;
        System.out.println(s);
        
    }
}