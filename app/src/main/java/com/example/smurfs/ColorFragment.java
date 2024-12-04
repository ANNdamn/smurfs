package com.example.smurfs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class ColorFragment extends Fragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_color, container, false);
        Button colorNextButton = view.findViewById(R.id.colorNextButton);
        RadioGroup colorRadioGroup = view.findViewById(R.id.colorNextButton);
        colorNextButton.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_colorFragment_to_resultFragment));
        return view;
    }
    //shape preference - для долговременного хранения
    //ababva
}
