public class AdventOfCodeDay2 {

    private int depth;
    private int horizontal;
    private int aim;


     public AdventOfCodeDay2() {
        this.depth = 0;
        this.horizontal = 0;
        this.aim = 0;
    }

    public void movePt1(String command) {

         String direction = command.split(" ")[0];
         int units = Integer.parseInt(command.split(" ")[1]);

        switch(direction) {
            case "forward":
                //forward X increases the horizontal position by X units.
                //forward X does two things:
                //  It increases your horizontal position by X units.
                //  It increases your depth by your aim multiplied by X.
                this.horizontal += units;
                //this.depth += (this.aim * units);
                break;
            case "up":
                //up X decreases the depth by X units.
                //up X decreases your aim by X units.
                this.depth -= units;
                //this.aim -= units;
                break;
            case "down":
                this.depth += units;
                //this.aim += units;
                break;
            default: break;
        }
    }

    public void movePt2(String command) {

        String direction = command.split(" ")[0];
        int units = Integer.parseInt(command.split(" ")[1]);

        switch(direction) {
            case "forward":
                //forward X increases the horizontal position by X units.
                //forward X does two things:
                //  It increases your horizontal position by X units.
                //  It increases your depth by your aim multiplied by X.
                this.horizontal += units;
                this.depth += (this.aim * units);
                break;
            case "up":
                //up X decreases the depth by X units.
                //up X decreases your aim by X units.
                //this.depth -= units;
                this.aim -= units;
                break;
            case "down":
                //this.depth += units;
                this.aim += units;
                break;
            default: break;
        }
    }

    public int getDepth() {
        return this.depth;
    }

    public int getHorizontal() {
        return this.horizontal;
    }

    public int getAim() {
        return this.aim;
    }

    public int multiplyDH() {

        int math = this.horizontal * this.depth;

         return math;
    }


}
