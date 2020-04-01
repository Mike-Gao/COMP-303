import java.util.ArrayList;
public class Inventory {
    ArrayList<Object> anotherList;
    public Inventory(){
        anotherList = new ArrayList<>();
    }
    public void add(Object o){
        anotherList.add(o);
    }

    int getCount(){
        return anotherList.size();
    }
}
