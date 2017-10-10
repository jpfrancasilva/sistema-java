package br.com.jp.hotel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormataData {
	public Date formatador(String dataSistema) {
		try {
			DateFormat formatador;
			Date data;

			formatador = new SimpleDateFormat("dd-MM-yyyy");
			data = (Date) formatador.parse(dataSistema);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(data);
			
			return data;
			
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
}
