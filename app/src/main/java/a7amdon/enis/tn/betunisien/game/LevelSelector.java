package a7amdon.enis.tn.betunisien.game;

import android.provider.ContactsContract;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import a7amdon.enis.tn.betunisien.R;
import a7amdon.enis.tn.betunisien.correction.CorrectLevel;
import a7amdon.enis.tn.betunisien.correction.Level1;
import a7amdon.enis.tn.betunisien.correction.Level10;
import a7amdon.enis.tn.betunisien.correction.Level11;
import a7amdon.enis.tn.betunisien.correction.Level12;
import a7amdon.enis.tn.betunisien.correction.Level13;
import a7amdon.enis.tn.betunisien.correction.Level14;
import a7amdon.enis.tn.betunisien.correction.Level15;
import a7amdon.enis.tn.betunisien.correction.Level2;
import a7amdon.enis.tn.betunisien.correction.Level3;
import a7amdon.enis.tn.betunisien.correction.Level4;
import a7amdon.enis.tn.betunisien.correction.Level5;
import a7amdon.enis.tn.betunisien.correction.Level6;
import a7amdon.enis.tn.betunisien.correction.Level7;
import a7amdon.enis.tn.betunisien.correction.Level8;
import a7amdon.enis.tn.betunisien.correction.Level9;
import a7amdon.enis.tn.betunisien.db.DatabaseHandler;
import a7amdon.enis.tn.betunisien.util.Response;

/**
 * Created by 7amdon on 12/12/2016.
 */

public class LevelSelector {

    public void selectLevel(int nbLevel, TextView textView_level_question_text){

        switch (nbLevel){
            case 1 :
                textView_level_question_text.setText(R.string.niveau1_question);
                break;
            case 2 :
                textView_level_question_text.setText(R.string.niveau2_question);
                break;
            case 3 :
                textView_level_question_text.setText(R.string.niveau3_question);
                break;
            case 4 :
                textView_level_question_text.setText(R.string.niveau4_question);
                break;
            case 5 :
                textView_level_question_text.setText(R.string.niveau5_question);
                break;
            case 6 :
                textView_level_question_text.setText(R.string.niveau6_question);
                break;
            case 7 :
                textView_level_question_text.setText(R.string.niveau7_question);
                break;
            case 8 :
                textView_level_question_text.setText(R.string.niveau8_question);
                break;
            case 9 :
                textView_level_question_text.setText(R.string.niveau9_question);
                break;
            case 10 :
                textView_level_question_text.setText(R.string.niveau10_question);
                break;
            case 11 :
                textView_level_question_text.setText(R.string.niveau11_question);
                break;
            case 12 :
                textView_level_question_text.setText(R.string.niveau12_question);
                break;
            case 13 :
                textView_level_question_text.setText(R.string.niveau13_question);
                break;
            case 14 :
                textView_level_question_text.setText(R.string.niveau14_question);
                break;
            case 15 :
                textView_level_question_text.setText(R.string.niveau15_question);
                break;
        }
    }

    public void selectLevel(int nbLevel,ImageView imgView_level_image_src){

        switch (nbLevel){
            case 1 :
                imgView_level_image_src.setImageResource(R.drawable.i1);
                break;
            case 2 :
                imgView_level_image_src.setImageResource(R.drawable.i2);
                break;
            case 3 :
                imgView_level_image_src.setImageResource(R.drawable.i3);
                break;
            case 4 :
                imgView_level_image_src.setImageResource(R.drawable.i4);
                break;
            case 5 :
                imgView_level_image_src.setImageResource(R.drawable.i5);
                break;
            case 6 :
                imgView_level_image_src.setImageResource(R.drawable.i6);
                break;
            case 7 :
                imgView_level_image_src.setImageResource(R.drawable.i7);
                break;
            case 8 :
                imgView_level_image_src.setImageResource(R.drawable.i8);
                break;
            case 9 :
                imgView_level_image_src.setImageResource(R.drawable.i9);
                break;
            case 10 :
                imgView_level_image_src.setImageResource(R.drawable.i10);
                break;
            case 11 :
                imgView_level_image_src.setImageResource(R.drawable.i11);
                break;
            case 12 :
                imgView_level_image_src.setImageResource(R.drawable.i12);
                break;
            case 13 :
                imgView_level_image_src.setImageResource(R.drawable.i13);
                break;
            case 14 :
                imgView_level_image_src.setImageResource(R.drawable.i14);
                break;
            case 15 :
                imgView_level_image_src.setImageResource(R.drawable.i15);
                break;
        }
    }

    public CorrectLevel selectCorrectLevel(int nbLevel){

        switch (nbLevel){
            case 1 :
                return new Level1();
            case 2 :
                return new Level2();
            case 3 :
                return new Level3();
            case 4 :
                return new Level4();
            case 5 :
                return new Level5();
            case 6 :
                return new Level6();
            case 7 :
                return new Level7();

            case 8 :
                return new Level8();
            case 9 :
                return new Level9();
            case 10 :
                return new Level10();
            case 11 :
                return new Level11();

            case 12 :
                return new Level12();
            case 13 :
                return new Level13();
            case 14 :
                return new Level14();
            case 15 :
                return new Level5();
        }
        return null;
    }

    public Response checkResponse_text(CorrectLevel correctLevel,String response){
        for (int i=0;i<correctLevel.getQuestionTexte().getListe_responses().size();i++){
            if (correctLevel.getQuestionTexte().getListe_responses().get(i).getTexte().equals(response)){
                return correctLevel.getQuestionTexte().getListe_responses().get(i);
            }
        }
        return  null;
    }

    public Response checkResponse_image(CorrectLevel correctLevel,String response){
        for (int i=0;i<correctLevel.getQuestionImage().getListe_responses().size();i++){
            if (correctLevel.getQuestionImage().getListe_responses().get(i).getTexte().equals(response)){
                return correctLevel.getQuestionImage().getListe_responses().get(i);
            }
        }
        return  null;
    }

    public double getPercentTextByLevel(int id_level, DatabaseHandler db){
        List<Response> responses = db.getResponses_textByLevel(id_level) ;
        double percent =0;
        for(int i=0;i<responses.size();i++){
            percent += responses.get(i).getPourcentage();
        }
        return percent;
    }
    public double getPercentImageByLevel(int id_level, DatabaseHandler db){
        List<Response> responses = db.getResponses_imageByLevel(id_level) ;
        double percent =0;
        for(int i=0;i<responses.size();i++){
            percent += responses.get(i).getPourcentage();
        }
        return percent;
    }
    public double getPercentByLevel(int id_level, DatabaseHandler db){
        return getPercentTextByLevel(id_level,db) + getPercentImageByLevel(id_level,db);
    }


}
