package id.ac.budiluhur.firstrecyclerview;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class DataRecyclerAdapter extends RecyclerView.Adapter<DataRecyclerAdapter.ViewHolder>{
    private List<DataSayur> isiDatanya;
    private Context context;

    public DataRecyclerAdapter(List<DataSayur> isiDatanya, Context context) {
        this.isiDatanya = isiDatanya;
        this.context = context;
    }

    @Override
    public DataRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_sayur, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataRecyclerAdapter.ViewHolder holder, final int position) {
        holder.txtNamaSayur.setText(isiDatanya.get(position).getNamaSayur());
        holder.txtHarga.setText(isiDatanya.get(position).getHarga());
        holder.txtJumStok.setText(isiDatanya.get(position).getJumStok());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Sayur yang diklik : " +
                        isiDatanya.get(position).getNamaSayur(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return isiDatanya.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardView;
        TextView txtNamaSayur, txtHarga, txtJumStok;

        public ViewHolder(View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.card_view);
            txtNamaSayur = itemView.findViewById(R.id.txt_nama_sayur);
            txtHarga = itemView.findViewById(R.id.txt_harga);
            txtJumStok = itemView.findViewById(R.id.txt_jumlah_stok);
        }
    }
}
