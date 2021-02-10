import java.util.Scanner;
class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine(), nol = "0", ed = "1";
        int len = stroka.length(), max = 0, a = 0;
        for (int i = 0; i < len; i++){
            String simvol = stroka.substring(i, i + 1);
            if (simvol.equals(ed)){
                continue;
            }
            if (simvol .equals(nol)){
                int x = 0;
                String proverka= stroka.substring(i + 1, len);
                for (int j = 0; j < proverka.length(); j++){
                    String simvolp = proverka.substring(j, j + 1);
                    if(simvolp.equals(ed)){
                        break;
                    }
                    if(simvolp.equals(nol)){
                        x++;
                    }
                    i += x;
                }
                if(max < x + 1){
                    max= x + 1;
                }
            }
        }
        System.out.println(max);


        
    }
}