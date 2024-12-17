class Shape{
    public void draw(){
        System.out.println("drawing a shape");}
    public void erase(){
        System.out.println("erasing a shape");}}
class Circle extends Shape{
    public void draw(){
            System.out.println("drawing a circle");}
    public void erase(){
            System.out.println("erasing a circle");}}
    
class Triangle extends Shape{
    public void draw(){
        System.out.println("drawing a triangle");}
    public void erase(){
            System.out.println("erasing a triangle");}}
class Square extends Shape{
    public void draw(){
        System.out.println("drawing a square");}
    public void erase(){
            System.out.println("erasing a square");}}
public class M4{
    public static void main(String[] args){
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle();
        shapes[1]=new Triangle();
        shapes[2]=new Square();
        for(int i=0;i<shapes.length;i++){
            shapes[i].draw();
            shapes[i].erase();
            System.out.println("___________");
        }
        
        
        
        
        
    }
}

        


    
 