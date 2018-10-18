package pokemon;

public class Feu  extends Pokemon{
    private String race;

    public Feu (String race,String nom, int niveauVie, int niveauPouvoir,String cri)
    {
        super(nom,niveauVie,niveauPouvoir,cri);
        this.setRace(race);
    }

    //Getteur
    public String getRace()
    {
        return this.race;
    }
    //setteur
    private void setRace(String race){
        this.race = race;
    }

    public String toString(){
        return this.getNom() + " cri " + super.getCri();
    }

    public String victoire(){
        return "Yes, j'ai gagné";
    }

    public String defaite(){
        return "Merde, j'ai perdu";
    }
}
