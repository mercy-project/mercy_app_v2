package com.content.mercy.main.fragment

import android.content.Context
import com.content.mercy.BasePresenter
import com.content.mercy.BaseView
import com.content.mercy.model.Friend


interface FriendContract {

    interface View : BaseView<Presenter> {
        fun getActivityContext(): Context
    }

    interface Presenter : BasePresenter {
        fun getFriends(): ArrayList<Friend>
        fun showFriendDetail(position: Int)
    }
}