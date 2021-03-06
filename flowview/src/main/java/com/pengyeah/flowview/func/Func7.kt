package com.pengyeah.flowview.func

/**
 *  Created by pupu on 2020/9/4
 *  佛祖开光，永无bug
 *  God bless U
 */
class Func7 : BaseFuncImpl {

    constructor(initValue: Float, inParamMax: Float) : super(initValue, inParamMax)

    var rate: Float = 0F

    override fun execute(inParam: Float): Float {
        super.execute(inParam)
        val offset = inParam * rate
        if (initValue + offset > 0 && initValue + offset < inParamMax) {
            return initValue + offset
        } else if (initValue + offset <= 0) {
            return 0F
        } else {
            return inParamMax
        }
    }
}