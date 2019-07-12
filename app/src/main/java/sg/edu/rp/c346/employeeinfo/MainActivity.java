package sg.edu.rp.c346.employeeinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.employeeinfo.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroid;
    ArrayList<EmployeeInfo> androidList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvAndroid = findViewById(R.id.listView);
        androidList = new ArrayList<>();
        EmployeeInfo ver1 = new EmployeeInfo("John", "Software Technical Leader", 3400.0);
        EmployeeInfo ver2 = new EmployeeInfo("May", "Programmer", 2200.0);
        androidList.add(ver1);
        androidList.add(ver2);

        adapter = new CustomAdapter(this, R.layout.row, androidList);

        lvAndroid.setAdapter(adapter);
    }
}
