package com.example.a2litvevg4pk2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class EditImageActivity extends AppCompatActivity {

    Bitmap selectedImage;
    ImageView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_image);

        Init();
    }

    private void Init(){
        photoView = findViewById(R.id.imageView);
        selectedImage = MainActivity.selectedImage;
        photoView.setImageBitmap(selectedImage);
//        ImageView photo = findViewById(R.id.imageView);
//        photo.setImageBitmap(MainActivity.selectedImage);
    }

    public void Rotate_90(View view){
        Matrix matrix = new Matrix();
        matrix.setRotate((float) 90);
        selectedImage = Bitmap.createBitmap(selectedImage, 0,0, selectedImage.getWidth(), selectedImage.getHeight(), matrix, false);
        photoView.setImageBitmap(selectedImage);
    }

    public void Reflect(View view){
        Matrix matrix = new Matrix();
        matrix.setScale(-1, 1);
        selectedImage = Bitmap.createBitmap(selectedImage, 0, 0, selectedImage.getWidth(), selectedImage.getHeight(), matrix, true);
        photoView.setImageBitmap(selectedImage);
    }

    public void Rotate_09(View view){
        Matrix matrix = new Matrix();
        matrix.setRotate((float) -90);
        selectedImage = Bitmap.createBitmap(selectedImage, 0,0, selectedImage.getWidth(), selectedImage.getHeight(), matrix, false);
        photoView.setImageBitmap(selectedImage);
    }

    public void Rotate_180(View view){
        Matrix matrix = new Matrix();
        matrix.setRotate((float) 180);
        selectedImage = Bitmap.createBitmap(selectedImage, 0,0, selectedImage.getWidth(), selectedImage.getHeight(), matrix, false);
        photoView.setImageBitmap(selectedImage);
    }
}