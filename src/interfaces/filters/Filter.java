package interfaces.filters;

import innerclasses.GreenhouseControls;

public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
