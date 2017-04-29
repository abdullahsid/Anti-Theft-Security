package trainedge.antitheftsecurity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    private ImageView logo;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        logo = (ImageView) findViewById(R.id.ivlogo);
        text = (TextView) findViewById(R.id.tvpro);
        logo.animate().scaleX(1.5f).scaleY(1.5f).setDuration(1000).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);

                Intent i = new Intent(Splash.this, HomeActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}

