package com.example.smurfs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.airbnb.lottie.LottieAnimationView;

public class FavFoodFragment extends Fragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_fav_food, container, false);
        LottieAnimationView favNextButton = view.findViewById(R.id.favNextButton);
        RadioGroup favRadioGroup = view.findViewById(R.id.favRadioGroup);
        favNextButton.setOnClickListener(v -> {
            int choose = favRadioGroup.getCheckedRadioButtonId();
            if (choose == -1) {
                Toast.makeText(getContext(), "Выберите ответ", Toast.LENGTH_LONG).show();
            } else {
                RadioButton selectRadioButton = view.findViewById(choose);
                String selectText = selectRadioButton.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("selectText", selectText);
                Navigation.findNavController(v).navigate(R.id.action_favFoodFragment_to_colorFragment, bundle);
            }
        });
        return view;
    }
}
