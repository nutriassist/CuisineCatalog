package com.epicodus.recipesandroid.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.epicodus.recipesandroid.Constants;
import com.epicodus.recipesandroid.R;
import com.epicodus.recipesandroid.adapters.FirebaseRecipeViewHolder;
import com.epicodus.recipesandroid.models.Recipe;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SavedRecipesListActivity extends AppCompatActivity {
    private DatabaseReference mRecipeReference;
    private FirebaseRecyclerAdapter mFirebaseAdapter;

    @BindView(R.id.rvRecipesList) RecyclerView rvRecipesListLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes_list);
        ButterKnife.bind(this);

        mRecipeReference = FirebaseDatabase.getInstance().getReference(Constants.FIREBASE_CHILD_RECIPES);
//        setUpFirebaseAdapter();
    }

//    private void setUpFirebaseAdapter() {
//        mFirebaseAdapter = new FirebaseRecyclerAdapter<Recipe, FirebaseRecipeViewHolder>
//                (Recipe.class, R.layout.recipe_list_item, FirebaseRecipeViewHolder.class, mRecipeReference) {
//
//            @Override
//            protected void populateViewHolder(FirebaseRecipeViewHolder viewHolder, Recipe model, int position) {
//                viewHolder.bindRecipe(model);
//            }
//        };
//        rvRecipesListLabel.setHasFixedSize(true);
//        rvRecipesListLabel.setLayoutManager(new LinearLayoutManager(this));
//        rvRecipesListLabel.setAdapter(mFirebaseAdapter);
//    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        mFirebaseAdapter.cleanup();
//    }
}
