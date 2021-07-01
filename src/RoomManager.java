  
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RoomManager extends Remote {

	public double calculateReserve(double preco, int qtdDias, int type) throws RemoteException;

}