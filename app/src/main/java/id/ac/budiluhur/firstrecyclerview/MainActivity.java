package id.ac.budiluhur.firstrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<DataSayur> isiDatanya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        isiDatanya.add(new DataSayur("Selada", "15.000", "30"));
        isiDatanya.add(new DataSayur("Bayam", "13.000", "20"));
        isiDatanya.add(new DataSayur("Kangkung", "11.000", "31"));
        isiDatanya.add(new DataSayur("Sawi", "18.000", "24"));
        isiDatanya.add(new DataSayur("Daun Singkong", "8.000", "11"));

        DataRecyclerAdapter adapter = new DataRecyclerAdapter(isiDatanya, getApplicationContext());

        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
