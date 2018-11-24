package androcreator.speakcupcake;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread background = new Thread() {
            public void run() {
                try {
                    // Thread will sleep for 3 seconds
                    sleep(3*1000);

                    // After 3 seconds redirect to another intent
                    Intent i = new Intent(Splash.this,MainActivity.class);
                    startActivity(i);

                    //Remove activity
                    finish();
                } catch (Exception ignored) {
                }
            }
        };

        // start thread
        background.start();
    }
}
