class SensorLogger (decorated: Sensor) : SensorDecorator(decorated){
    override fun getTemperatur(): Float {
        val value = super.getTemperatur()
        println(value)
        return value
    }
}