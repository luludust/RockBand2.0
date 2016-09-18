package hackmit.rockband20;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.view.MotionEvent;

/**
 * Created by Fate on 9/17/2016.
 */
public class PianoFunction extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final View decorView = getWindow().getDecorView();

        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LOW_PROFILE
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        decorView.setOnSystemUiVisibilityChangeListener
                (new View.OnSystemUiVisibilityChangeListener() {
                    @Override
                    public void onSystemUiVisibilityChange(int visibility) {
                        // Note that system bars will only be "visible" if none of the
                        // LOW_PROFILE, HIDE_NAVIGATION, or FULLSCREEN flags are set.
                        if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
                            // TODO: The system bars are visible. Make any desired
                            decorView.setSystemUiVisibility(
                                    View.SYSTEM_UI_FLAG_LOW_PROFILE
                                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                                            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
                            ActionBar actionBar = getSupportActionBar();
                            if (actionBar != null) {
                                actionBar.hide();
                            }
                        }
                    }
                });

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        setContentView(R.layout.Piano);

        final Button cnote = (Button) findViewById(R.id.button4);
        final MediaPlayer notec = MediaPlayer.create(this, R.raw.c_note);

        cnote.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    notec.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    notec.pause();
                }
                return false;
            }

        });

        final Button dnote = (Button) findViewById(R.id.button5);
        final MediaPlayer noted = MediaPlayer.create(this, R.raw.d_note);

        dnote.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    noted.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    noted.pause();
                }
                return false;
            }

        });

        final Button enote = (Button) findViewById(R.id.button6);
        final MediaPlayer notee = MediaPlayer.create(this, R.raw.e_note);

        cnote.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    notee.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    notee.pause();
                }
                return false;
            }

        });

        final Button fnote = (Button) findViewById(R.id.button7);
        final MediaPlayer notef = MediaPlayer.create(this, R.raw.f_note);

        cnote.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    notef.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    notef.pause();
                }
                return false;
            }

        });

        final Button gnote = (Button) findViewById(R.id.button8);
        final MediaPlayer noteg = MediaPlayer.create(this, R.raw.g_note);

        cnote.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    noteg.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    noteg.pause();
                }
                return false;
            }

        });

        final Button anote = (Button) findViewById(R.id.button9);
        final MediaPlayer notea = MediaPlayer.create(this, R.raw.a_note);

        cnote.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    notea.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    notea.pause();
                }
                return false;
            }

        });

        final Button bnote = (Button) findViewById(R.id.button10);
        final MediaPlayer noteb = MediaPlayer.create(this, R.raw.b_note);

        cnote.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN) {
                    noteb.start();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    noteb.pause();
                }
                return false;
            }

        });



//        final Button multi = (Button) findViewById(R.id.multi_button);
//        multi.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Switch to next activity
//                Intent intent = new Intent(PlayerScreen.this, SongList.class);
//                startActivity(intent);
//            }
//        });
    }

}
