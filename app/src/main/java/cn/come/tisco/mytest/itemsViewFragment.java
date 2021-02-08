package cn.come.tisco.mytest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class itemsViewFragment extends Fragment {
    private int img[] ={R.id.birdview,R.id.fishview,R.id.cowview,R.id.catview,R.id.dogview,R.id.horseview};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pictures,container,false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        for(int i=0;i<img.length;i++){
            final ImageView image_final=(ImageView)this.getActivity().findViewById(R.id.things_bird) ;
            ImageView iv=(ImageView)this.getActivity().findViewById(img[i]);

            if(iv!=null){
                iv.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        ImageView ivew1=(ImageView)v;
                        image_final.setImageDrawable(ivew1.getDrawable());
                    }
                });
            }

        }
    }
}
