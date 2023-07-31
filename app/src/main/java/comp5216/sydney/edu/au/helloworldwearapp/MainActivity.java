package comp5216.sydney.edu.au.helloworldwearapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}