package com.example.vengaamipueblo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vengaamipueblo2.adaptadores.HotelAdaptador;
import com.example.vengaamipueblo2.adaptadores.RestaurantesAdaptador;
import com.example.vengaamipueblo2.moldes.MoldeHotel;
import com.example.vengaamipueblo2.moldes.RestauranteMolde;

import java.util.ArrayList;

public class ListaRestaurantes extends AppCompatActivity {
    ArrayList<RestauranteMolde> listaRestaurantes= new ArrayList<>();
    RecyclerView recyclerrestaurantes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurante);
        recyclerrestaurantes= findViewById(R.id.listadinamicarestaurante);
        recyclerrestaurantes.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearLista();
        RestaurantesAdaptador adaptador=new RestaurantesAdaptador(listaRestaurantes);
        recyclerrestaurantes.setAdapter(adaptador);
    }

    public void crearLista(){
        listaRestaurantes.add(new RestauranteMolde("HOTEL MIRADOR DE ARBOLETES","Cazuela de mariscos acompañado de arroz frito de coco y patacones crocantes","90000",R.drawable.restaurante2));
        listaRestaurantes.add(new RestauranteMolde("ASADOS EL COMPA","Picada el compa","Desde $25.000",R.drawable.asados));
        listaRestaurantes.add(new RestauranteMolde("LA ROMANA","Pizza vegetariana","Desde $20.000",R.drawable.pizza));
        listaRestaurantes.add(new RestauranteMolde("GURU","Tilapia frita","Desde $40.000",R.drawable.restaurante2));
        listaRestaurantes.add(new RestauranteMolde("Hotel1","Patacon Pisao","90000",R.drawable.hotel1));

    }
}