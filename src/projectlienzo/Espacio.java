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
public final class Espacio extends Lienzo{
    
    private Nave miNave;
    
    public Espacio(Nave myShip) {
        super(100,100);
        this.miNave = myShip;
        this.agregaNave(miNave);
    }
    
    public void agregaNave(Nave myShip) {                
        this.estadoInicial();
        this.miNave =myShip;
        this.agregaLienzo(0, 0, this.miNave);        
    }
    
    public void mueveNave(int x, int y) {
        this.estadoInicial();
        this.agregaLienzo(x, y, miNave);
        this.paint();
    }
    
    public void estadoInicial()
    {
        this.clear();
        String[] tierra = { "               ____\n" ,
                            "          .-'\'\'p 8o\'\'`-.\n" ,
                            "       .-'8888P'Y.`Y[ ' `-.\n" ,
                            "     ,']88888b.J8oo_      '`.\n" ,
                            "   ,' ,88888888888[\'        Y`.\n" ,
                            "  /   8888888888P            Y8\\\n" ,
                            " /    Y8888888P'             ]88\\\n" ,
                            ":     `Y88'   P              `888:\n" ,
                            ":       Y8.oP '- >            Y88:\n" ,
                            "|          `Yb  __             `'|\n" ,
                            ":            `'d8888bo.          :\n" ,
                            ":             d88888888ooo.      ;\n" ,
                            " \\            Y88888888888P     /\n" ,
                            "  \\            `Y88888888P     /\n" ,
                            "   `.            d88888P'    ,'\n" ,
                            "     `.          888PP'    ,'\n" ,
                            "       `-.      d8P'    ,-'   \n" ,
                            "          `-.,,_'__,,.-''"};
        Lienzo lTierra = Lienzo.LienzoFactory(tierra);
        this.agregaLienzo(this.getAncho()-lTierra.getAncho()-1, this.getAlto() - lTierra.getAlto()-1, lTierra);
        this.paint();
    }
}
