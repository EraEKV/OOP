package task4;

public class Parallel extends Circuit {
    private Circuit a;
    private Circuit b;

    public Parallel(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResistance() {
        double rA = a.getResistance();
        double rB = b.getResistance();
        return (rA * rB) / (rA + rB); // Formula for resistors in parallel
    }

    @Override
    public double getPotentialDiff() {
        return a.getPotentialDiff(); // Potential difference is the same
    }

    @Override
    public void applyPotentialDiff(double V) {
        a.applyPotentialDiff(V);
        b.applyPotentialDiff(V);
    }

    
    
    
    public String toString() {
        return super.toString() + " Parallel[Circuit A: " + a.toString() + 
                ", Circuit B: " + b.toString() + "]";
    }
}
