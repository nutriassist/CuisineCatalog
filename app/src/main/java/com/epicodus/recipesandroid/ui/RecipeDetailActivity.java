package com.epicodus.recipesandroid.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.epicodus.recipesandroid.R;

public class RecipeDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);
    }
}
