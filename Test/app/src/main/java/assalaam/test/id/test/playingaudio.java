package assalaam.test.id.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.IOException;
import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;

public class playingaudio extends Activity {
    ImageButton mainkan;
    TextView keterangan;
    MediaPlayer mp;
    private Button btnPause;
    private Button btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playingaudio);

        keterangan = (TextView)findViewById(R.id.ket);
        keterangan.setText("Silahkan klik tombol play");
        btnPause = (Button) findViewById(R.id.btnPAUSE);
        btnStop = (Button) findViewById(R.id.btnSTOP);
        mainkan = (ImageButton)findViewById(R.id.putarMusik);
        mainkan.setOnClickListener(new OnClickListener() {
            public void onClick (View arg0){
                mainkan.setEnabled(false);
                keterangan.setText("Tombol play tidak aktif");
                go();
            }
        }); 
        btnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pause();
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stop();
            }
        });
    }
    public void go(){
        mp = MediaPlayer.create(playingaudio.this, R.raw.l);
        try{
            mp.prepare();
        }catch (IllegalStateException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }catch (IOException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
        mp.start();
        mp.setOnCompletionListener(new OnCompletionListener() {
            public void onCompletion(MediaPlayer arg0){
                mainkan.setEnabled(true);
                keterangan.setText("Silahkan klik tombol play");
            }
        });
    }

    public void stateAwal(){
        btnPause.setEnabled(false);
        btnStop.setEnabled(false);
    }


    private void play() {

        mp = MediaPlayer.create(this, R.raw.l);

        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        mp.start();

        mp.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stateAwal();
            }
        });
    }

    public void pause(){
        if(mp.isPlaying()){
            if(mp!=null){
                mp.pause();

            }
        } else {
            if(mp!=null){
                mp.start();

            }
        }
    }
    public void stop(){
        mp.stop();

        try{
            mp.prepare();
            mp.seekTo(0);
        }catch (Throwable t) {
            t.printStackTrace();
        }

        stateAwal();
    }
}
