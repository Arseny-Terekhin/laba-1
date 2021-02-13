import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите числа a b c");
        String a = in.nextLine(), b = in.nextLine(), c = in.nextLine();
        String s = " ";
        for (int i = 0; i < a.length(); i++){
            boolean k = false;
            String num1 = a.substring(i, i + 1);
            for (int j = 0; j < b.length(); j++){
                String num2 = b.substring(j, j + 1);
                if(num2.equals(num1)){
                    k = true;
                }
            }
            if (k){
                k = false;
                for (int h = 0; h < c.length(); h++){
                    String num3 = c.substring(h, h + 1);
                    if(num3.equals(num1)){
                        k = true;
                    }
                }
            }
            if (k){
                for(int pr = 0; pr < s.length(); pr++ ){
                    String num4 = s.substring(pr, pr + 1);
                    if (num4.equals(num1))
                        continue;
                    else
                        s += num1;

                }

            }
        }
        System.out.println("вв всех числах есть цифра" + s);

        
    }
}