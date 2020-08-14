package com.potterthecoder.toast;

import android.content.Context;
import android.os.Build;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.content.ContextCompat;

public class UtilToast {

    public static int TOAST_SQUARE = 0;
    public static int TOAST_OVAL = 1;

    public static void showToast(Context ctx, int type, String str) {
        Toast toast = Toast.makeText(ctx, str, Toast.LENGTH_SHORT);
        View vwToast = toast.getView();
        if (type == TOAST_SQUARE) {
            vwToast.setBackground(ContextCompat.getDrawable(ctx, R.drawable.bg_toast_s));
        } else if (type == TOAST_OVAL) {
            vwToast.setBackground(ContextCompat.getDrawable(ctx, R.drawable.bg_toast_o));
        }
        vwToast.setPadding(50, 20, 50, 20);
        TextView tvToast = (TextView) vwToast.findViewById(android.R.id.message);
        tvToast.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            tvToast.setTextColor(ctx.getResources().getColor(R.color.colorPrimary));
        } else {
            tvToast.setTextColor(ContextCompat.getColor(ctx, R.color.colorPrimary));
        }
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 50);
        toast.show();
    }

}