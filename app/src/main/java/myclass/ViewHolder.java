package myclass;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.dev.jhonyrg.ejpuntaje_pantalla.R;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView nombre;
    public TextView puntaje;
    public TextView categoria;
    public CircleImageView selfie;

    public ViewHolder(View itemView) {
        super(itemView);
        this.nombre = itemView.findViewById(R.id.txtvName);
        this.puntaje = itemView.findViewById(R.id.txtvScore);
        this.categoria = itemView.findViewById(R.id.txtvCategory);
        this.selfie = itemView.findViewById(R.id.imgvSelfie);
    }


}
