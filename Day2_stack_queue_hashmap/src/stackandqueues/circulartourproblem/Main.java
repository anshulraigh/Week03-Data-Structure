package stackandqueues.circulartourproblem;

public class Main {
    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(4, 6),
                new PetrolPump(6, 5),
                new PetrolPump(7, 3),
                new PetrolPump(4, 5)
        };

        int startPoint = CircularTourSolver.findStartingPoint(pumps);

        if (startPoint == -1) {
            System.out.println("No solution exists for the circular tour.");
        } else {
            System.out.println("Start the tour at petrol pump index: " + startPoint);
        }
    }
}
