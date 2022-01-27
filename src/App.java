
public class App {
        public static void main(String[] args) throws Exception {
           
            AppPoint2D A=new AppPoint2D(3,2);
            AppPoint2D B=new AppPoint2D(4,1);
            System.out.println(A.x+ " "+ A.y);

           double d =  A.distance(B);
           System.out.println("distance is "+ d);
         }
}
    

