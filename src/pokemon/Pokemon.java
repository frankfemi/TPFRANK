package pokemon;

public class Pokemon {
    private String nom;
    private int niveauVie;
    private int niveauPouvoir;
    private String cri;

    //Constructeur
    public Pokemon(String nom, int niveauVie, int niveauPouvoir,String cri ){
        this.setNom(nom);
        this.setNiveauVie(niveauVie);
        this.setNiveauPouvoir(niveauPouvoir);
        this.setCri(cri);
    }
    //Getteur nom
    public String getNom(){
        return this.nom;
    }
    //Setteur nom
    public void setNom(String nom){
        this.nom = nom;
    }

    //Getteur niveau de vie
    public int getNiveauVie(){
        return this.niveauVie;
    }
    //Setteur niveau de vie
    public void setNiveauVie(int niveauVie){
        this.niveauVie = niveauVie;
    }

    //Getteur niveau de pouvoir
    public int getNiveauPouvoir(){
        return this.niveauPouvoir;
    }
    //Setteur niveau de pouvoir
    public void setNiveauPouvoir(int niveauPouvoir){
        this.niveauPouvoir = niveauPouvoir;
    }

    //Getteur cri
    public String getCri(){
        return this.cri;
    }
    //Setteur cri
    public void setCri(String cri){
        this.cri = cri;
    }







}
