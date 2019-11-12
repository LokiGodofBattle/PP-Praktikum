class Thermometer(val sensor: Sensor, val messungen : Int){
    var observers = mutableListOf<TemperatureObserver>()

    fun messen(){
        for(i in 0 until messungen){
            notifyObservers(sensor.getTemperatur())
        }
    }

    fun notifyObservers(temperatur : Float){
        for(o in observers){
            o.update(temperatur)
        }
    }
}