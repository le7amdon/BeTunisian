package a7amdon.enis.tn.betunisien.correction;

import java.util.ArrayList;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.util.QuestionImage;
import a7amdon.enis.tn.betunisien.util.QuestionTexte;
import a7amdon.enis.tn.betunisien.util.Reponse;

/**
 * Created by 7amdon on 13/10/2016.
 */
public class Niveau4 {

    public static QuestionTexte questionTexte ;
    public static QuestionImage questionImage;

    public Niveau4()
    {
        questionTexte = new QuestionTexte("Kamel ljomla . Stal .. ?");
        ArrayList<Reponse> list_response = null;
        //les réponses de la question n°1
        list_response.add(new Reponse("ma",31));
        list_response.add(new Reponse("zebla",20));
        list_response.add(new Reponse("dohn",16));
        list_response.add(new Reponse("mas7an",11));
        list_response.add(new Reponse("ba8li",8));
        list_response.add(new Reponse("hendi",7));
        list_response.add(new Reponse("karmous",5));
        list_response.add(new Reponse("babouch",2));

        questionTexte.setListe_reponses(list_response);

        /*******image setting*******/
        questionImage = new QuestionImage(R.drawable.i4);
        ArrayList<Reponse> list_response1 = null;
        //les réponses de la question n°1
        list_response1.add(new Reponse("fil",40));
        list_response1.add(new Reponse("8ouroub",23));
        list_response1.add(new Reponse("dhel",16));
        list_response1.add(new Reponse("nature",12));
        list_response1.add(new Reponse("3ayla",9));

        questionImage.setListe_reponses(list_response1);
    }
}
