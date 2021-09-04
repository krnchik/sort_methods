package com.dataStructures.patterns.behavioral.state.easy;

public class Radio {

    private Station station;

    public void setStation(Station station) {
        this.station = station;
    }

    public void changeStation() {
        if (this.station instanceof Radio7) {
            setStation(new ComedyFM());
        } else if (this.station instanceof ComedyFM) {
            setStation(new VestyFM());
        } else if (this.station instanceof VestyFM) {
            setStation(new Radio7());
        }
    }

    public void play() {
        station.play();
    }
}
