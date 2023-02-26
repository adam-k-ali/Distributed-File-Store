package com.adamkali.server;

public class DStore {
    private int port;
    private int cport;
    private long timeout;
    private String file_folder;

    /**
     * Create a new DStore
     * @param port The port to listen on
     * @param cport The port to connect to the controller on
     * @param timeout The timeout for the controller (in milliseconds)
     * @param file_folder The folder to store files in
     */
    private DStore(int port, int cport, long timeout, String file_folder) {
        this.port = port;
        this.cport = cport;
        this.timeout = timeout;
        this.file_folder = file_folder;
    }

    public static void main(String[] args) {
        if (args.length != 4) {
            throw new RuntimeException("Invalid number of arguments. Usage: DStore <port> <cport> <timeout> <file_folder>");
        }

        int port = Integer.parseInt(args[0]);
        int cport = Integer.parseInt(args[1]);
        long timeout = Long.parseLong(args[2]);
        String file_folder = args[3];

        DStore dstore = new DStore(port, cport, timeout, file_folder);
    }
}
