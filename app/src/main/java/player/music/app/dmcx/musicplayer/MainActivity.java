package player.music.app.dmcx.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // -> Varibales
    private TextView songTitleTV;
    private TextView songArtistTV;
    private TextView nextSongTV;
    private TextView endTimeTV;
    private TextView startTimeTV;

    private Button playPauseBTN;
    private Button nextBTN;
    private Button forwardBTN;
    private Button prevBTN;
    private Button backwardBTN;

    private ImageButton toggleSongIB;
    private ImageButton favIB;
    private ImageButton songListIB;
    private ImageButton menuHideIB;
    private ImageButton musicMenuIB;

    private ImageView albamArtIV;
    // -> Varibales
    private MediaPlayer mMediaPlayer;
    // -> Varibales

    // -> Methods
    private void initViews() {
        playPauseBTN = findViewById(R.id.playPauseBTN);
        nextBTN = findViewById(R.id.nextBTN);
        forwardBTN = findViewById(R.id.forwardBTN);
        prevBTN = findViewById(R.id.prevBTN);
        backwardBTN = findViewById(R.id.backwardBTN);
    }

    private void initVars() {
        mMediaPlayer = null;
    }

    private void eventListerner() {
        playPauseBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        nextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        forwardBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        prevBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        backwardBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    // -> Methods

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Views
        initViews();
        initVars();

        // Event Listerner
        eventListerner();
    }
}
