package com.example.tugasrycycle;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;

import java.util.ArrayList;

public class AnimalData {
    static Resources res = MainActivity.getResource();
    private static String name[] = {
        "Singa",
        "Harimau",
        "Semut",
        "Gajah",
        "Elang",
        "Paus Bungkuk",
        "Hiu",
        "Sapi",
        "Ayam",
        "Panda"
    };

    private static String details[] = {
            res.getString(R.string.animal_singa),
            res.getString(R.string.animal_harimau),
            res.getString(R.string.animal_semut),
            res.getString(R.string.animal_gajah),
            res.getString(R.string.animal_elang),
            res.getString(R.string.animal_pausBungkuk),
            res.getString(R.string.animal_hiu),
            res.getString(R.string.animal_sapi),
            res.getString(R.string.animal_ayam),
            res.getString(R.string.animal_panda),
    };

    private static int image[] = {
            R.drawable.singa,
            R.drawable.harimau,
            R.drawable.semut,
            R.drawable.gajah,
            R.drawable.elang,
            R.drawable.paus,
            R.drawable.hiu,
            R.drawable.sapi,
            R.drawable.ayam,
            R.drawable.panda,
    };

    static ArrayList<Animal> getListData() {
        ArrayList<Animal> list = new ArrayList<>();
        for (int position = 0; position < name.length; position++) {
            Animal anim = new Animal(name[position], details[position], image[position]);
            list.add(anim);
        }
        return list;
    }
}
