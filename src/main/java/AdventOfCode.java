import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdventOfCode {

    public static void main(String[] args) {

        //Day 1
        ArrayList<Integer> listDay1 = new ArrayList<>();

        try {
            Scanner s = new Scanner(new File("input.txt"));
            while (s.hasNext()) {
                listDay1.add(s.nextInt());
                s.nextLine();
            }
            s.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        AdventOfCodeDay1 aocDay1Pt1 = new AdventOfCodeDay1();
        aocDay1Pt1.calcDepthPt1(listDay1);
        System.out.println("Day 1 Part 1: " + aocDay1Pt1.getIncrease());
        AdventOfCodeDay1 aocDay1Pt2 = new AdventOfCodeDay1();
        aocDay1Pt2.calcDepthPt2(listDay1);
        System.out.println("Day 1 Part 2: " + aocDay1Pt2.getIncrease());

        //Day 2
        AdventOfCodeDay2 aocDay2Pt1 = new AdventOfCodeDay2();
        AdventOfCodeDay2 aocDay2Pt2 = new AdventOfCodeDay2();
        ArrayList<String> listDay2 = new ArrayList<>();

        try {
            Scanner s = new Scanner(new File("input2.txt"));
            while (s.hasNext()) {
                listDay2.add(s.nextLine());
            }
            s.close();
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        for(int i = 0; i < listDay2.size(); i++) {
            aocDay2Pt1.movePt1(listDay2.get(i));
            aocDay2Pt2.movePt2(listDay2.get(i));
        }

        System.out.println("Day 2 Part 1: " + aocDay2Pt1.multiplyDH());
        System.out.println("Day 2 Part 2: " + aocDay2Pt2.multiplyDH());
    }
}
