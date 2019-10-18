public class Fourth {
    public static void main(String[] args)  {
        int a = 0, b = 1, c = 1, total = 0;
        while(c < 1000) {
            b = 1;
            while(b < c)    {
                a = 1;
                while(a < b)    {
                    if(Math.pow(c , 2) == Math.pow(a, 2) + Math.pow(b, 2) && a + b + c == 1000)  {
                        total = a * b * c;
                        System.out.print(total);
                    }
                    a++;
                }
                /*
                a = 1000 - b - c;
                if(a > 0 && a < b)   {
                    if(Math.pow(c , 2) == Math.pow(a, 2) + Math.pow(b, 2))  {
                        total = a * b * c;
                        System.out.print(total);
                    }
                }
                */
                b++;
            }
            c++;
        }
    }
}