/**
 * Paket Setelah.
 */
package Setelah;

/**
 * Class Kereta2 mewakili penumpang dalam sistem.
 */
public class Kereta2 {
    private String name;

    /**
     * Konstruktor untuk membuat objek Kereta2.
     *
     * @param name Nama penumpang.
     */
    public Kereta2(String name) {
        this.name = name;
    }

    /**
     * Mengembalikan nama penumpang.
     *
     * @return Nama penumpang.
     */
    public String getName() {
        return name;
    }
}

/**
 * Class Train mewakili kereta dalam sistem.
 */
class Train {
    private String trainName;

    /**
     * Konstruktor untuk membuat objek Train.
     *
     * @param trainName Nama kereta.
     */
    public Train(String trainName) {
        this.trainName = trainName;
    }

    /**
     * Mengembalikan nama kereta.
     *
     * @return Nama kereta.
     */
    public String getTrainName() {
        return trainName;
    }
}

/**
 * Class Route mewakili rute perjalanan.
 */
class Route {
    private String departureStation;
    private String arrivalStation;

    /**
     * Konstruktor untuk membuat objek Route.
     *
     * @param departureStation Stasiun keberangkatan.
     * @param arrivalStation Stasiun kedatangan.
     */
    public Route(String departureStation, String arrivalStation) {
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
    }

    /**
     * Mengembalikan stasiun keberangkatan.
     *
     * @return Stasiun keberangkatan.
     */
    public String getDepartureStation() {
        return departureStation;
    }

    /**
     * Mengembalikan stasiun kedatangan.
     *
     * @return Stasiun kedatangan.
     */
    public String getArrivalStation() {
        return arrivalStation;
    }
}

/**
 * Class Ticket mewakili tiket perjalanan.
 */
class Ticket {
    private Kereta2 kereta2;
    private Train train;
    private Route route;
    private String departureTime;
    private double price;

    /**
     * Konstruktor untuk membuat objek Ticket.
     *
     * @param kereta2 Objek Kereta2 yang mewakili penumpang.
     * @param train Objek Train yang mewakili kereta.
     * @param route Objek Route yang mewakili rute perjalanan.
     * @param departureTime Waktu keberangkatan.
     * @param price Harga tiket.
     */
    public Ticket(Kereta2 kereta2, Train train, Route route, String departureTime, double price) {
        this.kereta2 = kereta2;
        this.train = train;
        this.route = route;
        this.departureTime = departureTime;
        this.price = price;
    }

    /**
     * Mencetak detail tiket.
     */
    public void printTicketDetails() {
        System.out.println("Passenger: " + kereta2.getName());
        System.out.println("Train: " + train.getTrainName());
        System.out.println("From: " + route.getDepartureStation() + " To: " + route.getArrivalStation());
        System.out.println("Departure: " + departureTime);
        System.out.println("Price: $" + price);
    }
}

/**
 * Class Main untuk menjalankan program utama.
 */
class Main {
    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args Argumen baris perintah.
     */
    public static void main(String[] args) {
        Kereta2 kereta2 = new Kereta2("Alice");
        Train train = new Train("Express 101");
        Route route = new Route("Jakarta", "Bandung");
        Ticket ticket = new Ticket(kereta2, train, route, "10:00 AM", 150000);

        ticket.printTicketDetails();
    }
}
