package cn.come.tisco.mytest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowMetrics;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

//测试

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm=getSupportFragmentManager();
        Fragment frag=fm.findFragmentById(R.id.thirdfragment);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width=dm.widthPixels;
        int height=dm.heightPixels;

        if(height>width){
            if(frag==null){
                fm.beginTransaction().add(R.id.thirdfragment,new itemsViewFragment()).commitNow();
            }
        }
        else{
            fm.beginTransaction().remove(frag).commitNow();
        }
    }


//    @Override
//    protected void onStart() {
//        super.onStart();
//        for(int i=0;i<img.length;i++){
//            final ImageView image_final=(ImageView)findViewById(R.id.things_bird) ;
//            ImageView iv=(ImageView)findViewById(img[i]);
//
//            if(iv!=null){
//                iv.setOnClickListener(new View.OnClickListener(){
//                    @Override
//                    public void onClick(View v) {
//                        ImageView ivew1=(ImageView)v;
//                        image_final.setImageDrawable(ivew1.getDrawable());
//                    }
//                });
//            }
//
//        }
//    }
}