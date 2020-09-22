package lesson11;

public class MultiplierImpl implements Multiplier {
    Double base;
    public MultiplierImpl(Double base) {
        this.base =base;
    }

    @Override
    public Double apply(String a, Double b) {
        return  base + Double.valueOf(a) + b;
    }
}
