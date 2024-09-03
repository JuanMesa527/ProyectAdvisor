package unipiloto.edu.co.proyectadvisor;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class FindProyectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_find_proyect);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClickFindProyect(View view){
        TextView proyects = (TextView) findViewById(R.id.proyects);
        Spinner types = (Spinner) findViewById(R.id.types);
        String beerType = String.valueOf(types.getSelectedItemId());
        Proyect pro = new Proyect();
        ArrayList<String> listProyects = pro.getProyects(Integer.parseInt(beerType));
        proyects.setText("");
        for (String proyect:listProyects) {
            proyects.setText(proyects.getText()+"\n"+proyect);
        }
    }
}