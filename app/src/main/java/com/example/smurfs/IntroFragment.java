package com.example.smurfs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class IntroFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intro, container, false);
        Button startButton = view.findViewById(R.id.startButton);
        startButton.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_introFragment_to_adventuresFragment));
        return view;
    }
}
