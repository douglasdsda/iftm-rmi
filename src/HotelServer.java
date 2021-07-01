import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class HotelServer extends UnicastRemoteObject implements RoomManager {

	private static final long serialVersionUID = 1L;
      
      ArrayList<Integer> hotelArray = new ArrayList();
	protected HotelServer() throws RemoteException {
		
	}

	@Override
	public double calculateReserve(double price, int quantityDays, int type) {
		boolean hasType = false;
		for (Integer room : hotelArray) {
			if(room == type) hasType = true;
		}
		
		if(hasType) new Exception(); 
		
		hotelArray.add(type);
		
		System.out.println("\n Adicionado na lista:");
		System.out.printf("com tipo de:  %d",type);
		
		return price * quantityDays;
		
	}

	public static void main(String[] args) throws RemoteException, MalformedURLException {

		LocateRegistry.createRegistry(2800);
		HotelServer h = new HotelServer();
		Naming.rebind("//localhost:2800/room", h);
		System.out.println("\n O Servidor Hotel está on-line:\n");
		
		
		

	}

}