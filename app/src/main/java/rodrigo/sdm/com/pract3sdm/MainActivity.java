package rodrigo.sdm.com.pract3sdm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void lanzarIntent(View v){
        Intent intent;
        switch (v.getId()) {
            case R.id.buttonPlay:
                intent= new Intent(this,PlayActivity.class);
                if(intent.resolveActivity(getPackageManager()) != null)startActivity(intent);
                break;
            case R.id.buttonScores:
                intent= new Intent(this,ScoreActivity.class);
                if(intent.resolveActivity(getPackageManager()) != null)startActivity(intent);
                break;
            case R.id.buttonSettings:
                intent= new Intent(this,SettingsActivity.class);
                if(intent.resolveActivity(getPackageManager()) != null)startActivity(intent);
                break;
        }

    }
}
