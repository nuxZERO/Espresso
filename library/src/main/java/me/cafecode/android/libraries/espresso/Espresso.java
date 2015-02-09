package me.cafecode.android.libraries.espresso;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Natthawut Hemathulin on 2/9/15 AD.
 * Email: natthawut1991@gmail.com
 */
public class Espresso {

    public static void hello(Context context) {
        Toast.makeText(context, "Hello Espresso", Toast.LENGTH_SHORT).show();
    }

}
