package com.safaorhan.text

import androidx.annotation.StringRes

sealed class FormatArg {
    class Literal(val value: Any) : FormatArg()
    class StringResource(@StringRes val id: Int) : FormatArg()
}
