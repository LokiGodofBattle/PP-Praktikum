class SensibleHeatingStrategy : HeatingStrategy(){
    override fun needsHeating(last10measurements: List<Float>): Boolean {
        var required = false
        for(m in last10measurements){
            if(m < 20f) required = true
        }

        return required
    }
}