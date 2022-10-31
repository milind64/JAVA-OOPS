package packagei4;
import packagei3.*;

public class hostel extends student{
    public int id;
    public String name;

    public void hinsert(String hname,int hid){
        name = hname;
        id = hid;
    }
    public void hdisplay()
    {
        System.out.println(name);
        System.out.println(id);
    }

}
