package br.com.gft.aprendaingles.fragment;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import br.com.gft.aprendaingles.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnimaisFragment extends Fragment implements View.OnClickListener {

    private MediaPlayer mediaPlayer;
    private ImageView imageCao, imageGato, imageOvelha, imageLeao, imageMacaco, imageVaca;


    public AnimaisFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_animais, container, false);

        imageCao = view.findViewById(R.id.imageCao);
        imageGato = view.findViewById(R.id.imageGato);
        imageVaca = view.findViewById(R.id.imageVaca);
        imageMacaco = view.findViewById(R.id.imageMacaco);
        imageLeao = view.findViewById(R.id.imageLeao);
        imageOvelha = view.findViewById(R.id.imageOvelha);

        imageCao.setOnClickListener(this);
        imageGato.setOnClickListener(this);
        imageLeao.setOnClickListener(this);
        imageMacaco.setOnClickListener(this);
        imageVaca.setOnClickListener(this);
        imageOvelha.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.imageCao:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dog);
                tocarSom();
                break;
            case R.id.imageGato:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cat);
                tocarSom();
                break;
            case R.id.imageVaca:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.cow);
                tocarSom();
                break;
            case R.id.imageLeao:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.lion);
                tocarSom();
                break;
            case R.id.imageMacaco:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.monkey);
                tocarSom();
                break;
            case R.id.imageOvelha:
                mediaPlayer = MediaPlayer.create(getActivity(), R.raw.sheep);
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
