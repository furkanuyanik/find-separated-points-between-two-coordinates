package twopointbetweenpointlist;

import java.util.ArrayList;

public class Main {
    private static ArrayList<PointList> findPointList(double x1, double y1, double x2, double y2, int seperation, int piece){
        double t = 1.0 / ((piece + 1) / seperation);
        
        ArrayList<PointList> temp = new ArrayList<PointList>();
        for (double i = t; i < 1; i=i+t) {
            double x = x1 + (x2 - x1) * i;
            double y = y1 + (y2 - y1) * i;
            temp.add(new PointList(x, y));
        }
        
        return temp;
    }
    
    public static void main(String[] args) {
        ArrayList<PointList> pointList = findPointList(0, 3, 8, 0, 2, 6);
        for (int i = 0; i < pointList.size(); i++) {
            System.out.println(pointList.get(i).getX() + ", " + pointList.get(i).getY());
        }
    }
}
