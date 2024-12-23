package com.example.smurfs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.airbnb.lottie.LottieAnimationView;

public class AdventuresFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_adventures, container, false);
        LottieAnimationView advenNextButton = view.findViewById(R.id.advenNextButton);
        RadioGroup advenRadioGroup = view.findViewById(R.id.advenRadioGroup);
        advenNextButton.setOnClickListener(v -> {
            int choose = advenRadioGroup.getCheckedRadioButtonId();
            if (choose == -1) {
                Toast.makeText(getContext(), "Выберите ответ", Toast.LENGTH_LONG).show();
            } else {
                RadioButton selectRadioButton = view.findViewById(choose);
                String selectText = selectRadioButton.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("selectedText", selectText);
                Navigation.findNavController(v).navigate(R.id.action_adventuresFragment_to_characterFragment, bundle);
            }
        });
        return view;
    }
}
