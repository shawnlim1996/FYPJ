package com.lorentzos.swipecards;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class FeedbackTest extends Activity {

    Button btn;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn10;
    Button btn11;
    ImageButton btn12;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_feedback_test);


        btn = (Button) findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                a.setSelected(!a.isSelected());

                if (a.isSelected()) {
                    btn.setBackgroundResource(R.drawable.lightsmile);
                } else {
                    btn.setBackgroundResource(R.drawable.smile);
                }


                if (a.isSelected()) {
                    btn1.setBackgroundResource(R.drawable.normal);
                    btn2.setBackgroundResource(R.drawable.bad);
                }
            }
        });

        btn1 = (Button) findViewById(R.id.button3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {
                b.setSelected(!b.isSelected());

                if (b.isSelected()) {
                    btn1.setBackgroundResource(R.drawable.lightnormal1);
                } else {
                    btn1.setBackgroundResource(R.drawable.normal);
                }
                if (b.isSelected()) {
                    btn.setBackgroundResource(R.drawable.smile);
                    btn2.setBackgroundResource(R.drawable.bad);
                }
            }
        });

        btn2 = (Button) findViewById(R.id.button4);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                c.setSelected(!c.isSelected());

                if (c.isSelected()) {
                    btn2.setBackgroundResource(R.drawable.lightbad1);
                } else {
                    btn2.setBackgroundResource(R.drawable.bad);
                }

                if (c.isSelected()) {
                    btn1.setBackgroundResource(R.drawable.normal);
                    btn.setBackgroundResource(R.drawable.smile);
                }
            }
        });


        btn3 = (Button) findViewById(R.id.button5);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View d) {
                d.setSelected(!d.isSelected());


                if (d.isSelected()) {
                    btn3.setBackgroundResource(R.drawable.lightsmile);
                } else {
                    btn3.setBackgroundResource(R.drawable.smile);
                }


                if (d.isSelected()) {
                    btn4.setBackgroundResource(R.drawable.normal);
                    btn5.setBackgroundResource(R.drawable.bad);
                }
            }
        });

        btn4 = (Button) findViewById(R.id.button6);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                e.setSelected(!e.isSelected());

                if (e.isSelected()) {
                    btn4.setBackgroundResource(R.drawable.lightnormal1);
                } else {
                    btn4.setBackgroundResource(R.drawable.normal);
                }
                if (e.isSelected()) {
                    btn3.setBackgroundResource(R.drawable.smile);
                    btn5.setBackgroundResource(R.drawable.bad);
                }
            }
        });

        btn5 = (Button) findViewById(R.id.button7);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View f) {
                f.setSelected(!f.isSelected());

                if (f.isSelected()) {
                    btn5.setBackgroundResource(R.drawable.lightbad1);
                } else {
                    btn5.setBackgroundResource(R.drawable.bad);
                }

                if (f.isSelected()) {
                    btn4.setBackgroundResource(R.drawable.normal);
                    btn3.setBackgroundResource(R.drawable.smile);
                }
            }
        });

        btn6 = (Button) findViewById(R.id.button8);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View g) {
                g.setSelected(!g.isSelected());

                if (g.isSelected()) {
                    btn6.setBackgroundResource(R.drawable.lightsmile);
                } else {
                    btn6.setBackgroundResource(R.drawable.smile);
                }


                if (g.isSelected()) {
                    btn7.setBackgroundResource(R.drawable.normal);
                    btn8.setBackgroundResource(R.drawable.bad);
                }
            }
        });

        btn7 = (Button) findViewById(R.id.button9);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View h) {
                h.setSelected(!h.isSelected());

                if (h.isSelected()) {
                    btn7.setBackgroundResource(R.drawable.lightnormal1);
                } else {
                    btn7.setBackgroundResource(R.drawable.normal);
                }
                if (h.isSelected()) {
                    btn6.setBackgroundResource(R.drawable.smile);
                    btn8.setBackgroundResource(R.drawable.bad);
                }
            }
        });

        btn8 = (Button) findViewById(R.id.button10);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View i) {
                i.setSelected(!i.isSelected());

                if (i.isSelected()) {
                    btn8.setBackgroundResource(R.drawable.lightbad1);
                } else {
                    btn8.setBackgroundResource(R.drawable.bad);
                }

                if (i.isSelected()) {
                    btn7.setBackgroundResource(R.drawable.normal);
                    btn6.setBackgroundResource(R.drawable.smile);
                }
            }
        });

        btn9 = (Button) findViewById(R.id.button11);

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View j) {
                j.setSelected(!j.isSelected());

                if (j.isSelected()) {
                    btn9.setBackgroundResource(R.drawable.lightsmile);
                } else {
                    btn9.setBackgroundResource(R.drawable.smile);
                }


                if (j.isSelected()) {
                    btn10.setBackgroundResource(R.drawable.normal);
                    btn11.setBackgroundResource(R.drawable.bad);
                }
            }
        });

        btn10 = (Button) findViewById(R.id.button12);

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View k) {
                k.setSelected(!k.isSelected());

                if (k.isSelected()) {
                    btn10.setBackgroundResource(R.drawable.lightnormal1);
                } else {
                    btn10.setBackgroundResource(R.drawable.normal);
                }
                if (k.isSelected()) {
                    btn9.setBackgroundResource(R.drawable.smile);
                    btn11.setBackgroundResource(R.drawable.bad);
                }
            }
        });


        btn11 = (Button) findViewById(R.id.button13);

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View l) {
                l.setSelected(!l.isSelected());

                if (l.isSelected()) {
                    btn11.setBackgroundResource(R.drawable.lightbad1);
                } else {
                    btn11.setBackgroundResource(R.drawable.bad);
                }

                if (l.isSelected()) {
                    btn10.setBackgroundResource(R.drawable.normal);
                    btn9.setBackgroundResource(R.drawable.smile);
                }
            }
        });
    }











    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_feedback_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void Hello12(View v){

        Toast.makeText(getApplicationContext(), " Thank you for your feedback.", Toast.LENGTH_SHORT).show();
    }


}
