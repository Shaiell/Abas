package br.ici.treinamento.abas.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.ici.treinamento.abas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class InscricaoFragment extends Fragment {


    public InscricaoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inscricao, container, false);
    }

}
