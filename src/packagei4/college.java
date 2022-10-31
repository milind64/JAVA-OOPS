package packagei4;
import packagei3.*;

public class college {
    public int cid;
    public String cname;
    public String cplace;

    public void cinsert(int sid,String sname,String splace){
        cid = sid;
        cname = sname;
        cplace = splace;
    }

    public void cdisplay(){
        System.out.println(cid);
        System.out.println(cname);
        System.out.println(cplace);
    }
}
