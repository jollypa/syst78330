
//PARUL JOLLY

public class Student {
    private String name;// default null
    private int id;//default  0
    private int mark;
 //
    
 public Student()
 {       //constructor
 }
     
 public Student(int id, String name, int marks)
 {       //constructor
    this.id=id;
    this.name=name;
    this.mark=marks;
 }
    // getter and setter 
    public int getId(){
        return id;}
    public void setId(int id){
       this.id=id;}
  
    public String getName(){
        return name;}
    public void setName(String name){
        this.name=name;}

    public int getMark(){
        return mark;}
    public void setMark(int mark){
       this.mark=mark;}

  
    public String toString(){
        String out="\n-----------------------\n";
        out += "Id: " + id + "\n";
        out += "Name: " + getName() + "\n";
        out += "Marks: " + mark + "\n";
        out +="\n-----------------------\n";
        return out;
    }
}


    

