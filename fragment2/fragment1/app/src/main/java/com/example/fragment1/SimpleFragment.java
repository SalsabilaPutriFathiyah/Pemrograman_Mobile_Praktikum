package com.example.fragment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SimpleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SimpleFragment extends Fragment {
    private static final int YES = 0;
    private static final int NO = 1;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


    // TODO: Rename and change types of parameters


    public SimpleFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static SimpleFragment newInstance() {
        return new SimpleFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_simple, container, false);
        final RadioGroup radioGroup = rootView.findViewById(R.id.radio_group);

    // TODO: Set the radioGroup onCheckedChanged listener.
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                View radioButton = radioGroup.findViewById(checkedId);
                int index = radioGroup.indexOfChild(radioButton);
                TextView textView =
                        rootView.findViewById(R.id.fragment_header);
                switch (index) {
                    case YES: // User chose "Yes."
                        textView.setText(R.string.yes_message);
                        break;
                    case NO: // User chose "No."
                        textView.setText(R.string.no_message);
                        break;
                    default: // No choice made.
                        // Do nothing.
                        break;
                }
            }
        });
// Return the View for the fragment's UI.
        return rootView;
    }
}