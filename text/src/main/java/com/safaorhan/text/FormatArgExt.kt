package com.safaorhan.text

import com.safaorhan.text.FormatArg.Literal
import com.safaorhan.text.FormatArg.StringResource

fun Any.asLiteral() = Literal(value = this)

fun Int.asStringResource() = StringResource(id = this)