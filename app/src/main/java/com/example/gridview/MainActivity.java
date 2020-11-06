package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvSanPham;
    ArrayList<SanPham> arraySanPham;
    SanPhamAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        adapter = new SanPhamAdapter(this, R.layout.dong_san_pham, arraySanPham);
        gvSanPham.setAdapter(adapter);
    }

    private void AnhXa() {
        gvSanPham = (GridView) findViewById(R.id.gridviewHinhanh);
        arraySanPham = new ArrayList<>();
        arraySanPham.add(new SanPham("Product Name", R.drawable.anh));
        arraySanPham.add(new SanPham("Product Name", R.drawable.anh));
        arraySanPham.add(new SanPham("Product Name", R.drawable.anh));
        arraySanPham.add(new SanPham("Product Name", R.drawable.anh));
        arraySanPham.add(new SanPham("Product Name", R.drawable.anh));
        arraySanPham.add(new SanPham("Product Name", R.drawable.anh));
        arraySanPham.add(new SanPham("Product Name", R.drawable.anh));
        arraySanPham.add(new SanPham("Product Name", R.drawable.anh));
        arraySanPham.add(new SanPham("Product Name", R.drawable.anh));
    }
}