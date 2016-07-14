package me.rk.andses12ass3;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.layout1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_Layout1 fragmentlayout1=new Fragment_Layout1();

                FragmentManager fragmentManager=MainActivity.this.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.frameContainer, fragmentlayout1);
                fragmentTransaction.commit();

            }
        });

        findViewById(R.id.layout2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_Layout2 fragmentlayout2=new Fragment_Layout2();

                FragmentManager fragmentManager=MainActivity.this.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.frameContainer, fragmentlayout2);
                fragmentTransaction.commit();

            }
        });

        findViewById(R.id.layout3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_Layout3 fragmentlayout3=new Fragment_Layout3();

                FragmentManager fragmentManager=MainActivity.this.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.frameContainer, fragmentlayout3);
                fragmentTransaction.commit();

            }
        });

        findViewById(R.id.layout4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment_Layout4 fragmentlayout4=new Fragment_Layout4();

                FragmentManager fragmentManager=MainActivity.this.getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

                fragmentTransaction.replace(R.id.frameContainer, fragmentlayout4);
                fragmentTransaction.commit();

            }
        });
    }
}
