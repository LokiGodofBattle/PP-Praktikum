class WeatherReport : TemperatureObserver(){
    var werte = mutableListOf<Float>()
    override fun update(temperatur: Float) {
        werte.add(temperatur)
        if(werte.size >= 100){
            for(w in werte){
                println(w)
            }
        }
    }
}