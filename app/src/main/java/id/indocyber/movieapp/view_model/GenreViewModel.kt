package id.indocyber.movieapp.view_model

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.selection.SelectionTracker
import dagger.hilt.android.lifecycle.HiltViewModel
import id.indocyber.api_service.usecase.GetGenresUseCase
import id.indocyber.common.base.BaseResponse
import id.indocyber.common.base.BaseViewModel
import id.indocyber.common.entity.genre.Genre
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GenreViewModel @Inject constructor(
    application: Application,
    val genresUseCase: GetGenresUseCase
) : BaseViewModel(application){
    val genreDataState = MutableLiveData<BaseResponse<List<Genre>>>()
    var selection: SelectionTracker<Long>? = null

    init {
        viewModelScope.launch {
            genresUseCase().collect {
                genreDataState.postValue(it)
            }
        }
    }
}