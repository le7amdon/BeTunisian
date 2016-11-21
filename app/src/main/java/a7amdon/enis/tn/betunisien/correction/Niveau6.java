package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Reponse;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau6 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau6()
    {
        questionTexte = new QuestionTexte("7aja 7lowa");
        ArrayList<Reponse> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Reponse("3sal",31));
        list_response.add(new Reponse("7alwa",20));
        list_response.add(new Reponse("chocolat",16));
        list_response.add(new Reponse("gateau",11));
        list_response.add(new Reponse("glace",8));
        list_response.add(new Reponse("degla",7));
        list_response.add(new Reponse("sokor",5));
        list_response.add(new Reponse("7al9oum",2));

        questionTexte.setListe_reponses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i6);
        ArrayList<Reponse> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Reponse("tri9",40));
        list_response1.add(new Reponse("kamiouna",23));
        list_response1.add(new Reponse("vitesse",16));
        list_response1.add(new Reponse("mtar",12));
        list_response1.add(new Reponse("tableau",9));

        questionImage.setListe_reponses(list_response1);
    }
}
