package com.bancomaya.clientes;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.bancomaya.clientes.model.TarjetaDigital;

@WebService(endpointInterface = "com.bancomaya.clientes.TarjetaDigitalService")
public class TarjetaDigitalServiceImpl implements TarjetaDigitalService{
	
	
//	lista para simular una base de datos
	private static List<TarjetaDigital> tarjetas = new ArrayList<TarjetaDigital>();
	
	
	static {
		TarjetaDigital tarjeta = new TarjetaDigital();
		tarjeta.setId(1);
		tarjeta.setCliente("Murad Gustavo Elias");
		tarjeta.setBanco("maya");
		tarjeta.setNumero("545454-231-2123-321-123");
		tarjeta.setNumeroSeguridad("565556");
		tarjetas.add(tarjeta);
	}

	@Override
	public TarjetaDigital crearTarjetaDigital(TarjetaDigital tarjeta) {
		tarjeta.setId(tarjetas.size()+1);
		tarjetas.add(tarjeta);
		return tarjeta;
	}

	@Override
	public List<TarjetaDigital> obtenerTarjetasDigitales() {

		return tarjetas;
	}

	@Override
	public TarjetaDigital obtenerTarjetaNumero(String numeroTarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TarjetaDigital obtenerTarjetaNombreCliente(String nombreliente) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
