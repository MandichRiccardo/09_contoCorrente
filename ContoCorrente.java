public class ContoCorrente{
    private String IBAN;
    private Persona intestatario;
    private double saldo;
    private String dataApertura;
    private boolean attivo;
    private MovimentoBancario[] movimenti;
    
    public ContoCorrente(   String IBAN,
                            Persona intestatario,
                            double saldo,
                            String dataApertura,
                            boolean attivo
                        ){
        this.IBAN = IBAN;
        this.intestatario = intestatario;
        this.saldo = saldo;
        this.dataApertura = dataApertura;
        this.attivo = attivo;
        this.movimenti = new MovimentoBancario[10];
    }
    
    public ContoCorrente(ContoCorrente conto){
        this.IBAN = conto.IBAN;
        this.intestatario = conto.intestatario;
        this.saldo = conto.saldo;
        this.dataApertura = conto.dataApertura;
        this.attivo = conto.attivo;
        this.movimenti = new MovimentoBancario[10];
    }
    
    public String getIBAN(){
        return this.IBAN;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public String getDataApertura(){
        return this.dataApertura;
    }
    
    public void setAttivo(boolean attivo){
        this.attivo = attivo;
    }
    public boolean getAttivo(){
        return this.attivo;
    }
    
    public String getMovimenti(){
        String info = "";
        for(int i=0;i<10;i++){
            info += "\tmovimento " + (i+1) + "\t" + movimenti[i].toString() + "\n";
        }
        return info;
    }
    
    public String toString(){
        String info = "";
        info += "IBAN:\t"+getIBAN()+"\n";
        info += "intestatario:\t"+intestatario.toString()+"\n";
        info += "saldo:\t"+getSaldo()+"\n";
        info += "data di apertura:\t"+getDataApertura()+"\n";
        info += "attivo:\t"+getAttivo()+"\n";
        info += "movimenti:\t"+getMovimenti()+"\n";
        return info;
    }
    
    public String aggiungiMovimento(MovimentoBancario movimento){
        if(this.attivo){
            for(int i=0;i<10;i++){
                if(movimenti[i] == null){
                    movimenti[i] = movimento;
                    if(movimenti[i].getEntrata()){
                        this.saldo += movimenti[i].getImporto();
                    }else{
                        this.saldo -= movimenti[i].getImporto();
                    }
                    return "ho eseguito il movimento";
                }else if(movimenti[i].equals(movimento)){
                    return "ha già eseguito questo movimento";
                }
            }
            return "hai raggiunto il numero massimo di movimenti";
        }
        return "il conto è chiuso per cui non puoi fare altri movimenti";
    }
}