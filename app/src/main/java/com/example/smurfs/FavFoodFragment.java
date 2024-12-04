package com.example.smurfs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class FavFoodFragment extends Fragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_fav_food, container, false);
        Button favNextButton = view.findViewById(R.id.favNexButton);
        RadioGroup favRadioGroup = view.findViewById(R.id.favNexButton);
        favNextButton.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_favFoodFragment_to_colorFragment));
        return view;
    }

}
