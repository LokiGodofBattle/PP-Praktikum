class HeatingSystem(val strategy: HeatingStrategy) : TemperatureObserver(){
    var last10measurements = mutableListOf<Float>()

    override fun update(temperatur: Float) {

        last10measurements.add(temperatur)
        if(last10measurements.size == 10){
            last10measurements.removeAt(0)
            if(strategy.needsHeating(last10measurements)) println("Brauche Heizung!!")
        }
    }
}