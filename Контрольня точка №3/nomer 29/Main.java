import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner as = new Scanner(System.in);
        String gg1 = as.nextLine();
        int gg1_int = Integer.parseInt(gg1.trim());
        int gg2 = as.nextInt() - 1;
        int s = 0;
        String[] ggs = gg1.split("");
        for(int i = 0; i < ggs.length; i++){
            gg2++;
            int n = Integer.parseInt(ggs[i].trim ());
            s += Math.pow(n,gg2);
        }
        if(s % gg1_int == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}