public class time {
    int hour;
    int min;
    int sec;
    time(){
        hour=0;
        min=0;
        sec=0;
    }
    time(int h,int m,int s){
        hour=h;
        min=m;
        sec=s;
    }
    void display(){
        System.out.println("hours="+hour+":min="+min+":sec="+sec);
    }
    public static void main(String[] args){
        time t1=new time();
        t1.display();
        time t2=new time(4,55,14);
        t2.display();
        time t3=new time(3,41,30);
        t3.display();
    }
}
