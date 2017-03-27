package com.mrpowergamerbr.temmiemercadopago.internal.removelater;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.mrpowergamerbr.temmiemercadopago.TemmieMercadoPago;

public class TemmieMPTest {
	public static void main(String[] args) {
		String clientId = null;
		String clientToken = null;
		try (BufferedReader br = new BufferedReader(new FileReader(new File("D:\\mp_api.txt")))) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				if (clientId == null) {
				clientId = sCurrentLine;
				} else if (clientToken == null) {
					clientToken = sCurrentLine;
				} else {
					break;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		
		TemmieMercadoPago temmie = new TemmieMercadoPago(clientId, clientToken);
		temmie.getAccessToken();
	}
}
