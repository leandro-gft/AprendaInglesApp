package br.com.gft.aprendaingles.fragment;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import br.com.gft.aprendaingles.R;

public class VogaisFragment extends Fragment implements View.OnClickListener {

    private MediaPlayer mediaPlayer;
    private ImageView image_a, image_e, image_i, image_o, image_u;

    public VogaisFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vogais, container, false);

        image_a = view.findViewById(R.id.imageA);
        image_e = view.findViewById(R.id.imageE);
        image_i = view.findViewById(R.id.imageI);
        image_o = view.findViewById(R.id.imageO);
        image_u = view.findViewById(R.id.imageU);

        image_a.setOnClickListener(this);
        image_e.setOnClickListener(this);
        image_i.setOnClickListener(this);
        image_o.setOnClickListener(this);
        image_u.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageA:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.pronouce_a);
                tocarSom();
                break;
            case R.id.imageE:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.pronouce_e);
                tocarSom();
                break;
            case R.id.imageI:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.pronouce_i);
                tocarSom();
                break;
            case R.id.imageO:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.pronouce_o);
                tocarSom();
                break;
            case R.id.imageU:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.pronouce_u);
                tocarSom();
                break;
        }
    }

    public void tocarSom() {
        if (mediaPlayer != null) {
            mediaPlayer.start();

            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mediaPlayer.release();
                }
            });
        }
    }
}
