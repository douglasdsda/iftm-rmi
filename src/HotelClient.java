import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class HotelClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		RoomManager roomManager;
		Scanner scanner = new Scanner(System.in);

		Room room0 = new Room(0, "v", 10, 55.0);
		Room room1 = new Room(1, "w", 20, 75.0);
		Room room2 = new Room(2, "x", 5, 80.0);
		Room room3 = new Room(3, "y", 3, 150.0);
		Room room4 = new Room(4, "z", 2, 230.0);

		while (true) {
			System.out.println("Hotel o quarto reservas");
			System.out.println("---------------------------------------------------");
			System.out.println(room0);
			System.out.println(room1);
			System.out.println(room2);
			System.out.println(room3);
			System.out.println(room4);
			System.out.println("-----------------------------------------------------");

			int type;
			do {
				System.out.println("Qual o tipo do quarto:");
				type = scanner.nextInt();
			} while (type < 0 || type > 4);

			int quantityDays;
			do {
				System.out.println("Qual a quantidade de dias: ");
				quantityDays = scanner.nextInt();
			} while (quantityDays <= 0);

			double result;
			roomManager = (RoomManager) Naming.lookup("rmi://localhost:2800/room");

			switch (type) {
			case 0: {
				result = roomManager.calculateReserve(room0.getprice(), quantityDays, type);
	
				System.out.println("\n O Valor para pagar: " + result + "\n\n");
				break;
			}
			case 1: {
				result = roomManager.calculateReserve(room1.getprice(), quantityDays, type);
	
				System.out.println("\n O Valor para pagar: " + result + "\n\n");
				break;
			}
			case 2: {
				result = roomManager.calculateReserve(room2.getprice(), quantityDays, type);
		
				System.out.println("\n O Valor para pagar: " + result + "\n\n");
				break;
			}
			case 3: {
				result = roomManager.calculateReserve(room3.getprice(), quantityDays, type);
	
				System.out.println("\n O Valor para pagar: " + result + "\n\n");
				break;
			}
			case 4: {
				result = roomManager.calculateReserve(room4.getprice(), quantityDays, type);
		
				System.out.println("\n O Valor para pagar: " + result + "\n\n");
				break;
			}
			default:
				throw new IllegalArgumentException("esse tipo não tem mais reserva: " + type);
			}

		}
	}

}