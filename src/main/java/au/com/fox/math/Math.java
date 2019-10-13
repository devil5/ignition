package au.com.fox.math;

public class Math {
    public int fabonacci(int position) {

        // If someone gets adventurous
        if (position <= 0) {
            return 0;
        }

        // Regular cases >= 1
        return (position <= 2) ? 1 : fabonacci(position - 1) + fabonacci(position - 2);
    }
}
