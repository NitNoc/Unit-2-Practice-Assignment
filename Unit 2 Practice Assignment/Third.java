public class Third  {
    public static void main(String[] args) {
        double total = 0, x = 1, y = 0;
        int i = 1;
        double sumx = 0, sumy = 0;
        while(x <= 100)  {
            sumx = Math.pow(x, 2) + sumx;
            x++;
        }
        while(i <= 100)  {
            sumy = i + sumy;
            i++;
        }
        total = Math.pow(sumy, 2);
        total = total - sumx;
        System.out.print((int) total);
    }
}