// Donark Patel
// CSC 162-C1
// Date 5/18/2018
// Lab 2B
// FreezeBoil Class
public class FreezeBoil {
    private int temperature;
    private boolean result;

    public FreezeBoil()
    {
        temperature = 0;
    }

    public FreezeBoil(int userTemperature)
    {
        temperature = userTemperature;
    }

    public void setTemperature(int userTemperature)
    {
        temperature = userTemperature;
    }

    public int getTemperature()
    {
        return temperature;
    }
    public boolean isEthylFreezing()
    {
        if (temperature <= -173)
            result = true;
        else result = false;
        return result;
    }
    public boolean isEthylBoiling()
    {
        if (temperature >= 172)
            result = true;
        else result = false;
        return result;
    }
    public boolean isOxygenFreezing()
    {
        if (temperature <= -362)
            result = true;
        else result = false;
        return result;
    }
    public boolean isOxygenBoiling()
    {
        if (temperature >= -306)
            result = true;
        else result = false;
        return result;
    }
    public boolean isWaterFreezing()
    {
        if (temperature <= 32)
            result = true;
        else result = false;
        return result;
    }
    public boolean isWaterBoiling()
    {
        if (temperature >= 212)
            result = true;
        else result = false;
        return result;
    }
}
