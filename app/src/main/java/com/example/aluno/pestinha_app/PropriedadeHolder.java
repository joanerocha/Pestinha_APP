package com.example.aluno.pestinha_app;

import android.app.Application;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Aluno on 23/08/2017.
 */

public class PropriedadeHolder extends RecyclerView.ViewHolder{
    private TextView mProp_nome;
    private TextView mProp_talhoes;
    private TextView mProp_contaminados;
    private TextView mProp_tratados;
    private RelativeLayout mRow;
    public PropriedadeHolder(View view){
        super(view);
        mRow = (RelativeLayout) view.findViewById(R.id.row_propriedade);
        mProp_nome = (TextView) view.findViewById(R.id.prop_nome);
        mProp_talhoes = (TextView) view.findViewById(R.id.prop_talhoes);
        mProp_contaminados = (TextView) view.findViewById(R.id.prop_contaminados);
        mProp_tratados = (TextView) view.findViewById(R.id.prop_tratados);
    }

    public TextView getmProp_nome() {
        return mProp_nome;
    }

    public void setmProp_nome(TextView mProp_nome) {
        this.mProp_nome = mProp_nome;
    }

    public TextView getmProp_talhoes() {
        return mProp_talhoes;
    }

    public void setmProp_talhoes(TextView mProp_talhoes) {
        this.mProp_talhoes = mProp_talhoes;
    }

    public TextView getmProp_contaminados() {
        return mProp_contaminados;
    }

    public void setmProp_contaminados(TextView mProp_contaminados) {
        this.mProp_contaminados = mProp_contaminados;
    }

    public TextView getmProp_tratados() {
        return mProp_tratados;
    }

    public void setmProp_tratados(TextView mProp_tratados) {
        this.mProp_tratados = mProp_tratados;
    }

    public RelativeLayout getmRow() {
        return mRow;
    }

    public void setmRow(RelativeLayout mRow) {
        this.mRow = mRow;
    }
}
