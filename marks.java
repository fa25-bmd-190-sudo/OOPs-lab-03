public class marks {
    int mark1;
    int mark2;
    int mark3;
    marks(){
        mark1=0;
        mark2=0;
        mark3=0;
    }
    marks(int m1,int m2,int m3){
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }
    int calculateSum(){
        return mark1+mark2+mark3;
    }
    public static void main(String[] args){
        marks m1=new marks();
        System.out.println("sum of marks="+m1.calculateSum());
        marks m2=new marks(5,7,9);
        System.out.println("sum of marks="+m2.calculateSum());
    }
}
