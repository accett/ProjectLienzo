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
public class Challenger extends Nave{
    
    Challenger (){
        super(16,31);
        String [] nave2 = {
"       !",
"       !",
"       ^",
"      / \\",
"     /___\\",
"    |=   =|",
"    |     |",
"    |     |",
"    |     |",
"    |     |",
"    |     |",
"    |     |",
"    |     |",
"    |     |",
"    |     |",
"   /|##!##|\\",
"  / |##!##| \\",
" /  |##!##|  \\",
"|  / ^ | ^ \\  |",
"| /  ( | )  \\ |",
"|/   ( | )   \\|",
"    ((   ))",
"   ((  :  ))",
"   ((  :  ))",
"    ((   ))",
"     (( ))",
"      ( )",
"       .",
"       .",
"       ."};
        Lienzo lchallenger = Lienzo.LienzoFactory(nave2);
        this.agregaLienzo(0, 0, lchallenger);
    }
}
