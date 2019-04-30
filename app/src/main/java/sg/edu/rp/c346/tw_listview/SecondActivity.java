package sg.edu.rp.c346.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    ListView lvModules;
    TextView tvYear;
    ArrayList<CourseStructure> year;
    ArrayAdapter<CourseStructure> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lvModules = findViewById(R.id.lvModules);
        tvYear = findViewById(R.id.tvYear);

        Intent i = getIntent();
        int selected = i.getIntExtra("selected",0);

        year = new ArrayList<CourseStructure>();

        if(selected == 1){
            year.add(new CourseStructure("Year 1","C105", true));
            year.add(new CourseStructure("Year 1","G101", false));
            year.add(new CourseStructure("Year 1","C111", true));
            aa = new ModuleAdapter(this, R.layout.row, year);
            lvModules.setAdapter(aa);

        }else if(selected == 2){
            year.add(new CourseStructure("Year 2","C208", true));
            year.add(new CourseStructure("Year 2","C200", false));
            year.add(new CourseStructure("Year 2","C346", true));
            aa = new ModuleAdapter(this, R.layout.row, year);
            lvModules.setAdapter(aa);

        }else{
            year.add(new CourseStructure("Year 3","C347", true));
            year.add(new CourseStructure("Year 3","C349", false));
            year.add(new CourseStructure("Year 3","C302", true));
            aa = new ModuleAdapter(this, R.layout.row, year);
            lvModules.setAdapter(aa);
        }




    }
}
