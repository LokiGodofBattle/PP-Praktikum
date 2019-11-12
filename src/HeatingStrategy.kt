abstract class HeatingStrategy{
    abstract fun needsHeating(last10measurements : List<Float>) : Boolean
}