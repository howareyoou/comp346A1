
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Wanting Huang 40272034
 * Zhensheng Lin 40254352
 * 
 * @author Kerly Titus
 */
public class Driver {

    /**
     * main class
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*******************************************************************************************************************************************
         * TODO : implement all the operations of main class *
         ******************************************************************************************************************************************/

        Network objNetwork = new Network("network"); /* Activate the network */

        objNetwork.start();
        Server objServer = new Server();
        /* Complete here the code for the main method ... */
        objServer.start();
        Client sendingObjClient = new Client("sending");
        Client receivingObjClient = new Client("receiving");
        sendingObjClient.start();
        receivingObjClient.start();

    }

}
