package sg.edu.rp.c346.tw_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CustomAdapter extends ArrayAdapter<CourseStructure> {
    private  ArrayList<CourseStructure> course;
    private Context context;
    private TextView tvModuleName;
    private ImageView ivImage;

    public CustomAdapter(Context context, int resource, ArrayList<CourseStructure> objects) {
        super(context, resource, objects);
        //Store the food that is passed to this adapter
        course = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //The usual way to get the LayoutInflater object to
        //"Inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //"inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent,false);

        //Get the TextView object
        tvModuleName = rowView.findViewById(R.id.tvModules);
        ivStar = rowView.findViewById(R.id.ivStar);

        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        Food currentFood = food.get(position);
        // Set the TextView to show the food

        tvFoodName.setText(currentFood.getName());
        // Set the image to star or nostar accordingly
        if(currentFood.isStar()) {
            ivStar.setImageResource(R.drawable.star);
        }
        else {
            ivStar.setImageResource(R.drawable.nostar);
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }

}
