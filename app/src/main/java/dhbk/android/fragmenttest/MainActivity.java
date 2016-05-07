package dhbk.android.fragmenttest;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// TODO: 5/7/16
public class MainActivity extends AppCompatActivity implements Fragment2.Frag2Interface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.button_fragment, Fragment2.newInstance())
                .commit();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.text_fragment, Fragment1.newInstance("Hiếu đẹp trai"))
                .commit();
    }

    @Override
    public void changeTV() {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.text_fragment);
        if (fragment instanceof Fragment1) {
            Fragment1 fragment1 = (Fragment1)fragment;
            fragment1.changeTVFrag1();
        }
    }
}
