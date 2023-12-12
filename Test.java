public class Test{
    public static void main(String args[]){
        Persona p1 = new Persona("Riccardo", "Mandich", 17, "2006/07/06");
        ContoCorrente c1 = new ContoCorrente("rjhbdvòvdb", p1, 500000.50, "2023/11/07", true);
        Interazione.output(c1.aggiungiMovimento(new MovimentoBancario(6468413, true, 540.50)));
    }
}