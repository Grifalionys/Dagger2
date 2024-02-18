package com.grifalion.onepiece.core_ui

import androidx.annotation.IdRes

object ContainerId {

    private var _containerId: Int? = null
    internal val containerId
        get() = checkNotNull(_containerId) {
            "Container id not found"
        }

    fun setContainerId(@IdRes id: Int) {
        if (_containerId != null) {
            throw UnsupportedOperationException("Changing the MainActivity fragmentContainer ID is prohibited")
        } else {
            _containerId = id
        }
    }
}