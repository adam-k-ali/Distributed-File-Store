package com.adamkali.server;

public class Controller {
    private int cport;
    private int R;
    private long timeout;
    private long rebalance_period;

    /**
     * Create a new controller
     * @param cport The port to listen on
     * @param R The number of replicas
     * @param timeout The timeout for the controller (in milliseconds)
     * @param rebalance_period The period for rebalancing (in milliseconds)
     */
    private Controller(int cport, int R, long timeout, long rebalance_period) {
        this.cport = cport;
        this.R = R;
        this.timeout = timeout;
        this.rebalance_period = rebalance_period;
    }

    public static void main(String[] args) {
        if (args.length != 4) {
            throw new RuntimeException("Invalid number of arguments. Usage: Controller <cport> <R> <timeout> <rebalance_period>");
        }

        int cport = Integer.parseInt(args[0]);
        int R = Integer.parseInt(args[1]);
        long timeout = Long.parseLong(args[2]);
        long rebalance_period = Long.parseLong(args[3]);

        Controller controller = new Controller(cport, R, timeout, rebalance_period);
//        controller.run();
    }
}
