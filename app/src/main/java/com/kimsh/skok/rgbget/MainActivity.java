package com.kimsh.skok.rgbget;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

/*
 * ####################################
 * 파일명 : rgbget
 * 작성자 : 김석현
 * 작성일 : 2018.07.08
 * 업무 : 색상의 R G B 값과 16진수를 사용자에게 제공한다.
 * ####################################
 */


public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_main);
        final TextView Rtext = (TextView) findViewById(R.id.Rtext);         // R 의 0~255 값
        final TextView Gtext = (TextView) findViewById(R.id.Gtext);         // G 의 0~255 값
        final TextView Btext = (TextView) findViewById(R.id.Btext);         // B 의 0~255 값
        final TextView Kim_Label = (TextView) findViewById(R.id.Kim);       // "by 김기사"
        final TextView HexText = (TextView) findViewById(R.id.HexText);    // 16진수로 나타낸 색상값
        final TextView HexLabel = (TextView) findViewById(R.id.Hexlabel);   // "HEX:" (라벨)
        SeekBar sbR = (SeekBar) findViewById(R.id.RSeek);                   // R 의 seekbar
        SeekBar sbG = (SeekBar) findViewById(R.id.GSeek);                   // G 의 seekbar
        SeekBar sbB = (SeekBar) findViewById(R.id.BSeek);                   // B 의 seekbar

        final RelativeLayout mLayout = (RelativeLayout) findViewById(R.id.Main);    // layout 의 색상 변경을 위해 선언

        mLayout.setBackgroundColor(Color.rgb(0, 0, 0));
        Kim_Label.setTextColor(Color.rgb(255, 255, 255));
        Rtext.setTextColor(Color.rgb(255, 255, 255));
        Gtext.setTextColor(Color.rgb(255, 255, 255));
        Btext.setTextColor(Color.rgb(255, 255, 255));
        HexLabel.setTextColor(Color.rgb(255, 255, 255));
        HexText.setTextColor(Color.rgb(255, 255, 255));             // 글자들의 초기 색상 (R:255,G:255,B:255) -> White

        // sbR(R seekbar) 에 따른 변화 리스너
        sbR.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Rtext.setText(Integer.toString(progress));
                String HexR = "00";
                String HexG = "00";
                String HexB = "00";  // RGB 에 따른 16진수 표기를 위해 R/G/B 로 나눠서 String 값으로 표기한다
                int R = Integer.parseInt(String.valueOf(Rtext.getText()));
                int G = Integer.parseInt(String.valueOf(Gtext.getText()));
                int B = Integer.parseInt(String.valueOf(Btext.getText()));
                if (R < 16) {
                    HexR = "0" + Integer.toHexString(R);
                } else {
                    HexR = Integer.toHexString(R);
                }
                if (G < 16) {
                    HexG = "0" + Integer.toHexString(G);
                } else {
                    HexG = Integer.toHexString(G);
                }
                if (B < 16) {
                    HexB = "0" + Integer.toHexString(B);
                } else {
                    HexB = Integer.toHexString(B);
                }
                HexText.setText(HexR + HexG + HexB);


                HexLabel.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));
                HexText.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));
                Rtext.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));
                Gtext.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));
                Btext.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));
                Kim_Label.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));      // 색상을 눈에 띄게 하기위한 반대 색상 적용

                mLayout.setBackgroundColor(Color.rgb(R, G, B));                                     // R,G,B 값에 따른 배경 색상 조절
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        // sbG(G seekbar) 에 따른 변화 리스너
        sbG.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Gtext.setText(Integer.toString(progress));
                String HexR = "00";
                String HexG = "00";
                String HexB = "00";  // RGB 에 따른 16진수 표기를 위해 R/G/B 로 나눠서 String 값으로 표기한다
                int R = Integer.parseInt(String.valueOf(Rtext.getText()));
                int G = Integer.parseInt(String.valueOf(Gtext.getText()));
                int B = Integer.parseInt(String.valueOf(Btext.getText()));
                if (R < 16) {
                    HexR = "0" + Integer.toHexString(R);
                } else {
                    HexR = Integer.toHexString(R);
                }
                if (G < 16) {
                    HexG = "0" + Integer.toHexString(G);
                } else {
                    HexG = Integer.toHexString(G);
                }
                if (B < 16) {
                    HexB = "0" + Integer.toHexString(B);
                } else {
                    HexB = Integer.toHexString(B);
                }

                HexText.setText(HexR + HexG + HexB);

                HexLabel.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));
                HexText.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));
                Rtext.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));
                Gtext.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));
                Btext.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));
                Kim_Label.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));      // 색상을 눈에 띄게 하기위한 반대 색상 적용

                mLayout.setBackgroundColor(Color.rgb(R, G, B));                                     // R,G,B 값에 따른 배경 색상 조절
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        // sbB(B seekbar) 에 따른 변화 리스너
        sbB.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Btext.setText(Integer.toString(progress));
                String HexR = "00";
                String HexG = "00";
                String HexB = "00";  // RGB 에 따른 16진수 표기를 위해 R/G/B 로 나눠서 String 값으로 표기한다
                int R = Integer.parseInt(String.valueOf(Rtext.getText()));
                int G = Integer.parseInt(String.valueOf(Gtext.getText()));
                int B = Integer.parseInt(String.valueOf(Btext.getText()));
                if (R < 16) {
                    HexR = "0" + Integer.toHexString(R);
                } else {
                    HexR = Integer.toHexString(R);
                }
                if (G < 16) {
                    HexG = "0" + Integer.toHexString(G);
                } else {
                    HexG = Integer.toHexString(G);
                }
                if (B < 16) {
                    HexB = "0" + Integer.toHexString(B);
                } else {
                    HexB = Integer.toHexString(B);
                }
                HexText.setText(HexR + HexG + HexB);

                HexLabel.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));
                HexText.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));
                Rtext.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));
                Gtext.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));
                Btext.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));
                Kim_Label.setTextColor(Color.rgb(255 - R, 255 - G, 255 - B));      // 색상을 눈에 띄게 하기위한 반대 색상 적용

                mLayout.setBackgroundColor(Color.rgb(R, G, B));                                     // R,G,B 값에 따른 배경 색상 조절
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }
}