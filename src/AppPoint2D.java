
public class AppPoint2D {
   
    double x;
    double y;
    public AppPoint2D(){};
    public AppPoint2D(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double distance(AppPoint2D p){
        return Math.sqrt(Math.pow(x-p.x,2) +Math.pow(y-p.y,2));
        
    }
    }

    

