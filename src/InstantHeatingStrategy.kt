class InstantHeatingStrategy : HeatingStrategy(){
    override fun needsHeating(last10measurements: List<Float>): Boolean {
        return last10measurements[last10measurements.size-1] < 19f
    }
}