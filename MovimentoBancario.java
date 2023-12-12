public class MovimentoBancario{
    private int ID;
    private boolean entrata;
    private double importo;
    
    public MovimentoBancario(   int ID,
                                boolean entrata,
                                double importo){
        this.ID = ID;
        this.entrata = entrata;
        this.importo = importo;
    }
    
    public MovimentoBancario(MovimentoBancario movimento, int ID){
        this.ID = ID;
        this.entrata = movimento.entrata;
        this.importo = movimento.importo;
    }
    
    public int getID(){
        return ID;
    }
    
    public boolean getEntrata(){
        return entrata;
    }
    
    public double getImporto(){
        return importo;
    }
    
    public String toString(){
        String info = "";
        info += "identificatore di movimento:\t" + ID + "\n";
        if(entrata){
            info += "è un versamento in entrata";
        }else{
            info += "è un versamento in uscita";
        }
        info += "\n";
        info += "importo:\t" + importo + "\n";
        return info;
    }
}