package com.example.vengaamipueblo2.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vengaamipueblo2.R;
import com.example.vengaamipueblo2.moldes.MoldeHotel;
import com.example.vengaamipueblo2.moldes.MoldeSitios;

import java.util.ArrayList;

public class SitiosAdaptador extends RecyclerView.Adapter<SitiosAdaptador.viewHolder> {

    //atributos
    public ArrayList<MoldeSitios> listasitios;

    //CONSTRUCTOR

    public SitiosAdaptador(ArrayList<MoldeSitios> listasitios) {
        this.listasitios = listasitios;
    }

    //funcionamiento adicional
    @NonNull
    @Override
    public SitiosAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.moldehotel,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull SitiosAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listasitios.get(i));


    }

    @Override
    public int getItemCount() {
        return listasitios.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreSitio;
        TextView precioSitio;
        TextView telefonoSitio;
        ImageView fotositios;

        public viewHolder(View item){
            super(item);
            fotositios=item.findViewById(R.id.fotoitem);
            nombreSitio=item.findViewById(R.id.telefonos);
            precioSitio=item.findViewById(R.id.valores);
        }


        public void actualizarDatos(MoldeSitios moldesitio) {


        }
    }
}
