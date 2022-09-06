package ru.ngrechishkin.cleanarchitectureapp.presentation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameSaveDTO
import ru.ngrechishkin.cleanarchitectureapp.domain.usecase.GetUserNameUseCase
import ru.ngrechishkin.cleanarchitectureapp.domain.usecase.SaveUserNameUseCase
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val saveUserNameUseCase: SaveUserNameUseCase,
    private val getUserNameUseCase: GetUserNameUseCase
) : ViewModel() {

    init {
        Log.e("MyT", "VM created")
    }

    private var resultMutableLiveData = MutableLiveData<String>()
    var liveData: LiveData<String> = resultMutableLiveData

    override fun onCleared() {
        Log.e("MyT", "VM cleared")
        super.onCleared()
    }

    fun save(name: String) {
        val isSuccess = saveUserNameUseCase.execute(UserNameSaveDTO(name))
        resultMutableLiveData.value =  "Is success save? - $isSuccess"
    }

    fun load() {
        val userName = getUserNameUseCase.execute()
        resultMutableLiveData.value = "${userName.firstName} ${userName.lastName}"
    }
}