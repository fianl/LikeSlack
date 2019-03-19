package viewModel

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableArrayList
import data.UserData

class UserListViewModel: ViewModel() {
    private var userList = ObservableArrayList<UserData>()

    fun setList(userList: ArrayList<UserData>) {
        this.userList.clear()
        this.userList.addAll(userList)
    }

    fun setUserData(idx: Int, data: UserData) {
        userList.set(idx, data)
    }

    fun addUserData(data: UserData) {
        userList.add(data)
    }

    fun removeUserData(idx: Int) {
        userList.removeAt(idx)
    }

    fun removeUserData(data: UserData) {
        userList.remove(data)
    }
}