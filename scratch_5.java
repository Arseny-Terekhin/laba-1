import  java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("номер 1");
        int n = in.nextInt();
        float s = 0;
        for (float i = 0; i <= n; i++){
            s += Math.pow(-1.0, i) * (1.0 / Math.pow(2.0, i));
        }
        System.out.println(s);
        System.out.println("номер 21 ");
        n = in.nextInt();
        float y = 1;
        for(float j = 0; j <=  n; j++ ){
            y *= (2 * j);
        }
        System.out.println(y);
    }
}