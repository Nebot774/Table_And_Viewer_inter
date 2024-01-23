package com.example.table_viewpager_2_inter;

import android.view.View;

import androidx.viewpager.widget.ViewPager;

public class DepthPageTransformer implements ViewPager.PageTransformer {
    private static final float MIN_SCALE = 0.75f;

    public void transformPage(View view, float position) {
        int pageWidth = view.getWidth();

        if (position < -1) { // [-Infinity,-1)
            // Esta página está fuera de la pantalla a la izquierda.
            view.setAlpha(0);

        } else if (position <= 0) { // [-1,0]
            // Usa la posición predeterminada.
            view.setAlpha(1);
            view.setTranslationX(0);
            view.setScaleX(1);
            view.setScaleY(1);

        } else if (position <= 1) { // (0,1]
            // Desvanece la página.
            view.setAlpha(1 - position);

            // Contrarresta el desplazamiento deslizable.
            view.setTranslationX(pageWidth * -position);

            // Escala la página hacia abajo (entre MIN_SCALE y 1)
            float scaleFactor = MIN_SCALE
                    + (1 - MIN_SCALE) * (1 - Math.abs(position));
            view.setScaleX(scaleFactor);
            view.setScaleY(scaleFactor);

        } else { // (1,+Infinity]
            // Esta página está fuera de la pantalla a la derecha.
            view.setAlpha(0);
        }
    }
}

