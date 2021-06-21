package com.raywenderlich.android.imet.ui.list

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MediatorLiveData
import android.arch.lifecycle.MutableLiveData
import com.raywenderlich.android.imet.IMetApp
import com.raywenderlich.android.imet.data.model.People

/**
 * Created by abhijit on 20,Jun,2021.
 */
class PeoplesListViewModel(application: Application) : AndroidViewModel(application) {

    private val peopleRepository = getApplication<IMetApp>().getPeopleRepository()
    private val peopleList = MediatorLiveData<List<People>>()

    init {
        getAllPeople()
    }

    fun getPeopleList(): LiveData<List<People>> {
        return peopleList
    }

    fun getAllPeople() {

        peopleList.addSource(peopleRepository.getAllPeople()) { peoples ->
            peopleList.postValue(peoples)
        }
    }


}