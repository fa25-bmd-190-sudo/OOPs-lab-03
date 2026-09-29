public class circle {
    double radius;
    circle(){
        radius=1;
    }
    circle(double r,double dummy){
        radius=r;
    }
    double calculateCircumference(){
        return 2*Math.PI*radius;
    }
    public static void main(String[]args){
        circle c1=new circle();
        System.out.println("Circumference:"+c1.calculateCircumference());
        circle c2=new circle(3,2);
        System.out.println("circumference:"+c2.calculateCircumference());
    }
}
