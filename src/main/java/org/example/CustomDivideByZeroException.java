package org.example;

/**
 * Custom exception for dividing by zero.
 */
public class CustomDivideByZeroException extends Exception {
    /**
     * The numerator of the failed division operation.
     */
    private double a;

    /**
     * The denominator of the failed division operation.
     */
    private double b;

    /**
     * Get the numerator of the failed division operation.
     *
     * @return The numerator of the failed division operation.
     */
    public double getA() {
        return a;
    }

    /**
     * Get the denominator of the failed division operation.
     *
     * @return The denominator of the failed division operation.
     */
    public double getB() {
        return b;
    }

    /**
     * Constructor for the CustomDivideByZeroException.
     * Accepts and stores the numerator and denominator values.
     *
     * @param a The numerator of the failed division operation.
     * @param b The denominator of the failed division operation.
     */
    public CustomDivideByZeroException(double a, double b) {
        // this calls the base class and passes a clear message with the actual numbers
        super("Attempted to divide " + a + " by " + b + " (Division by Zero Error)");
        // this saves both values so I can use them later if needed
        this.a = a;
        this.b = b;
    }
}
