package com.example.smurfs;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class CharacterFragment extends Fragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_character, container, false);
        Button charNextButton = view.findViewById(R.id.charNextButton);
        RadioGroup charRadioGroup = view.findViewById(R.id.charRadioGroup);
        charNextButton.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_characterFragment_to_freeTimeFragment));
        return view;
    }

}
