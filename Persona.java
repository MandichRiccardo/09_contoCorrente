public class Persona{
    private String nome;
    private String cognome;
    private int anni;
    private String codiceFiscale;
    
    public Persona(String inNome, String inCognome, int inAnni, String inCodiceFiscale){
        setNome(inNome);
        setCognome(inCognome);
        setAnni(inAnni);
        setCodiceFiscale(inCodiceFiscale);
    }
    public Persona(Persona p){
        setNome(p.nome);
        setCognome(p.cognome);
        setAnni(p.anni);
        setCodiceFiscale(p.codiceFiscale);
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String inNome){
        nome = inNome;
    }
    public void inputNome(){
        setNome(Interazione.strput("inserisci il nome"));
    }
    
    public String getCognome(){
        return cognome;
    }
    public void setCognome(String inCognome){
        cognome = inCognome;
    }
    public void inputCognome(){
        setCognome(Interazione.strput("inserisci il cognome"));
    }
    
    public int getAnni(){
        return anni;
    }
    public void setAnni(int inAnni){
        anni = inAnni;
    }
    public void inputAnni(){
        setAnni(Interazione.input("inserisci gli anni di "+getNome()+" "+getCognome()));
    }
    
    public String getCodiceFiscale(){
        return codiceFiscale;
    }
    public void setCodiceFiscale(String inCodiceFiscale){
        codiceFiscale = inCodiceFiscale;
    }
    public void inputCodiceFiscale(){
        setCodiceFiscale(Interazione.strput("inserisci il codice fiscale di "+getNome()+" "+getCognome()));
    }
    
    public String toString(){
        String info = "";
        info += "\tnome:\t" + nome + "\n";
        info += "\tcognome:\t" + cognome+"\n";
        info += "\tanni:\t" + anni + "\n";
        info += "\tcodice fiscale:\t" + codiceFiscale + "\n";
        return info;
    }
}