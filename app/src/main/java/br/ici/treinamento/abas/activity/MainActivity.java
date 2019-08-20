package br.ici.treinamento.abas.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

import br.ici.treinamento.abas.R;
import br.ici.treinamento.abas.fragment.AltaFragment;
import br.ici.treinamento.abas.fragment.HomeFragment;
import br.ici.treinamento.abas.fragment.InscricaoFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SmartTabLayout smartTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        smartTabLayout = findViewById(R.id.viewPagerTab);

        //Aplica configurações na Action Bar
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("YouTube");

        //configurar abas
        FragmentPagerItemAdapter adapter =
                new FragmentPagerItemAdapter (getSupportFragmentManager(), FragmentPagerItems.with(this)
                        .add("Home", HomeFragment.class)
                        .add("Inscrições", InscricaoFragment.class)
                        .add("Alta", AltaFragment.class)
                        .create());


        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);

    }


}
