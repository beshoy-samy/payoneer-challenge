package com.paynoneer.core.domain.models

sealed class ResultModel<out T : Any> {

    data class SuccessResult<out T : Any>(val data: T) : ResultModel<T>()

    data class ErrorResult(val throwable: Throwable?, val message: String? = null) :
        ResultModel<Nothing>()

    object Progress : ResultModel<Nothing>()

    object Idle : ResultModel<Nothing>()
}