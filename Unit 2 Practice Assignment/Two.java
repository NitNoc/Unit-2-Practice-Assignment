public class Two    {
    public static void main(String[] args) {
        int first = 1, second = 2, third = 0, total = 0;
        while (first <= 4000000) {
            third = first + second;
            first = second;
            second = third;
            if(first % 2 == 0)  {
                total = total + first;
            }
        }
        System.out.print(total);
    }
}