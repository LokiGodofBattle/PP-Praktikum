import kotlin.random.Random

class UpDownSensor(var value : Float = 15f) : Sensor(){
    override fun getTemperatur(): Float {
         value += Random.nextDouble(-2.0, 2.0).toFloat()
        return value
    }
}