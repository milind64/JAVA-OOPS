package packagei3;
import packagei4.*;

public class faculty extends college{
    public String desg;
    public String name;
    private String dept;

    public void insert(String fdesg,String fname,String fdept){
        desg = fdesg;
        name = fname;
        dept = fdept;
    }
    public void insert(String fdesg,String fname){
        desg = fdesg;
        name = fname;
    }
    public void display(){
        System.out.println(desg);
        System.out.println(name);
        System.out.println(dept);
    }

}
