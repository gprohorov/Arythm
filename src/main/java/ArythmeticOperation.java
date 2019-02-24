/**
 * Created by george on 17.02.19.
 */
public class ArythmeticOperation {
    private int first;
    private int second;

    public ArythmeticOperation(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public ArythmeticOperation() {
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int plus(){
        return this.first + this.second;
    }




}
