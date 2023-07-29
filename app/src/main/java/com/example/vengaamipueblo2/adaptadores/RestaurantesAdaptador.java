package com.example.vengaamipueblo2.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vengaamipueblo2.R;

import com.example.vengaamipueblo2.moldes.RestauranteMolde;

import java.util.ArrayList;

public class RestaurantesAdaptador extends RecyclerView.Adapter<RestaurantesAdaptador.viewHolder> {

    //atributos
    public ArrayList<RestauranteMolde> listaRestaurantes;

    //CONSTRUCTOR

    public RestaurantesAdaptador(ArrayList<RestauranteMolde> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    //funcionamiento adicional
    @NonNull
    @Override
    public RestaurantesAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.molderestaurantes,null,false);
        return new viewHolder(vista);
    }


    @Override
    public void onBindViewHolder(@NonNull RestaurantesAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaRestaurantes.get(i));


    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView fotoRestaurante;
        TextView nombreRestaurante;
        TextView descripcionPlato;
        TextView precioPlato;

        public viewHolder(View item){
            super(item);
            fotoRestaurante=item.findViewById(R.id.restauranteitem);
            nombreRestaurante=item.findViewById(R.id.titulorestaurante);
            descripcionPlato=item.findViewById(R.id.platod);
            precioPlato=item.findViewById(R.id.preciosp);

        }


        public void actualizarDatos(RestauranteMolde restauranteMolde) {
            fotoRestaurante.setImageResource(restauranteMolde.getFoto());
            nombreRestaurante.setText(restauranteMolde.getNombre());
            descripcionPlato.setText(restauranteMolde.getPlato());
            precioPlato.setText(restauranteMolde.getRangoPrecios());


        }
    }
}








