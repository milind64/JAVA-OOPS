package packagei3;
import packagei4.*;

public class student extends college{

    public String name;
    public int id;
    public String dept;

    public void sinsert(String sname,int sid,String sdept){
        name = sname;
        id = sid;
        dept = sdept;
    }
    public void sdisplay()
    {
        System.out.println(name);
        System.out.println(id);
        System.out.println(dept);

    }

}
