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
public class Reloj extends Lienzo{
    
    private boolean horaExacta;
    private int hora;    
    private int minutos;
    private int segundos;
    
    Reloj(){
        super(55,55);
        this.hora =12;
        this.minutos=30;
        this.segundos=45;
        this.horaExacta = false;
        this.update();
    }
    
    Reloj(int x, int y){
        super(x,y);
        this.hora =12;
        this.minutos=30;
        this.segundos=45;
        this.horaExacta = false;
    }
    
    public void update () {
        //this.dibujaCirculo(1, 26, 27, 26, '=');
        this.clear();
        this.dibujaCirculo(26, 26, 25, '=');        
        this.dibujaHora(this.getHora());
        this.dibujaMinoSeg(this.getMinutos(), 15.0, '*');
        this.dibujaMinoSeg(this.getSegundos(), 17.0, '.');
        this.paint();
    }

    public int getHora() {
        return this.hora;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public int getSegundos() {
        return this.segundos;
    }
    
    public boolean isHoraExacta() {
        return this.horaExacta;
    }
    
    public void setHoraExacta (boolean horaExacta) {
        this.horaExacta = horaExacta;
    }
    
    public void dibujaHora (int hora) {
        if (hora>12)
            hora -=12;
        /*
        0,12 -> 90°
        11 -> 120°
        10 -> 150°
        9 -> 180°
        8 -> 210°
        7 -> 240°
        6 -> 270°
        5 -> 300°
        4 -> 330°
        3 -> 0°
        2 -> 30°
        1 -> 60°
        */
        double grados;
        switch (hora) {
            case 0:
            case 12:
                grados = 90.0;
                break;
            case 11:
                grados = 120.0;
                break;
            case 10:
                grados = 150.0;
                break;
            case 9:
                grados = 180.0;
                break;
            case 8:
                grados = 210.0;
                break;
            case 7:
                grados = 240.0;
                break;
            case 6:
                grados = 270.0;
                break;
            case 5:
                grados = 300.0;
                break;
            case 4:
                grados = 330.0;
                break;
            case 3:
                grados = 0.0;
                break;
            case 2:
                grados = 30.0;
                break;
            default:
                grados = 60.0;
                break;
        }
        this.dibujaLinea(26, 26, 20.0, grados, '+');
    }
    
    public void dibujaMinoSeg (int MinoSeg, double d, char c) {
        double grado = 90-(360/60)*MinoSeg;
        this.dibujaLinea(26, 26, d, grado, c);        
    }
}
