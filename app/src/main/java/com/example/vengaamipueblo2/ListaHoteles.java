package com.example.vengaamipueblo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vengaamipueblo2.adaptadores.HotelAdaptador;
import com.example.vengaamipueblo2.moldes.MoldeHotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {
    ArrayList<MoldeHotel> listaHoteles= new ArrayList<>();
    RecyclerView recyclerhoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerhoteles= findViewById(R.id.listadinamicahoteles);
        recyclerhoteles.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        HotelAdaptador adaptador=new HotelAdaptador(listaHoteles);
        recyclerhoteles.setAdapter(adaptador);
    }

    public void crearLista(){
        listaHoteles.add(new MoldeHotel("Hotel1","90000",R.drawable.hotel1));
        listaHoteles.add(new MoldeHotel("Hotel1","90000",R.drawable.hotel1));
        listaHoteles.add(new MoldeHotel("Hotel1","90000",R.drawable.hotel1));
        listaHoteles.add(new MoldeHotel("Hotel1","90000",R.drawable.hotel1));
        listaHoteles.add(new MoldeHotel("Hotel1","90000",R.drawable.hotel1));
    }
}