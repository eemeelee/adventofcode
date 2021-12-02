import java.util.ArrayList;

public class AdventOfCodeDay1 {

    private int increase;
    private int decrease;
    private int noChange;


    public AdventOfCodeDay1() {
        this.increase = 0;
        this.decrease = 0;
        this.noChange = 0;
    }

    public void calcDepthPt1(ArrayList<Integer> list) {

        for(int i=1; i < list.size(); i++) {
            if(list.get(i) > list.get(i-1)) {
                this.increase += 1;
            } else if (list.get(i) < list.get(i-1)) {
                this.decrease += 1;
            } else {
                this.noChange += 1;
            }
        }
    }

    public void calcDepthPt2(ArrayList<Integer> list) {

        for(int i=0; i < list.size() - 3; i++) {

            int setA = list.get(i) + list.get(i+1) + +list.get(i+2);
            int setB = list.get(i+1) + list.get(i+2) + +list.get(i+3);

            if(setB > setA) {
                this.increase += 1;
            } else if (setB < setA) {
                this.decrease += 1;
            } else {
                this.noChange += 1;
            }
        }
    }

    public int getIncrease() {
        return this.increase;
    }

    public int getDecrease() {
        return this.decrease;
    }

    public int getNoChange() {
        return this.noChange;
    }

}
