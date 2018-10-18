package go;

import exceptions.EmptyPokeException;
import exceptions.FullPokeException;
import pokemon.Tournoi;
import pokemon.Eau;
import pokemon.Feu;

public class Main {
    /** Creates a new instance of Main */
    public Main() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Eau eau1 = new Eau("Race1","POKEMAN1",10,20,"MIAOU");
        Eau eau2 = new Eau("Race2","POKEMAN2",14,30,"AAAAAOOOUU");
        Eau eau3 = new Eau("Race3","POKEMAN3",4,3,"HHIIIIIIII!");

        Feu feu1 = new Feu("Race1","POKEMAN4",40,25,"EWEYUWE!");
        Feu feu2 = new Feu("Race2","POKEMAN5",1,35,"OOOOOOOOUUUUU!");


        Tournoi tournoi = new Tournoi(6);
        try{
            tournoi.add(eau1);
            tournoi.add(eau2);
            tournoi.add(eau3);
            tournoi.add(feu1);
            tournoi.add(feu2);
        }
        catch (FullPokeException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("=====Liste des Pokeman du tournoi====");
        try{
            tournoi.listPoke();
        }
        catch (EmptyPokeException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("====Le tournoi commence=====");
        tournoi.battle();
    }
    }
