package rodrigo.sdm.com.pract3sdm;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
    }

    public void crearPestañas(View v){
        TabHost host=(TabHost) findViewById(R.id.my_tab_host);
        host.setup();
        Resources res=getResources();

        TabHost.TabSpec spec = host.newTabSpec("TAB1");
        // Tab Indicator specified as Label and Icon
        spec.setIndicator("Label1",
                res.getDrawable(R.drawable.bombilla_secuencial,null));
        spec.setContent(R.id.my_scroll_view1);
        host.addTab(spec);
        spec = host.newTabSpec("TAB2");
        // Tab Indicator specified as View
        spec.setIndicator(
                getLayoutInflater().inflate(R.layout.tab2, null));
        spec.setContent(R.id.my_scroll_view2);
        host.addTab(spec);

      /* // TabHost tabs=(TabHost)findViewById(android.R.id.my_tab_host);
       // tabs.setup();
        Resources res=getResources();
        TabHost.TabSpec spec=host.newTabSpec("TAB1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Label1",
                res.getDrawable(android.R.drawable.ic_btn_speak_now, null));
        host.addTab(spec);

        spec=host.newTabSpec("TAB2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Label2",
                res.inflate(android.R.layout.tab2, null));
        host.addTab(spec);

        host.setCurrentTab(0);*/
    }
}
