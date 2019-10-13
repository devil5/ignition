package au.com.fox.math;

public class Math {
    public int fibonacci(int position) {

        // If someone gets adventurous
        if (position <= 0) {
            return 0;
        }

        // Regular cases >= 1
        return (position <= 2) ? 1 : fibonacci(position - 1) + fibonacci(position - 2);
    }
}
