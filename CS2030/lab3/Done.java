class Done extends Event {
    //private final Customer c1;
    //private final Server s1;

    Done(Customer customer, Server server, double time, int order) {
        super(customer, server, time, order);
    }

    @Override
    public Event nextEvent() {
        return this;
    }

    @Override
    public String toString() {
        return this.getCust() + " done serving by " + this.getServer();
    }
}

