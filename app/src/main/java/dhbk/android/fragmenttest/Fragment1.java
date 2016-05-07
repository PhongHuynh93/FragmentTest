package dhbk.android.fragmenttest;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
// TODO: 5/7/16
public class Fragment1 extends Fragment {
    private static final String ARG_NAME = "name";
    private String mName;

    public static Fragment1 newInstance(String name) {
        Fragment1 fragment = new Fragment1();

        Bundle args = new Bundle();
        args.putString(ARG_NAME, name);

        fragment.setArguments(args);
        return fragment;
    }

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mName = getArguments().getString(ARG_NAME);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView nameTV = (TextView) getActivity().findViewById(R.id.name);
        nameTV.setText(mName);
    }

    public void changeTVFrag1() {
        TextView nameTV = (TextView) getActivity().findViewById(R.id.name);
        nameTV.setText("Phong");
    }
}
