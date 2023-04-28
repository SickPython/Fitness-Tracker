<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/black">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#000000"
        android:orientation="vertical"
        android:padding="16dp"
        tools:context=".MainActivity">

        <TextView
            android:id="@+id/WaterCalTitleText"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="@string/WaterCalTitleText"
            android:textAlignment="center"
            android:textAppearance="@style/TextAppearance.AppCompat.Body1"
            android:textColor="@color/white"
            android:textSize="30sp"
            android:textStyle="bold"
            android:translationY="50dp" />

        <TextView
            android:id="@+id/EnterCaloriesText"
            android:layout_width="374dp"
            android:layout_height="wrap_content"
            android:text="@string/EnterCaloriesText"
            android:textColor="@color/white"
            android:textSize="28sp"
            android:translationY="150dp" />

        <EditText
            android:id="@+id/CaloriesEditText"
            android:layout_width="350dp"
            android:layout_height="50dp"
            android:inputType="number"
            android:text="@string/EditCaloriesText"
            android:textColor="#FFFFFF"
            android:translationY="150dp"
            android:importantForAutofill="no"
            android:labelFor="@id/CaloriesEditText"
            />

        <TextView
            android:id="@+id/EnterWaterOzText"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="30dp"
            android:text="@string/EnterWaterText"
            android:textColor="#FFFFFF"
            android:textSize="28sp"
            android:translationY="200dp" />

        <EditText
            android:id="@+id/WaterOzEditText"
            android:layout_width="350dp"
            android:layout_height="50dp"
            android:inputType="number"
            android:text="@string/EditWaterText"
            android:textColor="#FFFFFF"
            android:translationY="200dp"
            android:importantForAutofill="no"
            />

        <Button
            android:id="@+id/WaterCalSubmitButton"
            android:layout_width="320dp"
            android:layout_height="wrap_content"
            android:layout_marginTop="20dp"
            android:text="@string/SubmitButtonText"
            android:textColor="@color/white"
            android:textSize="26sp"
            android:translationX="25dp"
            android:translationY="300dp" />

    </LinearLayout>
</androidx.constraintlayout.widget.ConstraintLayout>
