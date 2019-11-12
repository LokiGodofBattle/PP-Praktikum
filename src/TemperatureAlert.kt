class TemperatureAlert(val trigger : Float, val nachricht : String) : TemperatureObserver(){
    override fun update(temperatur : Float) {
        if(temperatur > trigger){
            println(nachricht)
        }
    }
}