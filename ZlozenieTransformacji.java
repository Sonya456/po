package pl.edu.pg.eti.ksg.po.lab1.transformacje;

public class ZlozenieTransformacji implements Transformacja{
	 private final Transformacja[] tab;
	 public ZlozenieTransformacji(Transformacja[] tab) {
             this.tab = new Transformacja[tab.length];
             for(int i=0; i<tab.length; ++i){
                 this.tab[i] = tab[i];
             }
	 }
	 @Override
	 public Transformacja getTransformacjaOdwrotna() throws
	BrakTransformacjiOdwrotnejException {
	     Transformacja[] arr2 = new Transformacja[tab.length];
            for(int i=tab.length-1; i>=0; i--){
                arr2[tab.length-i-1] = tab[i].getTransformacjaOdwrotna();
            }
            return new ZlozenieTransformacji(arr2);
	 }
	 @Override
	 public Punkt transformuj(Punkt p) {   
             for(int i=0;i<tab.length;i++){
                 p=tab[i].transformuj(p);
             }
	 return p;
	 }
	 @Override
	 public String toString() {
             String tekst="Zlozenie transformacji: ";
             for(int i=0;i<tab.length;++i){
                 tekst = tekst + tab[i] + " ";
             }
	 return tekst;
	 }
	}