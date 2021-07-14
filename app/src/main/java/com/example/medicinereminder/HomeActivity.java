package com.example.medicinereminder;

import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.TaskStackBuilder;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.medicinereminder.databinding.ActivityHomeBinding;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity {
  private ActivityHomeBinding binding;
  private AppBarConfiguration appBarConfiguration;
  private DrawerLayout drawerLayout;
  private Toolbar toolbar;
  private NavigationView navigationView;
  private NavController navController;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    binding = ActivityHomeBinding.inflate(getLayoutInflater());
    View view = binding.getRoot();

    setContentView(view);

    instantiate();
    initialize();
    listen();
    load();
  }

  @Override
  public boolean onSupportNavigateUp() {
    NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home);
    return NavigationUI.navigateUp(navController, appBarConfiguration) || super.onSupportNavigateUp();
  }

  private void instantiate(){
    navigationView = findViewById(R.id.nav_view);
    navController = Navigation.findNavController(this,R.id.nav_host_fragment_content_home);

  }

  private void initialize(){
    setSupportActionBar(binding.appBarHome.toolbar);

    appBarConfiguration = new AppBarConfiguration.Builder(
            R.id.medicineReminder
    ).setOpenableLayout(binding.drawerLayout).build();

    NavigationUI.setupActionBarWithNavController(this,navController,appBarConfiguration);
    NavigationUI.setupWithNavController(navigationView,navController);

    navigationView.setItemIconTintList(null);
  }

  private void listen(){

  }

  private void load(){

  }
}