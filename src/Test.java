public class Test {
    private int i;
    private int j;
    private int k;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        if (i != test.i) return false;
        if (j != test.j) return false;
        if (k != test.k) return false;
        return hashCode == test.hashCode;
    }

    @Override
    public int hashCode() {
        int result = i;
        result = 31 * result + j;
        result = 31 * result + k;
        result = 31 * result + hashCode;
        return result;
    }

