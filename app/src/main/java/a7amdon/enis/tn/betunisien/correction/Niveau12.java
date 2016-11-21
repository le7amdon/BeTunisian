package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Reponse;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau12 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau12()
    {
        questionTexte = new QuestionTexte("7aja neklouha fi romdhane");
        ArrayList<Reponse> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Reponse("m5ara9",31));
        list_response.add(new Reponse("zlebya",20));
        list_response.add(new Reponse("brik",16));
        list_response.add(new Reponse("chorba",11));
        list_response.add(new Reponse("masfouf",8));
        list_response.add(new Reponse("9tayef",7));
        list_response.add(new Reponse("wdhen-l9adhi",5));
        list_response.add(new Reponse("bouza",2));

        questionTexte.setListe_reponses(list_response);
        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i12);
        ArrayList<Reponse> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Reponse("kwer",40));
        list_response1.add(new Reponse("terrin",23));
        list_response1.add(new Reponse("entrainement",16));
        list_response1.add(new Reponse("ramasseur",12));
        list_response1.add(new Reponse("jam3iya",9));

        questionImage.setListe_reponses(list_response1);
    }
}
