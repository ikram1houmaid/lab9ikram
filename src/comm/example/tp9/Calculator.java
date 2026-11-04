package comm.example.tp9;

public class Calculator {

    // Méthode pour effectuer une addition
    public double add(double a, double b) {
        return a + b;
    }

    // Méthode pour effectuer une division
    public double divide(double a, double b) {

        if (b == 0.0) {
            throw new IllegalArgumentException(
                "Division par zéro interdite."
            );
        }

        return a / b;
    }
}