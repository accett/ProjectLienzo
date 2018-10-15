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
public class ProjectLienzo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Lienzo l = new Lienzo (35,35);
        //System.out.println("Alto:"+l.getAlto()+"\tAncho:"+l.getAncho());
        //l.dibujaCirculo(10,10,5,'*');
        //l.dibujaCirculo(10,10,15,15,'*');
        //l.clear();
        /*
        for (double angulo=0; angulo<=360; angulo+=15) {
            l.dibujaLinea(15, 15, 15.0, angulo, '+');
            l.paint();
            l.clear();
        }
        */
        /*
        l.dibujaCirculo(10,10,10,'*');
        for (int i=0; i<20; i++)
            System.out.println(l.getPen(i, 1));
        */
        //l.setTexto(1, 10, "Hola mundo\nHello world\nSalut!");        
        //l.setTexto(1, 10, "Hola mundo - Hello world - Salut!");        
        /*
        String [] strImagen = { " ,-,", "/.(", "\\ {", " `-`" };
        Lienzo luna = Lienzo.LienzoFactory(strImagen);
        
        l.agregaLienzo(5, 5, luna);
        l.resize(8, 8);
        
        Nave miNave = new Nave();
        Espacio terrestre = new Espacio(miNave);
        System.out.println(terrestre);
        
        terrestre.mueveNave(20, 20);
        System.out.println(terrestre);
        
        
        Nave otraNave = new Challenger();
        terrestre.agregaNave(otraNave);
        terrestre.mueveNave(80, 40);
        System.out.println(terrestre);
        */
        //l.paint();
        //Reloj miReloj = new Reloj();
        //miReloj.setHoraExacta(true);
        //System.out.println(miReloj);
        /*
        Reloj miOtroReloj = new RelojDigital();
        miOtroReloj.setHoraExacta(true);
        System.out.println(miOtroReloj);*/
        //Reloj clock = new Reloj();
        //clock.paint();
        
        // TODO code application logic here
        Reloj miReloj = new Reloj();
        miReloj.setHoraExacta(true);
        System.out.println(miReloj);
        
        Reloj miOtroReloj = new RelojDigital();
        miOtroReloj.setHoraExacta(true);
        System.out.println(miOtroReloj);
        
        Nave miNave = new Nave();
        Espacio terrestre = new Espacio(miNave);
        System.out.println(terrestre);
        
        terrestre.mueveNave(20, 20);
        System.out.println(terrestre);
        
        Nave otraNave = new Challenger();
        terrestre.agregaNave(otraNave);
        terrestre.mueveNave(80, 40);
        System.out.println(terrestre);
    }
  
}
