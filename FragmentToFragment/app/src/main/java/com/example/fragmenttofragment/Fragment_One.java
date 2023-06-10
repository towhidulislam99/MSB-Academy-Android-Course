package com.example.fragmenttofragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment_One extends Fragment {

    EditText editText;
    Button button1;
    String input;
    sendcustomlisener listener;

    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment__one, container, false);

        editText = v.findViewById(R.id.et1);
        button1 = v.findViewById(R.id.sendBtn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                input = editText.getText().toString();
                //listener = (sendcustomlisener) getActivity();
                listener = (sendcustomlisener) context;
                listener.SendMessage(input);

            }
        });


        return v;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        this.context=context;
        super.onAttach(context);
    }

    interface sendcustomlisener
    {
        void SendMessage(String text);
    }

}