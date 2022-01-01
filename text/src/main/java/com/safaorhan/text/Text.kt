package com.safaorhan.text

import com.safaorhan.text.FormatArg.StringResource
import java.lang.IllegalArgumentException

data class Text(
    val string: String? = null,
    val stringRes: StringResource? = null,
    val formattedString: FormattedString? = null
) {
    init {
        if (string == null && stringRes == null && formattedString == null) {
            throw IllegalArgumentException(
                "string, stringRes and formattedString cannot be null at the same time"
            )
        }
    }
}
