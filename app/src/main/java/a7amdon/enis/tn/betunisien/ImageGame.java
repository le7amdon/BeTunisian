package a7amdon.enis.tn.betunisien;

/**
 * Created by 7amdon on 13/12/2016.
 */


import a7amdon.enis.tn.betunisien.util.Response;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import java.util.List;

import a7amdon.enis.tn.betunisien.animations.CircleDisplay;
import a7amdon.enis.tn.betunisien.animations.FlipAnimation;
import a7amdon.enis.tn.betunisien.correction.CorrectLevel;
import a7amdon.enis.tn.betunisien.db.DatabaseHandler;
import a7amdon.enis.tn.betunisien.game.LevelSelector;

public class ImageGame extends AppCompatActivity  implements View.OnClickListener{

    RelativeLayout cellule_response_locked = null;
    RelativeLayout cellule_response_unlocked=null;
    RelativeLayout one_cellule_response = null;

    LevelSelector levelSelector;
    CorrectLevel correctLevel;

    ImageView game_image = null;

    ViewSwitcher vf=null;
    RelativeLayout request_panel_image = null;
    LinearLayout response_panel_image = null;
    ImageButton btnImage_back_image=null;
    ImageButton btnImage_back_request_image=null;
    ImageButton btn_image_response;
    CircleDisplay progress_image=null;
    int id_level;

    EditText edittxt_image_response;
    CircleDisplay percent31,percent20,percent16,percent11,percent8,percent5,percent2;


    DatabaseHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_game);


        btn_image_response = (ImageButton)  findViewById(R.id.btn_image_response);
        edittxt_image_response = (EditText)  findViewById(R.id.edittxt_image_response);
        dbHandler = new DatabaseHandler(getApplicationContext());

        vf = (ViewSwitcher) findViewById(R.id.viewSwitcher);

        request_panel_image = (RelativeLayout) findViewById(R.id.request_panel_image);
        request_panel_image.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    vf.showNext();
                }

                return true;
            }
        });
        response_panel_image = (LinearLayout) findViewById(R.id.response_panel_image);
        response_panel_image.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    vf.showPrevious();
                }

                return true;
            }
        });
        Bundle bundle3 = getIntent().getExtras();
        final String lvl_nbr = bundle3.getString("level_selected");
        id_level = Integer.parseInt(lvl_nbr);
        game_image = (ImageView) findViewById(R.id.game_image) ;
        levelSelector =new LevelSelector();
        levelSelector.selectLevel(Integer.parseInt(lvl_nbr), game_image);
        correctLevel = levelSelector.selectCorrectLevel(Integer.parseInt(lvl_nbr));


        btnImage_back_image = (ImageButton) findViewById(R.id.btnImage_back_image);
        btnImage_back_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelActivity.class);
                intent.putExtra("level_selected", "" + lvl_nbr);
                v.getContext().startActivity(intent);
            }
        });

        btnImage_back_request_image = (ImageButton) findViewById(R.id.btnImage_back_request_image);
        btnImage_back_request_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelActivity.class);
                intent.putExtra("level_selected", "" + lvl_nbr);
                v.getContext().startActivity(intent);
            }
        });
        progress_image = (CircleDisplay) findViewById(R.id.progress_image);
        progress_image.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress_image.setTextSize(13f);
        progress_image.setColor(Color.BLUE);
        progress_image.setDrawText(true);
        progress_image.setDrawInnerCircle(true);
        progress_image.setFormatDigits(1);
        progress_image.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress_image.setUnit("");
        progress_image.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
