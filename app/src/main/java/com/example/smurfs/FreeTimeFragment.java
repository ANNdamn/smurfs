package com.example.smurfs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class FreeTimeFragment extends Fragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_free_time, container, false);
        Button freeNextButton = view.findViewById(R.id.freeNextButton);
        RadioGroup freeRadioGroup = view.findViewById(R.id.freeRadioGroup);
        freeNextButton.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_freeTimeFragment_to_favFoodFragment));
        return view;
    }
}
