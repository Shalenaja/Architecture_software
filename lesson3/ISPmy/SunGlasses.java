package ISPmy;

public class SunGlasses implements EyeDevice{    
        int glass;
        int darlings;
        public SunGlasses(int glass, int darlings){
            this.glass = glass;
            this.darlings = darlings;
        }
        @Override
        public double price() {
            return darlings * 1000;
        }
          
}

