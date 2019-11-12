import kotlin.random.Random

class RandomSensor(val min : Double, val max : Double) : Sensor(){
    override fun getTemperatur(): Float {
        return Random.nextDouble(min, max).toFloat()
    }
}