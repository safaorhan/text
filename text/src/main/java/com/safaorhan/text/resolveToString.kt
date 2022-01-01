package com.safaorhan.text

import android.content.res.Resources
import com.safaorhan.text.FormatArg.Literal
import com.safaorhan.text.FormatArg.StringResource

fun Text.resolveToString(resources: Resources) = when {
    string != null -> string
    stringRes != null -> resources.getString(stringRes.id)
    formattedString != null -> formattedString.resolveToString(resources)
    else -> throw Exception("Can't convert this Text to String.")
}

fun FormattedString.resolveToString(resources: Resources): String {
    val args = formatArgs.map { arg ->
        when (arg) {
            is Literal -> arg.value
            is StringResource -> resources.getString(arg.id)
        }
    }.toTypedArray()

    return resources.getString(stringResource.id, *args)
}