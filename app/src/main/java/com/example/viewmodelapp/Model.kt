package com.example.viewmodelapp

import android.view.View
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

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