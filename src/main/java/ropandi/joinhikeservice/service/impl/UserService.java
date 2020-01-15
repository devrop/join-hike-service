package ropandi.joinhikeservice.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ropandi.joinhikeservice.constant.DateConstant;
import ropandi.joinhikeservice.entity.MUser;
import ropandi.joinhikeservice.model.MailModel;
import ropandi.joinhikeservice.model.UserLogin;
import ropandi.joinhikeservice.repository.UserRepository;
import ropandi.joinhikeservice.service.IEmailService;
import ropandi.joinhikeservice.service.IUserService;
import ropandi.joinhikeservice.utility.DateUtility;
import ropandi.joinhikeservice.utility.StringUtility;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private IEmailService emailService;
	
	@Override
	public int signUp(UserLogin user) {
		// TODO Auto-generated method stub
		int result = 0;
		boolean exist = userRepository.findByEmail(user.getEmail()).isPresent();
		if(exist) {
			
			
		}else {
		   String activationKey = StringUtility.generatedRandomString(28);
		   String username = user.getEmail().substring(0, user.getEmail().indexOf("@"));
		   String id = username + StringUtility.generateUUID();
		   userRepository.save(
				   MUser.newUser(id,
						   user.getName(), 
						   user.getEmail(), 
						   user.getPassword(), 
						   DateUtility.getDateFromString(user.getBithdate(),DateConstant.FORMATDATE), 
						   user.getPhoneNumber(), 
						   0, 
						   activationKey, 
						   new Date(), 
						   "SYSTEM", 
						    new Date(), "SYSTEM").build()
				   );
		 //send email
			//MailModel mail = new MailModel();
			//mail.setMailTo(user.getEmail());
			//mail.setMailSubject("Testing");
			//mail.setMailContent("Test : " + activationKey);
			//mail.setMailFrom("joinhike.com");
			//emailService.sendingActivationLink(mail);
		}
		
		
		return 1;
	}

	@Override
	public int checkEmail(String email) {
		// TODO Auto-generated method stub
		Optional<MUser> findOne = userRepository.findByEmail(email);
		if (findOne.isPresent()) {
			return 1;
		}
		return 0;
	}

}
