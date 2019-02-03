package time

import javafx.scene.Parent
import javafx.scene.control.Label
import oolong.Render
import time.Time.RenderModel
import tornadofx.View
import tornadofx.label
import tornadofx.vbox

class TimeView : View() {

    private lateinit var timeLabel: Label

    override val root: Parent =
        vbox {
            timeLabel = label()
        }

    val render: Render<RenderModel> = { renderModel ->
        val (hour, minutes, seconds) = renderModel
        timeLabel.text = "$hour:$minutes:$seconds"
    }

}