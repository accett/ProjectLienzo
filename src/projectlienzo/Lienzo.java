/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlienzo;

/**
 *
 * @author kl
 */
public class Lienzo {
    
    private int ancho;
    private int alto;
    private char [][] lienzo;
    
    public Lienzo() {
        this.ancho = 80;
        this.alto = 80;
        this.lienzo = new char[this.ancho][this.alto];
        for(int i = 0; i < this.ancho; i++) {
            for(int j = 0; j < this.alto; j++) {
                this.lienzo[i][j]=' ';
            }
        } 
    }
    
    public Lienzo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.lienzo = new char[this.ancho][this.alto];
        for(int i = 0; i < this.ancho; i++) {
            for(int j = 0; j < this.alto; j++) {
                this.lienzo[i][j]=' ';
            }
        } 
    }

    public int getAncho() {
        return this.ancho;
    }

    public int getAlto() {
        return this.alto;
    }      
    
    public void setPen(int x, int y, char c) {
        if (x<this.ancho && x>=0 && y<this.alto && y>=0)
            this.lienzo[x][y]=c;
       // Coloca el caracter c en la posición x,y
    }
    
    public void paint() {
        int i,j;
        for (j=this.alto-1; j>=0; j--) {
            System.out.println("");
            for (i=0; i<this.ancho; i++) {
                System.out.print(this.lienzo[i][j]);
            }            
        }
       // Imprime el lienzo en la pantalla
    }
    
    public void clear() {
        for(int i = 0; i < this.ancho; i++) {
            for(int j = 0; j < this.alto; j++) {
                this.lienzo[i][j]=' ';
            }
        }       
    }
    
    public char getPen(int x, int y) {
        if (x<this.ancho && x>=0 && y<this.alto && y>=0)
            return this.lienzo[x][y];
        else
            return 0;
    }
    
    public void resize(int x, int y) {
        if (x>=0 && y>=0) {            
            String todo;
            todo = this.toString();
            String [] strLienzo = todo.split("\n");            
            Lienzo nuevoLienzo = LienzoFactory(strLienzo);
            //this.Lienzo(x,y);
            this.ancho = x;
            this.alto = y;
            this.lienzo = null;
            this.lienzo = new char[this.ancho][this.alto];
            for(int i = 0; i < this.ancho; i++) {
                for(int j = 0; j < this.alto; j++) {
                    this.lienzo[i][j]=' ';
                }
            }
            this.agregaLienzo(0, 0, nuevoLienzo);
        }        
    }
    
    public void dibujaCirculo (int x1, int y1, int r, char c) {       
        for (double paso = 0; paso <2*Math.PI; paso +=0.1) {
            this.setPen((int)(x1+r*Math.cos(paso)), (int)(y1+r*Math.sin(paso)), c);
        }
    }
    
    public double distancia (int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    }
    
    public void dibujaCirculo (int x1, int y1, int x2, int y2, char c) {
        double pmx = (x1+x2)/2;
        double pmy = (y1+y2)/2;
        double radio = distancia (x1,y1,x2,y2)/2;
        dibujaCirculo((int)pmx,(int)pmy,(int)radio,c);
    }
    
    public double pendiente(int x1, int y1, int x2, int y2) {
        return ((double)y2 - (double)y1) / ((double)x2 - (double)x1);
    }
    
    public void dibujaLinea(int x1,int y1,int x2,int y2, char c) {
        double m = pendiente (x1,y1,x2,y2);
        double y;
        if (x1==x2) {
            if (y2>y1)
                for (y=y1; y<=y2; y++)
                    this.setPen(x1,(int)y, c);
            else
                for (y=y2; y<=y1; y++)
                    this.setPen(x1,(int)y, c);
        }
        else if (x2>x1){
            for (int x=x1; x<=x2; x++) {
                y = m * (x-x1) + y1;
                this.setPen(x, (int)y, c);
            }
        }
        else {
            for (int x=x2; x<=x1; x++) {
                y = m * (x-x2) + y1;
                this.setPen(x, (int)y, c);
            }
        }
    }
    
    public void dibujaLinea (int x1, int y1, double d, double angulo, char c) {
        // Encontrar x2 y y2
        //double m = Math.tan(angulo);
        double x2 = Math.cos(Math.toRadians(angulo))*d+x1;
        double y2 = Math.sin(Math.toRadians(angulo))*d+y1;
        //System.out.println("x2 = "+x2+"       y2"+y2);
        dibujaLinea(x1,y1,(int)x2,(int)y2,c);
    }
    
    /**
     * Convierte a cadena el lienzo.
     * @return
    */
    @Override
    public String toString() {
        String r ="";
        for (int j=this.alto-1; j>=0; j--) {
            for (int i=0; i<this.ancho; i++) {
                r+=this.lienzo[i][j];
            }
            r+='\n';
        }
        return r;        
    }
    
    public void setTexto(int px, int py, String cadena) {
        int x = px;
        int y = py;
        for (int i=0; i<cadena.length(); i++) {
            if (cadena.charAt(i)!='\n'){
                setPen(x,y,cadena.charAt(i));
                x++;
            }
            else {
                y--;
                x = px;                
            }            
        }
    }
    
    //Crea un nuevo lienzo y regresarlo
    public static Lienzo LienzoFactory(String[] cadena) {
        // Sacar largos y altos. 
        // Largo es el tamaño de la cadena más grande
        // Alto es el número de cadenas.
        int alto=cadena.length;
        int ancho=0;        
        for (int i=0; i<alto; i++)                    
            if (ancho<cadena[i].length())
                ancho=cadena[i].length();                
        Lienzo nuevoLienzo = new Lienzo(ancho,alto);
        int y=0;        
        for (int i=alto-1; i>=0; i--)
        {        
            nuevoLienzo.setTexto (0,y,cadena[i]);            
            y++;
        }        
        return nuevoLienzo;
    }
    
    public void agregaLienzo(int x, int y, Lienzo la) {
        for (int i=0; i<la.ancho; i++)
            for (int j=0; j<la.alto; j++) {
                this.setPen(x+i, y+j, la.getPen(i, j));
            }        
    }
}
