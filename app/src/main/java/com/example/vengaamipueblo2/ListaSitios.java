import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vengaamipueblo2.R;
import com.example.vengaamipueblo2.adaptadores.RestaurantesAdaptador;
import com.example.vengaamipueblo2.moldes.MoldeSitios;
import com.example.vengaamipueblo2.moldes.RestauranteMolde;

import java.util.ArrayList;

public class ListaSitios extends AppCompatActivity {
    ArrayList<RestauranteMolde> ListaSitios= new ArrayList<>();
    RecyclerView recyclersitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_sitios);
        recyclersitios= findViewById(R.id.listadinamicasitios);
        recyclersitios.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        RestaurantesAdaptador adaptador=new RestaurantesAdaptador(ListaSitios);
        recyclersitios.setAdapter(adaptador);

        public void crearLista(){
            ListaSitios.add(new MoldeSitios("dbvbg","3014562315","90000",R.drawable.restaurante2));
            ListaSitios.add(new MoldeSitios("ASADOS EL COMPA","Picada el compa","Desde $25.000",R.drawable.asados));
            ListaSitios.add(new MoldeSitios("LA ROMANA","Pizza vegetariana","Desde $20.000",R.drawable.pizza));
            ListaSitios.add(new MoldeSitios("GURU","Tilapia frita","Desde $40.000",R.drawable.restaurante2));
            ListaSitios.add(new MoldeSitios("Hotel1","Patacon Pisao","90000",R.drawable.hotel1));

        }
    }
