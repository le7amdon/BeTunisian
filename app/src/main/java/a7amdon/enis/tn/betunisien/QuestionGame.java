package a7amdon.enis.tn.betunisien;

import a7amdon.enis.tn.betunisien.util.Response;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
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

public class QuestionGame extends AppCompatActivity  implements View.OnClickListener{

    RelativeLayout cellule_response_locked = null;
    RelativeLayout cellule_response_unlocked=null;
    RelativeLayout one_cellule_response = null;

    LevelSelector levelSelector;
    CorrectLevel correctLevel;

    TextView game_question_txt= null;

    ViewSwitcher vf=null;
    RelativeLayout request_panel = null;
    LinearLayout response_panel = null;
    ImageButton btnImage_back=null;
    ImageButton btnImage_back_request=null;
    ImageButton btn_question_response;
    CircleDisplay progress=null;
    int id_level;

    EditText edittxt_question_response;
    CircleDisplay percent31,percent20,percent16,percent11,percent8,percent5,percent2;


    DatabaseHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_game);


        btn_question_response = (ImageButton)  findViewById(R.id.btn_question_response);
        edittxt_question_response = (EditText)  findViewById(R.id.edittxt_question_response);
        dbHandler = new DatabaseHandler(getApplicationContext());

        vf = (ViewSwitcher) findViewById(R.id.viewSwitcher);

        request_panel = (RelativeLayout) findViewById(R.id.request_panel);
        request_panel.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    vf.showNext();
                }

                return true;
            }
        });
        response_panel = (LinearLayout) findViewById(R.id.response_panel);
        response_panel.setOnTouchListener(new View.OnTouchListener() {
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
        game_question_txt = (TextView)findViewById(R.id.game_question_txt) ;
        levelSelector =new LevelSelector();
        levelSelector.selectLevel(Integer.parseInt(lvl_nbr),game_question_txt);
        correctLevel = levelSelector.selectCorrectLevel(Integer.parseInt(lvl_nbr));


        btnImage_back = (ImageButton) findViewById(R.id.btnImage_back);
        btnImage_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelActivity.class);
                intent.putExtra("level_selected", "" + lvl_nbr);
                v.getContext().startActivity(intent);
            }
        });

        btnImage_back_request = (ImageButton) findViewById(R.id.btnImage_back_request);
        btnImage_back_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), LevelActivity.class);
                intent.putExtra("level_selected", "" + lvl_nbr);
                v.getContext().startActivity(intent);
            }
        });
        progress = (CircleDisplay) findViewById(R.id.progress);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(33f, 100f, true);
        //startZoomInAnimation(progress );


        int[] reponses = new int[]{31,5,8,11,7,20,2,16};
        for (int k=0;k<reponses.length;k++){
            initializeCellule(reponses[k]);
        }
        List<Response> responses = dbHandler.getResponses_textByLevel(id_level);
        for (int p=0;p<responses.size();p++ ){
            ShowResponse(responses.get(p));
        }



    }
    /*public void startZoomInAnimation(View view) {
        //ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom_in_animation);
        view.startAnimation(animation);
    }*/

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
            View root = null;
            View locked = null;
            View unlocked = null;
            double pourcentage = response.getPourcentage();
            if (pourcentage == 31) {
                root = (View) findViewById(R.id.one_cellule_response31);
                locked = (View) findViewById(R.id.cellule_response_locked31);
                unlocked = (View) findViewById(R.id.cellule_response_unlocked31);
            }
            if (pourcentage == 2) {
                root = (View) findViewById(R.id.one_cellule_response2);
                locked = (View) findViewById(R.id.cellule_response_locked2);
                unlocked = (View) findViewById(R.id.cellule_response_unlocked2);
            }
            if (pourcentage == 5) {
                root = (View) findViewById(R.id.one_cellule_response5);
                locked = (View) findViewById(R.id.cellule_response_locked5);
                unlocked = (View) findViewById(R.id.cellule_response_unlocked5);
            }
            if (pourcentage == 7) {
                root = (View) findViewById(R.id.one_cellule_response7);
                locked = (View) findViewById(R.id.cellule_response_locked7);
                unlocked = (View) findViewById(R.id.cellule_response_unlocked7);
            }
            if (pourcentage == 8) {
                root = (View) findViewById(R.id.one_cellule_response8);
                locked = (View) findViewById(R.id.cellule_response_locked8);
                unlocked = (View) findViewById(R.id.cellule_response_unlocked8);
            }
            if (pourcentage == 11) {
                root = (View) findViewById(R.id.one_cellule_response11);
                locked = (View) findViewById(R.id.cellule_response_locked11);
                unlocked = (View) findViewById(R.id.cellule_response_unlocked11);
            }
            if (pourcentage == 16) {
                root = (View) findViewById(R.id.one_cellule_response16);
                locked = (View) findViewById(R.id.cellule_response_locked16);
                unlocked = (View) findViewById(R.id.cellule_response_unlocked16);
            }
            if (pourcentage == 20) {
                root = (View) findViewById(R.id.one_cellule_response20);
                locked = (View) findViewById(R.id.cellule_response_locked20);
                unlocked = (View) findViewById(R.id.cellule_response_unlocked20);
            }

            flipCard(root, locked, unlocked);
            response.setTurned(true);

        }
    }
    public  void bravo(Response response){
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
        progress.setFocusable(true);
        progress.requestFocus();
    }

    public void initializeCellule(int percent){
        CircleDisplay progress2=null,progress1=null;
        TextView label_ublocked=null;

        switch (percent){
            case 31 :

                 progress2 = (CircleDisplay) findViewById(R.id.progress_response_locked31);
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
                 progress1 = (CircleDisplay) findViewById(R.id.progress_response_unlocked31);
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

                 label_ublocked = (TextView) findViewById(R.id.label_response_unlocked31);

                label_ublocked.setText(correctLevel.getQuestionTexte().getListe_responses().get(0).getTexte());
                break;
            case 5 :
                 progress2 = (CircleDisplay) findViewById(R.id.progress_response_locked5);
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
                 progress1 = (CircleDisplay) findViewById(R.id.progress_response_unlocked5);
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

                 label_ublocked = (TextView) findViewById(R.id.label_response_unlocked5);
                label_ublocked.setText(correctLevel.getQuestionTexte().getListe_responses().get(6).getTexte());
                break;
            case 8 :
                progress2 = (CircleDisplay) findViewById(R.id.progress_response_locked8);
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
                progress1 = (CircleDisplay) findViewById(R.id.progress_response_unlocked8);
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

                label_ublocked = (TextView) findViewById(R.id.label_response_unlocked8);
                label_ublocked.setText(correctLevel.getQuestionTexte().getListe_responses().get(4).getTexte());
                break;
            case 11 :
                progress2 = (CircleDisplay) findViewById(R.id.progress_response_locked11);
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
                progress1 = (CircleDisplay) findViewById(R.id.progress_response_unlocked11);
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

                label_ublocked = (TextView) findViewById(R.id.label_response_unlocked11);
                label_ublocked.setText(correctLevel.getQuestionTexte().getListe_responses().get(3).getTexte());
                break;
            case 7 :
                progress2 = (CircleDisplay) findViewById(R.id.progress_response_locked7);
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
                progress1 = (CircleDisplay) findViewById(R.id.progress_response_unlocked7);
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

                label_ublocked = (TextView) findViewById(R.id.label_response_unlocked7);
                label_ublocked.setText(correctLevel.getQuestionTexte().getListe_responses().get(5).getTexte());
                break;
            case 20 :
                progress2 = (CircleDisplay) findViewById(R.id.progress_response_locked20);
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
                progress1 = (CircleDisplay) findViewById(R.id.progress_response_unlocked20);
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

                label_ublocked = (TextView) findViewById(R.id.label_response_unlocked20);
                label_ublocked.setText(correctLevel.getQuestionTexte().getListe_responses().get(1).getTexte());
                break;
            case 2 :
                progress2 = (CircleDisplay) findViewById(R.id.progress_response_locked2);
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
                progress1 = (CircleDisplay) findViewById(R.id.progress_response_unlocked2);
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

                label_ublocked = (TextView) findViewById(R.id.label_response_unlocked2);
                label_ublocked.setText(correctLevel.getQuestionTexte().getListe_responses().get(7).getTexte());
                break;
            case 16 :
                progress2 = (CircleDisplay) findViewById(R.id.progress_response_locked16);
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
                progress1 = (CircleDisplay) findViewById(R.id.progress_response_unlocked16);
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

                label_ublocked = (TextView) findViewById(R.id.label_response_unlocked16);
                label_ublocked.setText(correctLevel.getQuestionTexte().getListe_responses().get(2).getTexte());
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

    public void answer(View v){



        if(!edittxt_question_response.getText().toString().equals("")){

            //dbHandler.addReponse(new Response(1,0,edittxt_question_response.getText().toString(),20,3));
            Response response = levelSelector.checkResponse_text(correctLevel,edittxt_question_response.getText().toString());
            if (response!=null)
            {
                bravo(response);
                dbHandler.addReponse(response);
                //Toast.makeText(getApplicationContext(),dbHandler.getResponsesByLevelCount(id_level)+" !!!",Toast.LENGTH_SHORT).show();
            }
        }

    }

/*
    public void initializeResponsePanel(){

        progress = (CircleDisplay) findViewById(R.id.percent2);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(2f, 100f, true);

        progress = (CircleDisplay) findViewById(R.id.percent5);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(5f, 100f, true);

        progress = (CircleDisplay) findViewById(R.id.percent7);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(7f, 100f, true);


        progress = (CircleDisplay) findViewById(R.id.percent8);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(8f, 100f, true);

        progress = (CircleDisplay) findViewById(R.id.percent11);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(11f, 100f, true);

        progress = (CircleDisplay) findViewById(R.id.percent16);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(16f, 100f, true);

        progress = (CircleDisplay) findViewById(R.id.percent20);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(20f, 100f, true);

        progress = (CircleDisplay) findViewById(R.id.percent31);
        progress.setAnimDuration(3000);
        //progress.setValueWidthPercent(55f);
        progress.setTextSize(13f);
        progress.setColor(Color.BLUE);
        progress.setDrawText(true);
        progress.setDrawInnerCircle(true);
        progress.setFormatDigits(1);
        progress.setTouchEnabled(false);
        //progress.setSelectionListener(this);
        progress.setUnit("");
        progress.setStepSize(0.5f);
        // cd.setCustomText(...); // sets a custom array of text
        progress.showValue(31f, 100f, true);
        }
*/
}
