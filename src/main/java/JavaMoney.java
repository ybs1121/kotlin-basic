import java.util.Objects;

public class JavaMoney implements Comparable<JavaMoney> {
    private int amount;

    public JavaMoney(int amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(JavaMoney other) {
        return Integer.compare(this.amount, other.amount);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaMoney javaMoney = (JavaMoney) o;
        return amount == javaMoney.amount;
    }

    public JavaMoney plus(JavaMoney other) {
        return new JavaMoney(amount + other.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(amount);
    }
}