package labapp.cotrim.labapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openTabs(View view){
        System.out.println("Open Tabs");
    }
}
