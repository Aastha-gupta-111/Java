class pdemo {
    int a, b;
    int res;
    void sum(){
        res = a+b;
        System.out.println("sum="+res);
    }
}
public class cdemo extends pdemo{
    int c, d;
    int resc;
    cdemo(){
        c = 9;
        d= 5;
    }
    void sub(){
        resc = c-d;
        System.out.println("sub ="+ resc);
        }

public static void main(String s[]){
    cdemo cobj = new cdemo();
    cobj.sub();
}
}