//        progress.showValue(33f, 100f, true);
        updateCircleProgress();
        //startZoomInAnimation(progress );


        int[] reponses = new int[]{40,23,12,9,16};
        for (int k=0;k<reponses.length;k++){
            initializeCellule(reponses[k]);
        }
        List<Response> responses = dbHandler.getResponses_imageByLevel(id_level);
        for (int p=0;p<responses.size();p++ ){
            initShowResponse(responses.get(p));
        }



    }
    /*public void startZoomInAnimation(View view) {
        //ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in_animation);
        view.startAnimation(animation);
    }*/


    public void updateCircleProgress(){
        double percent =levelSelector.getPercentImageByLevel(id_level,dbHandler);
        float f = Float.parseFloat(percent+"");
        progress_image.showValue(f, 100f, true);
    }

    public void onCardClick(View view)
    {

        View root =null;
        View locked =null;
        View unlocked=null;
        if((view.getId()==R.id.cellule_response_locked31) ||(view.getId() ==R.id.progress_response_locked31)){
            root = (View) findViewById(R.id.one_cellule_response31);
            locked = (View) findViewById(R.id.cellule_response_locked31);
            unlocked = (View) findViewById(R.id.cellule_response_unlocked31);
        }
        if((view.getId()==R.id.cellule_response_locked2) ||(view.getId() ==R.id.progress_response_locked2)){
            root = (View) findViewById(R.id.one_cellule_response2);
            locked = (View) findViewById(R.id.cellule_response_locked2);
            unlocked = (View) findViewById(R.id.cellule_response_unlocked2);
        }
        if((view.getId()==R.id.cellule_response_locked5) ||(view.getId() ==R.id.progress_response_locked5)){
            root = (View) findViewById(R.id.one_cellule_response5);
            locked = (View) findViewById(R.id.cellule_response_locked5);
            unlocked = (View) findViewById(R.id.cellule_response_unlocked5);
        }
        if((view.getId()==R.id.cellule_response_locked7) ||(view.getId() ==R.id.progress_response_locked7)){
            root = (View) findViewById(R.id.one_cellule_response7);
            locked = (View) findViewById(R.id.cellule_response_locked7);
            unlocked = (View) findViewById(R.id.cellule_response_unlocked7);
        }
        if((view.getId()==R.id.cellule_response_locked8) ||(view.getId() ==R.id.progress_response_locked8)){
            root = (View) findViewById(R.id.one_cellule_response8);
            locked = (View) findViewById(R.id.cellule_response_locked8);
            unlocked = (View) findViewById(R.id.cellule_response_unlocked8);
        }
        if((view.getId()==R.id.cellule_response_locked11) ||(view.getId() ==R.id.progress_response_locked11)){
            root = (View) findViewById(R.id.one_cellule_response11);
            locked = (View) findViewById(R.id.cellule_response_locked11);
            unlocked = (View) findViewById(R.id.cellule_response_unlocked11);
        }if((view.getId()==R.id.cellule_response_locked16) ||(view.getId() ==R.id.progress_response_locked16)){
        root = (View) findViewById(R.id.one_cellule_response16);
        locked = (View) findViewById(R.id.cellule_response_locked16);
        unlocked = (View) findViewById(R.id.cellule_response_unlocked16);
    }
        if((view.getId()==R.id.cellule_response_locked20) ||(view.getId() ==R.id.progress_response_locked20)){
            root = (View) findViewById(R.id.one_cellule_response20);
            locked = (View) findViewById(R.id.cellule_response_locked20);
            unlocked = (View) findViewById(R.id.cellule_response_unlocked20);
        }

        flipCard(root,locked,unlocked);
    }

    public void ShowResponse(Response response)
    {
        if (!response.getTurned()) {
            dbHandler.addReponse(response);
            updateCircleProgress();
            View root = null;
            View locked = null;
            View unlocked = null;
            double pourcentage = response.getPourcentage();
            if (pourcentage == 40) {
                root = (View) findViewById(R.id.one_cellule_response40_image);
                locked = (View) findViewById(R.id.one_cellule_response40_image_locked);
                unlocked = (View) findViewById(R.id.one_cellule_response40_image_unlocked);
            }
            if (pourcentage == 23) {
                root = (View) findViewById(R.id.one_cellule_response23_image);
                locked = (View) findViewById(R.id.one_cellule_response23_image_locked);
                unlocked = (View) findViewById(R.id.one_cellule_response23_image_unlocked);
            }
            if (pourcentage == 12) {
                root = (View) findViewById(R.id.one_cellule_response12_image);
                locked = (View) findViewById(R.id.one_cellule_response12_image_locked);
                unlocked = (View) findViewById(R.id.one_cellule_response12_image_unlocked);
            }
            if (pourcentage == 9) {
                root = (View) findViewById(R.id.one_cellule_response9_image);
                locked = (View) findViewById(R.id.one_cellule_response9_image_locked);
                unlocked = (View) findViewById(R.id.one_cellule_response9_image_unlocked);
            }
            if (pourcentage == 16) {
                root = (View) findViewById(R.id.one_cellule_response16_image);
                locked = (View) findViewById(R.id.one_cellule_response16_image_locked);
                unlocked = (View) findViewById(R.id.one_cellule_response16_image_unlocked);
            }

            flipCard(root, locked, unlocked);
            response.setTurned(true);

        }
    }

    public void initShowResponse(Response response)
    {
        if (!response.getTurned()) {

            View root = null;
            View locked = null;
            View unlocked = null;
            double pourcentage = response.getPourcentage();
            if (pourcentage == 40) {
                root = (View) findViewById(R.id.one_cellule_response40_image);
                locked = (View) findViewById(R.id.one_cellule_response40_image_locked);
                unlocked = (View) findViewById(R.id.one_cellule_response40_image_unlocked);
            }
            if (pourcentage == 23) {
                root = (View) findViewById(R.id.one_cellule_response23_image);
                locked = (View) findViewById(R.id.one_cellule_response23_image_locked);
                unlocked = (View) findViewById(R.id.one_cellule_response23_image_unlocked);
            }
            if (pourcentage == 12) {
                root = (View) findViewById(R.id.one_cellule_response12_image);
                locked = (View) findViewById(R.id.one_cellule_response12_image_locked);
                unlocked = (View) findViewById(R.id.one_cellule_response12_image_unlocked);
            }
            if (pourcentage == 9) {
                root = (View) findViewById(R.id.one_cellule_response9_image);
                locked = (View) findViewById(R.id.one_cellule_response9_image_locked);
                unlocked = (View) findViewById(R.id.one_cellule_response9_image_unlocked);
            }
            if (pourcentage == 16) {
                root = (View) findViewById(R.id.one_cellule_response16_image);
                locked = (View) findViewById(R.id.one_cellule_response16_image_locked);
                unlocked = (View) findViewById(R.id.one_cellule_response16_image_unlocked);
            }

            flipCard(root, locked, unlocked);
            response.setTurned(true);

        }
    }
    public  void bravo(Response response){
        Toast.makeText(getApplicationContext(),"bravo--prct!!!!"+response.getPourcentage(),Toast.LENGTH_SHORT).show();
        ShowResponse(response);
        Toast.makeText(getApplicationContext(),"Bravo !",Toast.LENGTH_SHORT).show();

    }
    private void flipCard(View root,View locked,View unlocked)
    {


        FlipAnimation flipAnimation = new FlipAnimation(locked, unlocked);

        if (locked.getVisibility() == View.GONE)
        {
            flipAnimation.reverse();
        }

        root.startAnimation(flipAnimation);
        progress_image.setFocusable(true);
        progress_image.requestFocus();
    }

    public void initializeCellule(int percent){
        CircleDisplay progress2=null,progress1=null;
        TextView label_ublocked=null;

        switch (percent){
            case 40 :

                progress2 = (CircleDisplay) findViewById(R.id.progress_response_locked40);
                progress2.setAnimDuration(3000);
                //progress2.setValueWidthPercent(55f);
                progress2.setTextSize(15f);
                progress2.setColor(Color.BLUE);
                progress2.setDrawText(true);
                progress2.setDrawInnerCircle(true);
                progress2.setFormatDigits(1);
                progress2.setTouchEnabled(false);
                //progress2.setSelectionListener(this);
                progress2.setUnit("");
                progress2.setStepSize(0.5f);
                // cd.setCustomText(...); // sets a custom array of text
                progress2.showValue(percent, 100f, true);
/***********************Top is to locked and Bottom is to unlocked*****************/
                progress1 = (CircleDisplay) findViewById(R.id.progress_response_unlocked40);
                progress1.setAnimDuration(3000);
                //progress1.setValueWidthPercent(55f);
                progress1.setTextSize(11f);
                progress1.setColor(Color.RED);
                progress1.setDrawText(true);
                progress1.setDrawInnerCircle(true);
                progress1.setFormatDigits(1);
                progress1.setTouchEnabled(false);
                //progress1.setSelectionListener(this);
                progress1.setUnit("");
                progress1.setStepSize(0.5f);
                // cd.setCustomText(...); // sets a custom array of text
                progress1.showValue(percent, 100f, true);

                label_ublocked = (TextView) findViewById(R.id.label_response_unlocked40);

                label_ublocked.setText(correctLevel.getQuestionImage().getListe_responses().get(0).getTexte());
                break;
            case 23 :
                progress2 = (CircleDisplay) findViewById(R.id.progress_response_locked23);
                progress2.setAnimDuration(3000);
                //progress2.setValueWidthPercent(55f);
                progress2.setTextSize(15f);
                progress2.setColor(Color.BLUE);
                progress2.setDrawText(true);
                progress2.setDrawInnerCircle(true);
                progress2.setFormatDigits(1);
                progress2.setTouchEnabled(false);
                //progress2.setSelectionListener(this);
                progress2.setUnit("");
                progress2.setStepSize(0.5f);
                // cd.setCustomText(...); // sets a custom array of text
                progress2.showValue(percent, 100f, true);
/***********************Top is to locked and Bottom is to unlocked*****************/
                progress1 = (CircleDisplay) findViewById(R.id.progress_response_unlocked23);
                progress1.setAnimDuration(3000);
                //progress1.setValueWidthPercent(55f);
                progress1.setTextSize(11f);
                progress1.setColor(Color.RED);
                progress1.setDrawText(true);
                progress1.setDrawInnerCircle(true);
                progress1.setFormatDigits(1);
                progress1.setTouchEnabled(false);
                //progress1.setSelectionListener(this);
                progress1.setUnit("");
                progress1.setStepSize(0.5f);
                // cd.setCustomText(...); // sets a custom array of text
                progress1.showValue(percent, 100f, true);

                label_ublocked = (TextView) findViewById(R.id.label_response_unlocked23);
                label_ublocked.setText(correctLevel.getQuestionImage().getListe_responses().get(1).getTexte());
                break;
            case 12 :
                progress2 = (CircleDisplay) findViewById(R.id.progress_response_locked12);
                progress2.setAnimDuration(3000);
                //progress2.setValueWidthPercent(55f);
                progress2.setTextSize(15f);
                progress2.setColor(Color.BLUE);
                progress2.setDrawText(true);
                progress2.setDrawInnerCircle(true);
                progress2.setFormatDigits(1);
                progress2.setTouchEnabled(false);
                //progress2.setSelectionListener(this);
                progress2.setUnit("");
                progress2.setStepSize(0.5f);
                // cd.setCustomText(...); // sets a custom array of text
                progress2.showValue(percent, 100f, true);
/***********************Top is to locked and Bottom is to unlocked*****************/
                progress1 = (CircleDisplay) findViewById(R.id.progress_response_unlocked12);
                progress1.setAnimDuration(3000);
                //progress1.setValueWidthPercent(55f);
                progress1.setTextSize(11f);
                progress1.setColor(Color.RED);
                progress1.setDrawText(true);
                progress1.setDrawInnerCircle(true);
                progress1.setFormatDigits(1);
                progress1.setTouchEnabled(false);
                //progress1.setSelectionListener(this);
                progress1.setUnit("");
                progress1.setStepSize(0.5f);
                // cd.setCustomText(...); // sets a custom array of text
                progress1.showValue(percent, 100f, true);

                label_ublocked = (TextView) findViewById(R.id.label_response_unlocked12);
                label_ublocked.setText(correctLevel.getQuestionImage().getListe_responses().get(3).getTexte());
                break;
            case 9 :
                progress2 = (CircleDisplay) findViewById(R.id.progress_response_locked9);
                progress2.setAnimDuration(3000);
                //progress2.setValueWidthPercent(55f);
                progress2.setTextSize(15f);
                progress2.setColor(Color.BLUE);
                progress2.setDrawText(true);
                progress2.setDrawInnerCircle(true);
                progress2.setFormatDigits(1);
                progress2.setTouchEnabled(false);
                //progress2.setSelectionListener(this);
                progress2.setUnit("");
                progress2.setStepSize(0.5f);
                // cd.setCustomText(...); // sets a custom array of text
                progress2.showValue(percent, 100f, true);
/***********************Top is to locked and Bottom is to unlocked*****************/
                progress1 = (CircleDisplay) findViewById(R.id.progress_response_unlocked9);
                progress1.setAnimDuration(3000);
                //progress1.setValueWidthPercent(55f);
                progress1.setTextSize(11f);
                progress1.setColor(Color.RED);
                progress1.setDrawText(true);
                progress1.setDrawInnerCircle(true);
                progress1.setFormatDigits(1);
                progress1.setTouchEnabled(false);
                //progress1.setSelectionListener(this);
                progress1.setUnit("");
                progress1.setStepSize(0.5f);
                // cd.setCustomText(...); // sets a custom array of text
                progress1.showValue(percent, 100f, true);

                label_ublocked = (TextView) findViewById(R.id.label_response_unlocked9);
                label_ublocked.setText(correctLevel.getQuestionImage().getListe_responses().get(4).getTexte());
                break;

            case 16 :
                progress2 = (CircleDisplay) findViewById(R.id.progress_response_locked16_image);
                progress2.setAnimDuration(3000);
                //progress2.setValueWidthPercent(55f);
                progress2.setTextSize(15f);
                progress2.setColor(Color.BLUE);
                progress2.setDrawText(true);
                progress2.setDrawInnerCircle(true);
                progress2.setFormatDigits(1);
                progress2.setTouchEnabled(false);
                //progress2.setSelectionListener(this);
                progress2.setUnit("");
                progress2.setStepSize(0.5f);
                // cd.setCustomText(...); // sets a custom array of text
                progress2.showValue(percent, 100f, true);
/***********************Top is to locked and Bottom is to unlocked*****************/
                progress1 = (CircleDisplay) findViewById(R.id.progress_response_unlocked16_image);
                progress1.setAnimDuration(3000);
                //progress1.setValueWidthPercent(55f);
                progress1.setTextSize(11f);
                progress1.setColor(Color.RED);
                progress1.setDrawText(true);
                progress1.setDrawInnerCircle(true);
                progress1.setFormatDigits(1);
                progress1.setTouchEnabled(false);
                //progress1.setSelectionListener(this);
                progress1.setUnit("");
                progress1.setStepSize(0.5f);
                // cd.setCustomText(...); // sets a custom array of text
                progress1.showValue(percent, 100f, true);

                label_ublocked = (TextView) findViewById(R.id.label_response_unlocked16_image);
                label_ublocked.setText(correctLevel.getQuestionImage().getListe_responses().get(2).getTexte());
                break;
            default :
                break;
        }

    }

    @Override
    public void onClick(View v) {

       /* if (v==btn_question_response|| v==edittxt_question_response){
            if(!edittxt_question_response.getText().equals(null)){
                dbHandler.addReponse(new Response(1,0,"33333",20,3));
                Toast.makeText(getApplicationContext(),dbHandler.getAllResponses().get(p).getTexte(),Toast.LENGTH_SHORT).show();
            }
            p++;
        }*/

    }

    public void answer1(View v){



        if(!edittxt_image_response.getText().toString().equals("")){

            //dbHandler.addReponse(new Response(1,0,edittxt_question_response.getText().toString(),20,3));
            Response response = levelSelector.checkResponse_image(correctLevel,edittxt_image_response.getText().toString());


            if (response!=null)
            {
                Toast.makeText(getApplicationContext(),"type!!!!"+response.getType(),Toast.LENGTH_SHORT).show();
                bravo(response);

                //Toast.makeText(getApplicationContext(),dbHandler.getResponsesByLevelCount(id_level)+" !!!",Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(getApplicationContext(),"mllll",Toast.LENGTH_SHORT).show();
            }
        }

    }


}
