package com.safaorhan.text

import androidx.annotation.StringRes

sealed class FormatArg {
    data class Literal(val value: Any) : FormatArg()
    data class StringResource(@StringRes val id: Int) : FormatArg()
}
