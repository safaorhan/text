package com.safaorhan.text

import com.safaorhan.text.FormatArg.StringResource

data class FormattedString(
    val stringResource: StringResource,
    val formatArgs: List<FormatArg>
)
