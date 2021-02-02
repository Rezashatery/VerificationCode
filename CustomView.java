package ir.faash.citypay.mobile.activity.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.StyleableRes;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;

import ir.faash.citypay.mobile.shatoot.R;

public class CustomView extends LinearLayout {

    @StyleableRes
    int index0 = 0;
    @StyleableRes
    int index1 = 1;
    @StyleableRes
    int index2 = 2;
    @StyleableRes
    int index3 = 3;
    @StyleableRes
    int index4 = 4;

    EditText num1;
    EditText num2;
    EditText num3;
    EditText num4;
    EditText num5;
   // Button atcive;
    OnClickListener listener;
    String activationCode;
    Typeface tf;
    public CustomView(Context context, AttributeSet attrs) {
        super(context,attrs);
        init(context,attrs);
    }

    private void init(Context context,AttributeSet attrs) {
        inflate(context, R.layout.custom_view, this);

        int[] sets = {R.attr.num1, R.attr.num2, R.attr.num3, R.attr.num4, R.attr.num5};
        TypedArray typedArray = context.obtainStyledAttributes(sets);
        CharSequence artist = typedArray.getText(index0);
        CharSequence track = typedArray.getText(index1);
        CharSequence buyButton = typedArray.getText(index2);
        typedArray.recycle();
        tf = Typeface.createFromAsset(context.getAssets(), "fonts/font2.ttf");
        initComponents();
        getText();
//        setArtistText(artist);
//        setTrackText(track);
//        setButton(buyButton);
    }

    private void initComponents() {
        num1 = findViewById(R.id.edDigit1);
        num2 = findViewById(R.id.edDigit2);
        num3 = findViewById(R.id.edDigit3);
        num4 = findViewById(R.id.edDigit4);
        num5 = findViewById(R.id.edDigit5);
        num1.setTypeface(tf);
        num2.setTypeface(tf);
        num3.setTypeface(tf);
        num4.setTypeface(tf);
        num5.setTypeface(tf);
     //   atcive = findViewById(R.id.btnApprove);

    }


    public void getText() {

        num1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (num1.getText().toString().equals("")) {
                    num1.requestFocus();
                } else {
                    num2.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        num2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (num2.getText().toString().equals("")) {
                    num2.requestFocus();
                } else {
                    num3.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        num3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (num3.getText().toString().equals("")) {
                    num3.requestFocus();
                } else {
                    num4.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        num4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (num4.getText().toString().equals("")) {
                    num4.requestFocus();
                } else {
                    num5.requestFocus();

                }


            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        num5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!num5.getText().toString().equals("")) {

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }


    public String listen() {

            activationCode = num1.getText().toString() + num2.getText().toString() +
                num3.getText().toString() + num4.getText().toString() +
                num5.getText().toString();


        return activationCode;

    }

//    public void setArtistText(CharSequence value) {
//        artistText.setText(value);
//    }
//
//    public CharSequence getTrackText() {
//        return trackText.getText();
//    }
//
//    public void setTrackText(CharSequence value) {
//        trackText.setText(value);
//    }
//
//    public CharSequence getButton() {
//        return buyButton.getText();
//    }
//
//    public void setButton(CharSequence value) {
//        buyButton.setText(value);
//    }
}
