package com.googleplay.andromeda.helloword;

        import android.content.Intent;
        import android.media.Image;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.animation.Animation;
        import android.view.animation.AnimationUtils;
        import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {
    ImageView imageView;
    Animation animate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        animate = AnimationUtils.loadAnimation(getApplicationContext() , R.anim.time);
        animate.setAnimationListener(this);
        imageView.startAnimation(animate);

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
    if (animation == animate){
        finish();
        Intent intt = new Intent(MainActivity.this , firstActivity.class);
        startActivity(intt);

        overridePendingTransition(R.anim.fade_in , R.anim.fade_out);
    }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
