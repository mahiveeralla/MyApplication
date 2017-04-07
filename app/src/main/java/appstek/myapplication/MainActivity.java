package appstek.myapplication;

import android.content.Context;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;

    Context context;
    ArrayList prgname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         String[] mahendra = {"mahi", "madhava", "vengal", "vinod", "abcd"};
         int[] mahiImages = {R.drawable.kohli, R.drawable.kohli1, R.drawable.kohli2, R.drawable.kohli3, R.drawable.kohli4};


        gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new CustomAdapter(this, mahendra, mahiImages));
        {


        }
    }
}
