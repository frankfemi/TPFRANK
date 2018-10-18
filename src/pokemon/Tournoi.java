package pokemon;

import java.util.ArrayList;
import java.util.Iterator;

import exceptions.FullPokeException;
import exceptions.EmptyPokeException;

public class Tournoi {
    private int nbPokemon;
    private ArrayList<Pokemon> liste;
    private Pokemon[] listeDuel;
    private int index = 0;

    public Tournoi(int nbPokemon){
        this.nbPokemon = nbPokemon;
        liste = new ArrayList<Pokemon>();
        listeDuel = new Pokemon[nbPokemon];
    }

    public void add(Pokemon poke) throws FullPokeException {
        if(liste.size() > nbPokemon)
        {
            throw new FullPokeException("Plus de palces");
        }
        liste.add(poke);
        listeDuel[index] = poke;
        index++;
    }

    public void remove(int i) throws EmptyPokeException{
        if(liste.isEmpty()){
            throw new EmptyPokeException("There are no pokeman");
        }
        else{
            listeDuel[i] = null;
        }
    }

    public void listPoke() throws EmptyPokeException {
        if (liste.isEmpty()) {
            throw new EmptyPokeException("Il n'y a pas de pokeman dans le tournoi");
        }
        else{
            Iterator<Pokemon> it = liste.iterator();
            while(it.hasNext()){
                System.out.println(it.next().toString());
            }
        }
    }


    public void battle(){

        int i = 0;
        for(int j=i+1;j<nbPokemon;j++){
            System.out.println(listeDuel[i].getNom()+" a commecé le combat avec "+listeDuel[j].getNom());
            if(listeDuel[i].getNiveauVie() > listeDuel[j].getNiveauVie()){
                System.out.println(listeDuel[i].getNom()+" a gagné ");
                listeDuel[j] = listeDuel[i];
            }
            else
            if(listeDuel[i].getNiveauVie() < listeDuel[j].getNiveauVie()){
                System.out.println(listeDuel[j].getNom()+" a gagné ");
            }
            else
                System.out.println(" EGALITE ");

            try{
                remove(i);
            }
            catch (EmptyPokeException ex){
                System.out.println(ex.getMessage());
            }
            i++;
        }

}


}
