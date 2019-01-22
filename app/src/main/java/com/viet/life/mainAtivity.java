package com.viet.life;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class mainAtivity extends Activity {

    private final String Tag = "Du_An_Dau_Tien";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);



        findViewById(R.id.button).setOnClickListener(
              new View.OnClickListener(){
                  @Override
                  public void onClick(View view)
                  {
                      Intent intent = new Intent(Intent.ACTION_DIAL);
                      startActivity(intent);

                  }
              }
        );

        findViewById(R.id.btnXemanh).setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View view)
                    {
                        setContentView(R.layout.xemanh);

                    }
                }
        );



        Log.d(Tag,"Oncreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(Tag,"ONSTART");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(Tag,"RESUME");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(Tag,"Pause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(Tag,"STOP");
    }

    @Override
    protected  void onRestart(){
        super.onRestart();
        Log.d(Tag,"RESTART");
    }

    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.d(Tag,"DESTROY");
    }


}
