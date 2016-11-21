package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Reponse;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau10 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau10()
    {
        questionTexte = new QuestionTexte("Commande mta3 chniya ?");
        ArrayList<Reponse> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Reponse("talvza",31));
        list_response.add(new Reponse("karhba",20));
        list_response.add(new Reponse("climatiseur",16));
        list_response.add(new Reponse("garage",11));
        list_response.add(new Reponse("recepteur",8));
        list_response.add(new Reponse("moutour",7));
        list_response.add(new Reponse("lo3ba",5));
        list_response.add(new Reponse("chaine-stereo",2));

        questionTexte.setListe_reponses(list_response);
        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i10);
        ArrayList<Reponse> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Reponse("wejh",40));
        list_response1.add(new Reponse("ma3loumet",23));
        list_response1.add(new Reponse("mo5",16));
        list_response1.add(new Reponse("surmenage",12));
        list_response1.add(new Reponse("numerique",9));

        questionImage.setListe_reponses(list_response1);
    }
}
