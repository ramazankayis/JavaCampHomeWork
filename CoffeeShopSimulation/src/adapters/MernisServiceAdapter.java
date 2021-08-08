package adapters;

import java.rmi.RemoteException;
import java.time.ZoneId;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService{

	KPSPublicSoap kpsPublicSoap= new KPSPublicSoap() {
		
		@Override
		public boolean TCKimlikNoDogrula(long TCKimlikNo, String ad, String soyad, int dogumYili) throws RemoteException {
			// TODO Auto-generated method stub
			return false;
		}
	};
	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		try {
			return kpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(),customer.getDataOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
