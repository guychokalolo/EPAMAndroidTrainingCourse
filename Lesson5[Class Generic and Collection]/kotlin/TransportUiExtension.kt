package generic

import transport.UiModel
import transport.Transport

fun Transport.mapUiModel() : UiModel{
    return UiModel(name, wheelCount, year)
}