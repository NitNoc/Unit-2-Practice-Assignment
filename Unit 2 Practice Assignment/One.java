public class One    {
    public static void main(String[] args)  {
        int total = 0;
        for(int n = 0; n < 1000; n++)  {
            if(n % 3 == 0 || n % 5 == 0)  {
                total = n + total;
                //System.out.println(n);
            }
        }
        System.out.print(total);
    }
}