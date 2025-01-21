# ViewModel Counter App

This is a simple counter application built using **Android Jetpack components** such as **ViewModel**, **LiveData**, and **Data Binding**. The app demonstrates how to manage UI-related data in a lifecycle-conscious way, making the app robust and efficient.

---

## Features
- Increment and decrement a counter.
- Automatically update the UI using **LiveData** and **Data Binding**.
- Preserve counter state across configuration changes (e.g., screen rotations) using **ViewModel**.

---

## Tech Stack
- **Language**: Kotlin
- **Architecture Components**: ViewModel, LiveData, Data Binding
- **UI Framework**: Android XML Layouts

---

## Screenshots

![Screenshot_1737433032](https://github.com/user-attachments/assets/72b8a1f9-1650-4cd0-876b-cbc911216ae5)
![Screenshot_1737433035](https://github.com/user-attachments/assets/047e8961-62be-4261-9d4d-43bfddfcd227)



---

## Prerequisites
- Android Studio Bumblebee or later.
- Minimum SDK: 21 (Android 5.0 Lollipop)
- Target SDK: 33 (or the latest available)

---

## Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/aadarshsing/ViewPager2.git
   ```
2. Open the project in Android Studio.
3. Sync the project with Gradle files.
4. Run the app on an emulator or physical device.

---

## Key Components

### 1. **ViewModel**
The `CounterViewModel` class is responsible for holding and managing the counter data. It survives configuration changes, ensuring that the app doesn't lose state when the screen rotates.

```kotlin
class Model : ViewModel() {

    //creating the instance of  "MUTABLELIVEDATA" Class
    //MutableLiveData : Subclass of LiveData that holds and manages Observable data
    var counter = MutableLiveData<Int>()

    init {
        counter.value = 0;
    }



    //Increment the Counter
    fun increment(view: View){
        counter.value = (counter.value)?.plus(1)
    }
}
```

### 2. **LiveData**
- Used to observe and update the counter value in real-time.

### 3. **Data Binding**
- Simplifies UI updates by binding the `LiveData` from `ViewModel` directly to the XML layout.

Example from the `activity_main.xml`:
```xml
<layout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">
    
    <data>
        
        <variable
            name="myViewModel"
            type="com.example.viewmodelapp.Model" />
    </data>



    <androidx.constraintlayout.widget.ConstraintLayout
        android:id="@+id/main"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context=".MainActivity">

        <TextView
            android:id="@+id/textView"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="@{myViewModel.counter.toString()}"
            app:layout_constraintBottom_toBottomOf="parent"
            app:layout_constraintEnd_toEndOf="parent"
            app:layout_constraintStart_toStartOf="parent"
            app:layout_constraintTop_toTopOf="parent" />

        <Button
            android:onClick="@{myViewModel::increment}"
            android:id="@+id/button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="73dp"
            android:text="Increase Counter"
            app:layout_constraintEnd_toEndOf="@+id/textView"
            app:layout_constraintStart_toStartOf="@+id/textView"
            app:layout_constraintTop_toBottomOf="@+id/textView" />

    </androidx.constraintlayout.widget.ConstraintLayout>
</layout>
```

---

## How It Works
1. **ViewModel**:
   - Stores the counter value.
   - Provides methods to increment or decrement the value.

2. **LiveData**:
   - Observes changes in the counter value and updates the UI automatically.

3. **Data Binding**:
   - Binds the `LiveData` and click events directly to the XML layout.

---

## Benefits of Using Jetpack Components
- **ViewModel**: Ensures data persists across configuration changes.
- **LiveData**: Provides an observable data holder that respects lifecycle changes.
- **Data Binding**: Reduces boilerplate code by connecting UI components to data sources.

---


## Author
**Aadarsh Kumar Singh**  
[GitHub Profile](https://github.com/aadarshsing/ViewPager2.git)
