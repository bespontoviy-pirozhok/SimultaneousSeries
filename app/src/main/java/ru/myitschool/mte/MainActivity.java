package ru.myitschool.mte;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import ru.myitschool.mte.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    Button button = (Button)findViewById(R.id.bt_switch);
    View v1 = findViewById(R.id.v_red);
    View v2 = findViewById(R.id.v_yellow);
    View v3 = findViewById(R.id.v_green);
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        v1.setBackgroundResource(R.color.grey);
        v2.setBackgroundResource(R.color.grey);
        v3.setBackgroundResource(R.color.grey);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                nextCvet();
            }
        });
    }

    public void nextCvet(){
        count++;
        switch (count){
            case 1:
                v1.setBackgroundResource(R.color.red);
                break;
            case 2:
                v1.setBackgroundResource(R.color.grey);
                v2.setBackgroundResource(R.color.yellow);
                break;
            case 3:
                v2.setBackgroundResource(R.color.grey);
                v3.setBackgroundResource(R.color.green);
                break;
            case 4:
                count = 0;
        }
    }

}