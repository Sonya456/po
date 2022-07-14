package pl.edu.pg.eti.ksg.po.lab1.transformacje;

import java.lang.Math;
public class Obrot implements Transformacja{
 double kat;
 public Obrot(double kat) {
 this.kat = kat;

 }
 @Override
 public Transformacja getTransformacjaOdwrotna() {
 return new Obrot(-kat);
 }
 @Override
 public Punkt transformuj(Punkt p) {
 return new Punkt(p.getX()*Math.cos(kat) - p.getY()*Math.sin(kat), p.getX()*Math.sin(kat) + p.getY()*Math.cos(kat));
 }
 public double getkat() {
 return kat;
 }
 
 @Override
 public String toString() {
 return "Obrot: "+kat;
 }
}
