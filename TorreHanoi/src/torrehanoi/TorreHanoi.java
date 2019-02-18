
package torrehanoi;


public class TorreHanoi {

public static void main(String[] args) {
    TorreHanoi objHanoi = new TorreHanoi();
    objHanoi.torresHanoi(6, 1, 2, 3);
    System.out.println("Juego Completo");

}
public void torresHanoi (int discos, int torre1, int torre2, int torre3){
if (discos==1){
    System.out.println("Mover discos de torre  " + torre1 + " a torre " + torre3);
    
} else {
    torresHanoi(discos-1, torre1, torre3, torre2);
        System.out.println("Mover discos de torre  " + torre1 + " a torre " + torre3);
        torresHanoi(discos-1, torre2, torre1, torre3);
}

}
}
