fun main() {
    var sensor : Sensor = UpDownSensor()
    sensor = SensorLogger(sensor)
    sensor = IgnoreDuplicates(sensor)

    val thermometer = Thermometer(sensor, 10)

    thermometer.observers.add(HeatingSystem(ReasonableHeatingStrategy()))
    thermometer.messen()
}