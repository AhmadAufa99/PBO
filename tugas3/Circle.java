package tugas3;

public class Circle implements GeometricObject {
private double radius;

public Circle(double radius){
    this.radius=radius;
}
@Override
public double getArea(){
   return Math.PI * radius * radius;  
}
@Override
public double getPerimeter(){
    return 2 * Math.PI * radius;
}
@Override
public String toString()
{
    return "\nRadius lingkaran = "+this.radius+
           "\nLuas = "+this.getArea()+
           "\nkeliling = "+this.getPerimeter();
}
}
