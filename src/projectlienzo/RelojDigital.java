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
public class RelojDigital extends Reloj{
    
    Lienzo [] numeros = new Lienzo[11];
    
    RelojDigital() {
        super (80,10);
        String num0[]={
" _______ ",
"(  __   )",
"| (  )  |",
"| | /   |",
"| (/ /) |",
"|   / | |",
"|  (__) |",
"(_______)"};
        
        String num1[] ={
"  __   ",
" /  \\  ",
" \\/) ) ",
"   | | ",
"   | | ",
"   | | ",
" __) (_",
" \\____/"};

        String num2[] ={
" _______ ",
"/ ___   )",
"\\/   )  |",
"    /   )",
"  _/   / ",
" /   _/  ",
"(   (__/\\",
"\\_______/"};

        String num3[] ={
" ______  ",
"/ ___  \\ ",
"\\/   \\  \\",
"   ___) /",
"  (___ ( ",
"      ) \\",
"/\\___/  /",
"\\______/ "};

        String num4[] ={
"    ___   ",
"   /   )  ",
"  / /) |  ",
" / (_) (_ ",
"(____   _)",
"     ) (  ",
"     | |  ",
"     (_)  "};
          
        String num5[] ={
" _______ ",
"(  ____ \\",
"| (    \\/",
"| (____  ",
"(_____ \\ ",
"      ) )",
"/\\____) )",
"\\______/ "};

        String num6[] ={
"  ______ ",
" / ____ \\",
"( (    \\/",
"| (____  ",
"|  ___ \\ ",
"| (   ) )",
"( (___) )",
" \\_____/ "};
         
        String num7[] ={
" ______  ",
"/ ___  \\ ",
"\\/   )  )",
"    /  / ",
"   /  /  ",
"  /  /   ",
" /  /    ",
" \\_/     "};
         
        String num8[] ={
"  _____  ",
" / ___ \\ ",
"( (___) )",
" \\     / ",
" / ___ \\ ",
"( (   ) )",
"( (___) )",
" \\_____/ "};

        String num9[] ={
"  _____  ",
" / ___ \\ ",
"( (   ) )",
"( (___) |",
" \\____  |",
"      ) |",
"/\\____) )",
"\\______/ " };        

        String dospuntos[] ={
"   ",
" _ ",
"(_)",
"   ",
" _ ",
"(_)",
"   ",
"   "};
        numeros[0]= Lienzo.LienzoFactory(num0);
        numeros[1]= Lienzo.LienzoFactory(num1);
        numeros[2]= Lienzo.LienzoFactory(num2);
        numeros[3]= Lienzo.LienzoFactory(num3);
        numeros[4]= Lienzo.LienzoFactory(num4);
        numeros[5]= Lienzo.LienzoFactory(num5);
        numeros[6]= Lienzo.LienzoFactory(num6);
        numeros[7]= Lienzo.LienzoFactory(num7);
        numeros[9]= Lienzo.LienzoFactory(num8);
        numeros[10]= Lienzo.LienzoFactory(dospuntos);                
        this.update();
    }
    
    @Override
    public void update() {
        int decHora = this.getHora()/10;
        int uniHora = this.getHora()-decHora*10;
        int decMinuto = this.getMinutos()/10;
        int uniMinuto = this.getMinutos() - decMinuto*10;
        int decSegundo = this.getSegundos()/10;
        int uniSegundo = this.getSegundos() - decSegundo*10;
        int x=0;
        this.agregaLienzo(x, 0, numeros[decHora]);
        x+=numeros[decHora].getAncho();        
        this.agregaLienzo(x, 0, numeros[uniHora]);
        x+=numeros[uniHora].getAncho();
        this.agregaLienzo(x, 0, numeros[10]);
        x+=numeros[10].getAncho();
        
        this.agregaLienzo(x, 0, numeros[decMinuto]);
        x+=numeros[decMinuto].getAncho();
        this.agregaLienzo(x, 0, numeros[uniMinuto]);
        x+=numeros[uniMinuto].getAncho();
        this.agregaLienzo(x, 0, numeros[10]);
        x+=numeros[10].getAncho();
        
        this.agregaLienzo(x, 0, numeros[decSegundo]);
        x+=numeros[decSegundo].getAncho();
        this.agregaLienzo(x, 0, numeros[uniSegundo]);
        x+=numeros[uniSegundo].getAncho();
        this.agregaLienzo(x, 0, numeros[10]);
        x+=numeros[10].getAncho();
        
        this.paint();
    }
}
