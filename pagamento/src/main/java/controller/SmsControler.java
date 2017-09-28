package controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Sms;
import repository.SmsRepository;
@Controller
@RequestMapping("/")
public class SmsControler {
	
	
	private SmsRepository smsRepository;
	
	@Autowired
	public SmsControler(SmsRepository smsRepository){
		this.smsRepository = smsRepository;
	}
	
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public void save(Sms sms){
		smsRepository.save(sms);
	}

}
