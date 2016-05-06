package edu.hm.cs.vadere.seating.datacollection.model;

public class Seat {
    private int id;
    private SeatTaker seatTaker;

    public Seat(int id) {
        this.id = id;
    }

    public SeatTaker getSeatTaker() {
        return seatTaker;
    }

    public void setSeatTaker(SeatTaker seatTaker) {
        this.seatTaker = seatTaker;
    }
}
