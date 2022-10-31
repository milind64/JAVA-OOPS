import packagei4.*;
import packagei3.*;
public class main {

    public static void main(String args[])
    {
        hostel h1 = new hostel();

        h1.cinsert(1,"IIIT","Dharwad");
        h1.sinsert("Milind",1234,"DSIS");
        h1.hinsert("abcd",12);
        h1.cdisplay();
        h1.sdisplay();
        h1.hdisplay();
    }
}
