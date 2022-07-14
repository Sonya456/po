package pl.edu.pg.eti.ksg.po.lab1.transformacje;
public class Punkt {
 /*
 * Słowo kluczowe final oznacza, że po pierwszym przypisaniu
 * zawartość pól x oraz y nie może zostać zmieniona
 * w tym miejscu jest to odpowiednik słowa kluczowego const
 * z języka C++.
 */
 private final double x,y;
 public Punkt(double x, double y) {
this.x=x;
this.y=y;
 }
 public double getX() {
 return x;
 }
 public double getY() {
 return y;
 }
 @Override
 public boolean equals(Object obj) 
 {
    if(obj instanceof Punkt)
     {
        Punkt P = (Punkt)obj;
        if(x==P.x)
            return y == P.y;
        return false;
     }
 return false;
 }
 @Override
 public int hashCode() {
double a=x+y;
return 3*Double.hashCode(a);
 }
 @Override
 public String toString() 
 {
 return "Początek układu wspołrzędnych : x: " + x+"y:"+y;
 } 
 /**
 * Początek układu współrzędnych.
 * W tym miejscu słowo kluczowe final oznacza, że statyczne
 * pole klasy Punkt nie może zostać zmienione.
 * Dotyczy to jednak samej referencji, a nie obiektu, na który
 * wskazuje.
 */
 public static final Punkt O = new Punkt(0, 0);
 /**
 * Punkt (1,0) w układzie współrzędnych
 */
 public static final Punkt E_X = new Punkt(1, 0);

 /**
 * Punkt (0,1) w układzie współrzędnych
 */
 public static final Punkt E_Y = new Punkt(0, 1);
}
