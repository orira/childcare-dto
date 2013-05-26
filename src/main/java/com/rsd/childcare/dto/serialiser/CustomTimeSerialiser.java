package com.rsd.childcare.dto.serialiser;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

public class CustomTimeSerialiser extends JsonSerializer<Date>{

	private SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

	@Override
	public void serialize(Date date, JsonGenerator generator, SerializerProvider provider) throws IOException, JsonProcessingException {
        String formattedDate = formatter.format(date);
        generator.writeString(formattedDate);        
	}
}
