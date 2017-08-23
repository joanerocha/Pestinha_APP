package com.example.aluno.pestinha_app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.aluno.pestinha_app.model.Propriedade;
import java.util.List;

/**
 * Created by Aluno on 23/08/2017.
 */

public class PropriedadeAdapter extends RecyclerView.Adapter{
    List<Propriedade> listaPropriedade;
    Context context;
    private PropriedadeHolder last_item_clicked;


    public PropriedadeAdapter(List<Propriedade> listaPropriedade, Context context) {
        this.listaPropriedade = listaPropriedade;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.inflate_propriedade,parent,false);
        PropriedadeHolder holder = new PropriedadeHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        final PropriedadeHolder holder = (PropriedadeHolder) viewHolder;
        Propriedade propriedade = listaPropriedade.get(position);

        holder.getmProp_nome().setText(propriedade.getNome());
        holder.getmProp_talhoes().setText("");

        float infeccao = propriedade.getTalhoes_contaminados().length;
        infeccao =(float) ( infeccao / propriedade.getTalhoes() ) * 100;
        float tratamento = propriedade.getTalhoes_tratados().length;


        if (infeccao != 0){
            holder.getmProp_contaminados().setText(String.format("%.2f", infeccao)+"%");
            tratamento =(float) ((tratamento / propriedade.getTalhoes()) * 100);
            holder.getmProp_tratados().setText(String.format("%.2f", tratamento)+"%");
        }else{
            holder.getmProp_tratados().setText("---");
            holder.getmProp_contaminados().setText("---");
        }
        holder.getmRow().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(last_item_clicked!=null)
                    last_item_clicked.getmRow().setBackgroundColor(Color.parseColor("#ffffff"));

                holder.getmRow().setBackground(v.getResources().getDrawable(R.drawable.shape_button));
                last_item_clicked=holder;
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaPropriedade.size();
    }

}
