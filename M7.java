class Outer{
    void display(){
        System.out.println("Outer class display method:");}
    class Inner{
        void display(){
           System.out.println("Inner class display method:");} 
        }
    }
public class M7 {
    public static void main(String[] args){
        String title0="Lab 8 progarm-Nested class";
        String title1="Develop a java program to create an outer class with a function display.";
        String title2="Create another class inside the outer class named inner with a function called display";
        String title3="Call the two function in ythe main class";
        System.out.println(title0+"\n"+title1+"\n"+title2+"\n"+title3+"\n");
        Outer o1=new Outer();
        o1.display();
        Outer.Inner i1=o1.new Inner();
        i1.display();
    
    }
    
}
