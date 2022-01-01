package com.safaorhan.text

import com.safaorhan.text.FormatArg.StringResource

fun String.asText() = Text(string = this)

fun StringResource.asText() = Text(stringRes = this)

fun FormattedString.asText() = Text(formattedString = this)