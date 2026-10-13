package pertemuan02;

public class KonversiSuhu {
    double C, F, R;

    public double celciusToFahrenheit() {
        return (C * 9/5) + 32;
    }
    
    public double fahrenheitToCelcius() {
        return (F - 32) * 5/9;
    }
    
    public double celciusToReamur() {
        return C * 4/5;
    }
    
    public double reamurToCelcius() {
        return R * 5/4;
    }
    
    public double fahrenheitToReamur() {
        return (F - 32) * 4/9; 
   }
    
    public double reamurToFahrenheit() {
        return (R * 9/4) + 32;
    }
}