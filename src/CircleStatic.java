
public class CircleStatic {
   
    double radius;
    private static int nbrOfCircle=0;

    public CircleStatic(){
        ++nbrOfCircle;
    }
    public CircleStatic(double radius){
        this.radius=radius;
        ++nbrOfCircle;
    }
    

    
}

    

