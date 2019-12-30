package com.example.studants;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.studants.R;

public class AdapterStudentList extends ArrayAdapter {


        private final Activity context;
        private final String[] Id;
        private final String[] Age;
        private final String[] Name;

    public AdapterStudentList(Activity context, String[] name, String[] id, String[] age){

        super(context, R.layout.item , name);

        this.context=context;
        this.Age=age;
        this.Id=id;
        this.Name=name;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View itemView=inflater.inflate(R.layout.item, null,true);

        TextView nameTextField = (TextView) itemView.findViewById(R.id.name);
        TextView idTextField = (TextView) itemView.findViewById(R.id.id);
        TextView ageTextField = (TextView) itemView.findViewById(R.id.age);

        nameTextField.setText(Name[position]);
        idTextField.setText(Id[position]);
        ageTextField.setText(Age[position]);

        return itemView;

    };
}
