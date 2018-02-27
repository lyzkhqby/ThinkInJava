package interfaces.filters;

public class BandPass extends Filter {
    double lowCutOff, highCutOff;
    public BandPass(double lowCut, double highCut) {
        lowCutOff = lowCut;
        highCutOff = highCut;
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
