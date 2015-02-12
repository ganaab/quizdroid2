package edu.washington.ganaab.quizdroid2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class OverviewActivity extends ActionBarActivity {

    static String[] math1 = {"What is 1 + 2 - 3 * 4 / 5?", "0", "1", "2", "none of the above", "none of the above"};
    static String[] math2 = {"What is 0 / 1 * 2 + 3 - 4?", "0", "1", "2", "-1", "-1"};
    static String[] physics1 = {"A thermometer for measuring very low temperature is called", "pyrometer", "bolometer", "cyrometer", "platinum resistant thermometer", "cyrometer"};
    static String[] physics2 = {"Name the device which converts electric energy into mechanical energy", "alternator", "transformer", "dynamo", "motor", "motor"};
    static String[] marvel1 = {"Which one of these heroes turns into a giant green rage monster?", "Captain America", "Hulk", "Ironman", "Thor", "Hulk"};
    static String[] marvel2 = {"What color is Ironman's suit?", "Red", "Yellow", "Pink", "Green", "Red"};
    static int questionNum = 1;
    static int numberCorrect = 0;
    static String overview;
    static String num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_overview);

        Intent launchedMe = getIntent();
        overview = launchedMe.getStringExtra("description");
        String num = launchedMe.getStringExtra("number");
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new overviewFragment())
                    .commit();
        }
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class overviewFragment extends Fragment {

        public overviewFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_overview_activity2, container, false);

            final TextView over = (TextView) getView().findViewById(R.id.textView3);
            over.setText("This is the " + overview + " section.");

            TextView number = (TextView) getView().findViewById(R.id.textView4);
            number.setText(num);

            Button begin = (Button) getView().findViewById(R.id.button4);
            begin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                Intent nextActivity = new Intent(OverviewActivity.this, QuestionFragment.class);
//                nextActivity.putExtra("countQ", "1");
//                nextActivity.putExtra("correctCount", "0");
//                if (overview.equalsIgnoreCase("math")) {
//                    nextActivity.putExtra("topic", "math"); // topic 0 is math
//                    String[] qa = {"What is 1 + 2 - 3 * 4 / 5?", "0", "1", "2", "undefinable", "0"};
//                    nextActivity.putExtra("questions", qa);
//                } else if (overview.equalsIgnoreCase(("physics"))) {
//                    nextActivity.putExtra("topic", "physics");//  topic 1 is physics
//                    String[] qa = {"A thermometer for measuring very low temperature is called", "pyrometer", "bolometer", "cyrometer", "platinum resistant thermometer", "cyrometer"};
//                    nextActivity.putExtra("questions", qa);
//                } else {
//                    nextActivity.putExtra("topic", "marvel");//  topic 2 is marvel super hero
//                    String[] qa = {"Which one of these heroes turns into a GAINT grEeN rAgE MoNSTER?", "Captain America", "Hulk", "Ironman", "Thor", "Hulk"};
//                    nextActivity.putExtra("questions", qa);
//                }
//
//                if (nextActivity.resolveActivity(getPackageManager()) != null) {
//                    startActivity(nextActivity);
//                }

                    if (overview.equalsIgnoreCase("math")) { // topic 0 is math

                    } else if (overview.equalsIgnoreCase("physics")) { //  topic 1 is physics

                    } else { //  topic 2 is marvel super hero

                    }
                }
            });
            return rootView;
        }

    }
    public static class questionFragment extends Fragment {

        public questionFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_question, container, false);
            return rootView;
        }

    }
    public static class summaryFragment extends Fragment {

        public summaryFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_question, container, false);
            return rootView;
        }

    }

}
