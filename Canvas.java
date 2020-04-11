import java.util.ArrayList;
import java.util.List;

public class Canvas {
    List<Point> list=new ArrayList<Point>();

    public boolean add(Point p){
        if(p==0 || list.contains(p)){
            return false
        }
        list.add(p);
        return true;
    }

    public void printPoints(){
        for(Point p:list){
            System.out.println("Id:"p.getId()", X:"p.getX()", Y:"p.getY() );
        }
    }
}