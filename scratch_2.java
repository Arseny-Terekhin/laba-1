import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt(), a = 1;
        for(int i = 0;i < y; i++){
            a *= x;
        }
        String str = Integer.toString(a);
        String s = str.substring(str.length() - 1, str.length());
        System.out.println(s);

        
    }
}