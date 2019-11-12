class ReasonableHeatingStrategy : HeatingStrategy(){
    override fun needsHeating(last10measurements: List<Float>): Boolean {
        var required = false
        var below19 = 0

        for(m in last10measurements){
            if(m < 15){
                required = true
                below19++
            } else if(m < 19){
                below19++
            }
        }
        return required || below19 >= 5
    }
}