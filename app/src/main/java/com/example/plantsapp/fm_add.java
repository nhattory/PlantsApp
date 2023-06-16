package com.example.plantsapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fm_add extends Fragment {

    private static final int REQUEST_IMAGE_CAPTURE = 1;
    Activity mActivity = new Activity();

    public fm_add(Activity activity) {
        this.mActivity = activity;
        // Required empty public constructor
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fm_add2, container, false);

        dispatchTakePictureIntent();
        return rootView;
    }

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(requireActivity().getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            // Lấy ảnh đã chụp từ Intent
            Bundle extras = data.getExtras();
            Bitmap capturedImage = (Bitmap) extras.get("data");

            // Chuyển đến trang khác và truyền ảnh đã chụp
            Intent intent = new Intent(getActivity(), AddPlantActivity.class);
            intent.putExtra("captured_image", capturedImage);
            startActivity(intent);
        }
    }
}
