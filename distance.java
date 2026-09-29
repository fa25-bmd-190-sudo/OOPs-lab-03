public class distance {
    int feet;
    int inch;
    distance(){
        feet=0;
        inch=0;
    }
    distance(int f,int i){
        feet=f;
        inch=i;
    }
    void display(){
        System.out.println("Feet="+feet);
        System.out.println("inches="+inch);
    }
    public static void main(String[] args){
        distance d1=new distance();
        d1.display();
        distance d2=new distance(2,5);
        d2.display();
    }
}
