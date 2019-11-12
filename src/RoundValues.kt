import kotlin.math.roundToInt

class RoundValues (decorated : Sensor) : SensorDecorator(decorated){
    override fun getTemperatur(): Float {
        return super.getTemperatur().roundToInt().toFloat()
    }
}