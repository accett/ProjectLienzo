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
public class Nave extends Lienzo{
    
    public Nave(){
        super(25,23);
        String[] strNave = {"      (=========)",
                            "      |=========|",
                            "      |====_====|",
                            "      |== / \\ ==|",
                            "      |= / _ \\ =|",
                            "   _  |=| ( ) |=|  _",
                            "  /=\\ |=|     |=| /=\\",
                            "  |=| |=| USA |=| |=|",
                            "  |=| |=|  _  |=| |=|",
                            "  |=| |=| | | |=| |=|",
                            "  |=| |=| | | |=| |=|",
                            "  |=| |=| | | |=| |=|",
                            "  |=| |/  | |  \\| |=|",
                            "  |=|/    | |    \\|=|",
                            "  |=/NASA |_| NASA\\=|",
                            "  |(_______________)|",
                            "  |=| |_|__|__|_| |=|",
                            "  |=|   ( ) ( )   |=|",
                            " /===\\           /===\\",
                            "|||||||         |||||||",
                            "-------         -------",
                            " (~~~)           (~~~)"};
        Lienzo lNave = Lienzo.LienzoFactory(strNave);
        this.agregaLienzo(0, 0, lNave);
    }
    
    public Nave(int x, int y){
        super(x,y);
    }
    
}
