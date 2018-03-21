package com.epicodus.recipesandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RecipesListActivity extends AppCompatActivity{
    private ListView mRecipeListview;
    private ListView mcuisineListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes_list);

//        Recipe recipe1x = new Recipe("", "", "main", new String[]{"2 medium onions, halved and sliced", "","","","","","","","","",""} , "", "West Coast-style meals");

        Recipe recipe1 = new Recipe("PHILLY CHEESESTEAKS", "A cheesesteak, also known as a Philadelphia cheesesteak, Philly cheesesteak, cheesesteak sandwich, cheese steak, or steak and cheese, is a sandwich made from thinly sliced pieces of beefsteak and melted cheese in a long hoagie roll.", "main", new String[]{"2 medium onions, halved and sliced", "2 medium sweet red or green peppers, halved and sliced", "1 beef top sirloin steak (1-1/2 pounds), cut into thin strips","1 envelope onion soup mix","1 can (14-1/2 ounces) reduced-sodium beef broth"," 6 hoagie buns, split","12 slices provolone cheese, halved","Pickled hot cherry peppers, optional"} , "Place onions and red peppers in a 4- or 5-qt. slow cooker. Add beef, soup mix and broth. Cook, covered, on low 6-8 hours or until meat is tender., Arrange buns on a baking sheet, cut side up. Using tongs, place meat mixture on bun bottoms; top with cheese., Broil 2-3 in. from heat 30-60 seconds or until cheese is melted and bun tops are toasted.", "East Coast-style meals");

        Recipe recipe1a = new Recipe("Rum and coke pulled pork", "Inspired by the ubiquitous mixed drink, this slow cooker dish is sweet, spicy and perfectly sandwich-worthy.", "main", new String[]{"1.25 kg bone-in pork shoulder, excess fat trimmed from blade roast","1/2 tsp salt","2tsp canola oil","2 celery stalks, chopped","2 carrots chopped","1 large onion","2-3 jalapenos chopped","2 garlic cloves","1/2 tsp all spice","1/2 gold rum","2 cups cola","1.5 low-sodium chicken broth","2 bay leaves","1/2 tsp dried thyme","2 tbsp apple cider vinegar"} , "PAT meat dry with paper towels, then sprinkle with salt. Season with fresh pepper. Heat a large pot over medium. Add oil, then meat. Brown on all sides, about to 3 min per side. Transfer to slow cooker insert. ADD celery, carrots, onion, jalapenos and garlic to pan. Cook, stirring often, until brown, about 6 to 8 min. Stir in allspice, 1 min. Add rum. Using a wooden spoon, scrape up any brown bits from pot bottom and cook, 1 min. Scrape mixture into slow cooker. Add cola, broth, bay leaves and thyme. Cover and cook on low until meat is very tender, 8 hours. Remove pork to a cutting board. STRAIN sauce into a large frying pan. Discard vegetables and any fat from sauce. Boil liquid, stirring often, until reduced to 3/4 cup, 20 to 25 min. Stir in vinegar. Using 2 forks, shred meat. Combine with sauce. Serve over rice or on buns.", "East Coast-style meals");

        Recipe recipe2 = new Recipe("Slow cooker Korean tacosWest", "A Mexican-Korean fusion item, Korean tacos are made with Korean ingredients like kimchee and bulgogi, all on a Mexican corn tortilla.", "main", new String[]{"2 pounds boneless pork loin, cut into 4 pieces", "1 cup hoisin sauce","3 cloves garlic, minced","3 green onions, thinly sliced, plus extra for garnish","3 tsp ground ginger","1: 16- ounce package of coleslaw or broccoli slaw mix","3 tbsp rice wine vinegar","2 tbsp brown sugar","Small tortillas or hot cooked white rice for serving, or brown rice"} , "Add the pieces of pork in the insert/bowl of your slow cooker. Add hoisin sauce, garlic, green onions, and ground ginger. Toss each piece of pork a few times to fully coat with the sauce and spices. Cover and cook on low for 8 to 9 hours. Prior to serving, in a bowl, toss coleslaw or broccoli slaw mix with rice wine vinegar and brown sugar. Remove pork from slow cooker and shred. Place pork back into the sauce and toss to coat. Serve in warmed tortillas with slaw on top or spoon pork onto a bed of rice. Garnish with sliced green onions, if desired. Store leftovers in an airtight container for up to 5 days.", "West Coast-style meals");

        Recipe recipe2a = new Recipe("Slow cooker Korean tacosWest", "A Mexican-Korean fusion item, Korean tacos are made with Korean ingredients like kimchee and bulgogi, all on a Mexican corn tortilla.", "main", new String[]{"2 pounds boneless pork loin, cut into 4 pieces", "1 cup hoisin sauce","3 cloves garlic, minced","3 green onions, thinly sliced, plus extra for garnish","3 tsp ground ginger","1: 16- ounce package of coleslaw or broccoli slaw mix","3 tbsp rice wine vinegar","2 tbsp brown sugar","Small tortillas or hot cooked white rice for serving, or brown rice"} , "Add the pieces of pork in the insert/bowl of your slow cooker. Add hoisin sauce, garlic, green onions, and ground ginger. Toss each piece of pork a few times to fully coat with the sauce and spices. Cover and cook on low for 8 to 9 hours. Prior to serving, in a bowl, toss coleslaw or broccoli slaw mix with rice wine vinegar and brown sugar. Remove pork from slow cooker and shred. Place pork back into the sauce and toss to coat. Serve in warmed tortillas with slaw on top or spoon pork onto a bed of rice. Garnish with sliced green onions, if desired. Store leftovers in an airtight container for up to 5 days.", "West Coast-style meals");

        Recipe recipe3 = new Recipe("NEW ENGLAND CLAM CHOWDER", "With its fertile farmland, coastal waters, and flavorful influence from generations of immigrants, it’s no surprise that New England cuisine has a reputation for being seasonal, hearty, and comforting.", "main/app", new String[]{"4 center-cut bacon strips", "2 celery ribs, chopped","1 large onion, chopped","1 garlic clove, minced","3 small potatoes, peeled and cubed","1 cup water","1 bottle (8 ounces) clam juice","3 teaspoons reduced-sodium chicken bouillon granules","1/4 teaspoon white pepper"," 1/4 teaspoon dried thyme","1/3 cup all-purpose flour","2 cups fat-free half-and-half, divided","2 cans (6-1/2 ounces each) chopped clams, undrained"} , "In a Dutch oven, cook bacon over medium heat until crisp. Remove to paper towels to drain; set aside. Saute the celery, onion and garlic in the drippings until tender. Stir in the potatoes, water, clam juice, bouillon, pepper and thyme. Bring to a boil. Reduce heat; simmer, uncovered, for 15-20 minutes or until potatoes are tender., In a small bowl, combine flour and 1 cup half-and-half until smooth. Gradually stir into soup. Bring to a boil; cook and stir for 1-2 minutes or until thickened., Stir in clams and remaining half-and-half; heat through (do not boil). Crumble the reserved bacon; sprinkle over each serving. Yield: 5 servings.", "One-pot comfort foods");

        Recipe recipe3a = new Recipe("NEW ENGLAND CLAM CHOWDER2", "With its fertile farmland, coastal waters, and flavorful influence from generations of immigrants, it’s no surprise that New England cuisine has a reputation for being seasonal, hearty, and comforting.", "main/app", new String[]{"4 center-cut bacon strips", "2 celery ribs, chopped","1 large onion, chopped","1 garlic clove, minced","3 small potatoes, peeled and cubed","1 cup water","1 bottle (8 ounces) clam juice","3 teaspoons reduced-sodium chicken bouillon granules","1/4 teaspoon white pepper"," 1/4 teaspoon dried thyme","1/3 cup all-purpose flour","2 cups fat-free half-and-half, divided","2 cans (6-1/2 ounces each) chopped clams, undrained"} , "In a Dutch oven, cook bacon over medium heat until crisp. Remove to paper towels to drain; set aside. Saute the celery, onion and garlic in the drippings until tender. Stir in the potatoes, water, clam juice, bouillon, pepper and thyme. Bring to a boil. Reduce heat; simmer, uncovered, for 15-20 minutes or until potatoes are tender., In a small bowl, combine flour and 1 cup half-and-half until smooth. Gradually stir into soup. Bring to a boil; cook and stir for 1-2 minutes or until thickened., Stir in clams and remaining half-and-half; heat through (do not boil). Crumble the reserved bacon; sprinkle over each serving. Yield: 5 servings.", "One-pot comfort foods");

        Recipe recipe4 = new Recipe("Slow cooker Korean tacos", "A Mexican-Korean fusion item, Korean tacos are made with Korean ingredients like kimchee and bulgogi, all on a Mexican corn tortilla.", "main", new String[]{"2 pounds boneless pork loin, cut into 4 pieces", "1 cup hoisin sauce","3 cloves garlic, minced","3 green onions, thinly sliced, plus extra for garnish","3 tsp ground ginger","1: 16- ounce package of coleslaw or broccoli slaw mix","3 tbsp rice wine vinegar","2 tbsp brown sugar","Small tortillas or hot cooked white rice for serving, or brown rice"} , "Add the pieces of pork in the insert/bowl of your slow cooker. Add hoisin sauce, garlic, green onions, and ground ginger. Toss each piece of pork a few times to fully coat with the sauce and spices. Cover and cook on low for 8 to 9 hours. Prior to serving, in a bowl, toss coleslaw or broccoli slaw mix with rice wine vinegar and brown sugar. Remove pork from slow cooker and shred. Place pork back into the sauce and toss to coat. Serve in warmed tortillas with slaw on top or spoon pork onto a bed of rice. Garnish with sliced green onions, if desired. Store leftovers in an airtight container for up to 5 days.", "Fusion Recipes");

        Recipe recipe4a = new Recipe("Slow cooker Korean tacos2", "A Mexican-Korean fusion item, Korean tacos are made with Korean ingredients like kimchee and bulgogi, all on a Mexican corn tortilla.", "main", new String[]{"2 pounds boneless pork loin, cut into 4 pieces", "1 cup hoisin sauce","3 cloves garlic, minced","3 green onions, thinly sliced, plus extra for garnish","3 tsp ground ginger","1: 16- ounce package of coleslaw or broccoli slaw mix","3 tbsp rice wine vinegar","2 tbsp brown sugar","Small tortillas or hot cooked white rice for serving, or brown rice"} , "Add the pieces of pork in the insert/bowl of your slow cooker. Add hoisin sauce, garlic, green onions, and ground ginger. Toss each piece of pork a few times to fully coat with the sauce and spices. Cover and cook on low for 8 to 9 hours. Prior to serving, in a bowl, toss coleslaw or broccoli slaw mix with rice wine vinegar and brown sugar. Remove pork from slow cooker and shred. Place pork back into the sauce and toss to coat. Serve in warmed tortillas with slaw on top or spoon pork onto a bed of rice. Garnish with sliced green onions, if desired. Store leftovers in an airtight container for up to 5 days.", "Fusion Recipes");

        String[] cuisine1 = {recipe1.getName(), recipe1a.getName()}; // East Coast-style meals
        String[] cuisine2 = {recipe2.getName(), recipe2a.getName()}; // West Coast-style meals
        String[] cuisine3 = {recipe3.getName(), recipe3a.getName()}; // One-pot comfort foods
        String[] cuisine4 = {recipe4.getName(), recipe4a.getName()}; // Fusion Recipes


        mRecipeListview = (ListView) findViewById(R.id.recipeListView);


        Intent intent = getIntent();
        String cuisine = intent.getStringExtra("cuisine");


        if (cuisine.contains("Fusion Recipes")) {
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cuisine4);
            mRecipeListview.setAdapter(adapter);
        } else if (cuisine.contains("One-pot comfort foods")) {
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cuisine3);
            mRecipeListview.setAdapter(adapter);
        } else if (cuisine.contains("West Coast-style meals")) {
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cuisine2);
            mRecipeListview.setAdapter(adapter);
        } else if (cuisine.contains("East Coast-style meals")) {
            ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, cuisine1);
            mRecipeListview.setAdapter(adapter);
        }






    }

}
