import kotlin.math.abs

class IgnoreDuplicates(decorated : Sensor, val toleranz : Float = 1f) : SensorDecorator(decorated){
    var first = true
    var lastValue = 0f

    override fun getTemperatur(): Float {
        if(first){
            var lastValue = super.getTemperatur()
            first = false
            return lastValue
        } else {
            var v2 = super.getTemperatur()
            while(abs(lastValue-v2) <= toleranz){
                v2 = super.getTemperatur()
            }
            lastValue = v2

            return lastValue
        }
    }
}