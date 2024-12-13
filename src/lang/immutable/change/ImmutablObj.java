package lang.immutable.change;

public class ImmutablObj {

    private final int value;

    public ImmutablObj(int value) {
        this.value = value;
    }

    public ImmutablObj add(int addValue) {
        int result = value + addValue;
        return new ImmutablObj(result);
    }

    public int getValue() {
        return value;
    }
}
