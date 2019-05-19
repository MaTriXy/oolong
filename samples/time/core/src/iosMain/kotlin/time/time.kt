package time

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainLoopDispatcher
import oolong.Oolong
import oolong.Render

fun Time.runtime(render: Render<Time.Msg, Time.Props>) =
    Oolong.runtime(
        init,
        update,
        view,
        render,
        GlobalScope,
        MainLoopDispatcher,
        MainLoopDispatcher
    )
