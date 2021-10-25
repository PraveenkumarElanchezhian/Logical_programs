package unit_testing;

public class Sqrt {
	public static void main(String[] args) {
        double c = 12.56;
        double epsilon = 1e-15;    
        double t = c;              

        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

        System.out.println(t);
    }
}
