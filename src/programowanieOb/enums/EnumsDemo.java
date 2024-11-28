package programowanieOb.enums;

import javax.swing.*;

public class EnumsDemo {
    public static void main(String[] args) {
        RoadSign roadSign = new RoadSign(Side.NORTH);
        RoadSign roadSign2 = new RoadSign(Side.SOUTH);
        RoadSign roadSign3 = new RoadSign(Side.NORTH);

        System.out.println(roadSign.getDegrees());

        System.out.println(roadSign.isDirectedIn(roadSign3.getDirection()));

      //  Side side = new Side();


        Side side = Side.WEST;
        Side side1 = Side.NORTH;
        Side side2 = Side.EAST;
        Side side3 = Side.SOUTH;

        System.out.println("West: " + side.getDegree());

        switch (side){
            case EAST:
                System.out.println("wsch");
                break;
            case WEST:
                System.out.println("zach");
                break;
            case NORTH:
                System.out.println("plnoc");
                break;
            case SOUTH:
                System.out.println("pol");
                break;
        }

       Side[] sides = Side.values();
        for (Side aSide : sides) {
            System.out.println(aSide);
        }

       ////MySQL -> Workbench




//
//        JFrame frame = new JFrame();
//        frame.setVisible(true);
//        frame.setSize(800,800);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
