package sg.edu.rp.c346.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ModuleAdapter extends ArrayAdapter<CourseStructure> {
    private ArrayList<CourseStructure> modules;
    private Context context;
    private TextView tvModuleName;
    private ImageView ivStar;

    public ModuleAdapter(Context context, int resource, ArrayList<CourseStructure> objects){
        super(context, resource, objects);
        modules = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);
        tvModuleName = rowView.findViewById(R.id.tvModule);
        ivStar = rowView.findViewById(R.id.ivImage);
        CourseStructure current = modules.get(position);
        tvModuleName.setText(current.getYear());
        if(current.isCom()) {
            ivStar.setImageResource(R.drawable.computer);
        }
        else {
            ivStar.setImageResource(R.drawable.tree);
        }
        return rowView;
    }

}
