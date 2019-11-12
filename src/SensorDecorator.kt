abstract class SensorDecorator (var sensor: Sensor) : Sensor(){
    override fun getTemperatur(): Float {
        return sensor.getTemperatur()
    }
}