package model

class Camera {
    private var isOn: Boolean = false
    private var resolution: Int = 640
//    private var flash: Boolean = false
    private var mode: String = "night"
    private var cameraModel: String = "Canon 808"

    fun setModel(mode: String){
        this.mode = mode
    }

    fun getModel():String{
        return this.cameraModel
    }

    fun setMode(mode: String) {
    this.mode = mode
    }
    fun getMode():String {
    return this.mode
    }

    fun setResolution(resolution: Int) {
        this.resolution = resolution
    }
    fun getResolution():Int {
    return this.resolution
    }

    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun getCameraStatus(): String {
        val message =
            return if (isOn) "camera is turned" else "camera is not turned"
    }

//    fun getFlash(): String {
//        val statusFlash=
//            return if (flash) "flash is turned " else "flash is not turned"
    }
    /*fun setCameraStatus(onoff: Boolean){
        isOn = onoff*/



