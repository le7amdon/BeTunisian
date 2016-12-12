package a7amdon.enis.tn.betunisien.game;

import android.widget.ImageView;
import android.widget.TextView;

import a7amdon.enis.tn.betunisien.R;

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
}
