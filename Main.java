import java.awt.TextArea;

class Main {
  public static void main(String[] args) {
    Matrice m = new Matrice("DEMONE");
    Vigenere v = new Vigenere(0, 12, 0, 12, m);
    Thread t = new Thread(v);
    t.start();
    try{
      t.join();
    }catch(InterruptedException ie){
      System.err.println("err");
    }
    v1 = new Vigenere(13, 25, 13, 25, m);
    Thread t1 = new Thread(v1);
    t1.start();
    m.stampa();
  }
}