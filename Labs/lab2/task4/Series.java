package task4;

public class Series extends Circuit {
    private Circuit a;
    private Circuit b;

    public Series(Circuit a, Circuit b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getResistance() {
        return a.getResistance() + b.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        return a.getPotentialDiff() + b.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        a.applyPotentialDiff(V * (a.getResistance() / getResistance()));
        b.applyPotentialDiff(V * (b.getResistance() / getResistance()));
    }

    
    
    public String toString() {
        return super.toString() + " Series[Circuit A: " + a.toString() + 
                ", Circuit B: " + b.toString() + "]";
    }
}
