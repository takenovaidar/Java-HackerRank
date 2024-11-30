package packagetwo;

public class array4 {
    public static void main(String[] args) {
        int[] numbers = {7,4,5,6,8,7,98,3};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++)
        {
            if (max < numbers[i])
            {
                max = numbers[i];
            }
        }
        System.out.println("maximum: " + max);

        for(int i = 0; i < numbers.length; i++)
        {
            if (min > numbers[i])
            {
                min = numbers[i];
            }
        }
        System.out.println("minimum: " + min);
    }
}
