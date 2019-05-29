package cap6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URL;

public class GoogleMaps implements Mapa {

	@Override
	public String devolveMapa(String endereco) throws Exception {
		String mapa = null;
		try {
			URL url = new URL("https://www.google.com.br/maps/place/" + endereco);
			InputStream stream = url.openStream();

			mapa = Integer.toString(stream.read());

			System.out.println(mapa);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mapa;

	}

}
