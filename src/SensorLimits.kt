class SensorLimits (decorated : Sensor, val min : Float, val max : Float) : SensorDecorator(decorated){
    override fun getTemperatur(): Float {
        var value = super.getTemperatur()

        while(value<min || value>max){
            value = super.getTemperatur()
        }

        return value
    }
}