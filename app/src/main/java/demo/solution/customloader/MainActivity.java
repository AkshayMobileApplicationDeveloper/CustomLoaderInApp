package demo.solution.customloader;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);
        new android.os.Handler().postDelayed(
                () -> {
                    Toast.makeText(MainActivity.this, "Timing", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                },5000);

    }
}