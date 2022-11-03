package org.springframework.samples.petclinic.recoveryroom;

import java.text.ParseException;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class RecoveryRoomTypeFormatter implements Formatter<RecoveryRoomType>{

    private RecoveryRoomService serve;
	
	@Autowired
	public RecoveryRoomTypeFormatter(RecoveryRoomService recoveryRoomService) {
		this.serve=recoveryRoomService;
	}

    @Override
    public String print(RecoveryRoomType object, Locale locale) {
        return object.getName();
    }

    @Override
    public RecoveryRoomType parse(String text, Locale locale) throws ParseException {
        List<RecoveryRoomType> recoveryRoomType=serve.getAllRecoveryRoomTypes();
    	for (RecoveryRoomType r:recoveryRoomType) {
			if (r.getName().equals(text)) {
				return r;
			}
		} throw new ParseException("RecoveryRoomType not found"+ text, 0);
    }
    
}
