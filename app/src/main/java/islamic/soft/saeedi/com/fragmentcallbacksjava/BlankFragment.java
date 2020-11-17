package islamic.soft.saeedi.com.fragmentcallbacksjava;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BlankFragment extends Fragment
{
    FragmentListner mListner;

    @Override
    public void onAttach(@NonNull Context context)
    {
        super.onAttach(context);
        mListner = (FragmentListner) context;
    }

    public BlankFragment()
    {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);

        Button btn = rootView.findViewById(R.id.btn);
        btn.setOnClickListener(view ->
        {
            if (mListner != null)
            {
                mListner.sendMessageToActivity("Message From Fragment");
            }
        });
        return rootView;
    }

    public interface FragmentListner
    {
        void sendMessageToActivity(String msg);
    }
}