package com.example.faraday.myappportfolio;

import android.view.View;
import android.widget.Toast;

/**
 * Created by faraday on 12/2/15.
 */
public class Toaster implements View.OnClickListener {
    private String message;

    public Toaster(String message) {
        this.message = message;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(), message + " will be launched in a second", Toast.LENGTH_SHORT).show();
    }
}
