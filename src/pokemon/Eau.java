package pokemon;

public class Eau extends Pokemon{
    private String race;

    public Eau (String race,String nom, int niveauVie, int niveauPouvoir,String cri)
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
