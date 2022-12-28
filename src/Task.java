import java.util.Objects;

public class Task {
    private int firstData;
    private char operator;
    private int secondData;


    public Task(int firstData, char operator ,int secondData) {
        this.firstData = firstData;
        this.operator = operator;
        this.secondData = secondData;
    }

    public int getFirstData() {
        return firstData;
    }

    public void setFirstData(int firstData) {
        this.firstData = firstData;
    }

    public int getSecondData() {
        return secondData;
    }

    public void setSecondData(int secondData) {
        this.secondData = secondData;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return getFirstData() == task.getFirstData() && getOperator() == task.getOperator() && getSecondData() == task.getSecondData();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstData(), getOperator(), getSecondData());
    }

    @Override
    public String toString() {
        return "Task{" +
                "firstData=" + firstData +
                ", operator=" + operator +
                ", secondData=" + secondData +
                '}';
    }
}
