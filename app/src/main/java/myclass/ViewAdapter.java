package myclass;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ViewAdapter extends RecyclerView.Adapter<ViewHolder> {
    List<User> users;
    Context context;
    int idLayout;

    public  ViewAdapter(List<User> users, int idLayout)
    {
        this.users = users;
        this.idLayout = idLayout;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflar el layout
        View view = LayoutInflater.from(parent.getContext()).inflate(idLayout, parent, false);
        //Inicializar el ViewHolder
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nombre.setText(users.get(position).getName());
        holder.puntaje.setText(users.get(position).getScore());
        holder.categoria.setText(users.get(position).getCategory());
        holder.selfie.setImageResource(users.get(position).getSelfie());
    }

    @Override
    public int getItemCount() {
        //Numero de elemetos que se desplegaran en el RecyclerView
        return users.size();
    }
}
