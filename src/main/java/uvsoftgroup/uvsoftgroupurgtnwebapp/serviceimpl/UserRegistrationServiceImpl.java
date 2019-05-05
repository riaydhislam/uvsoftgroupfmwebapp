package uvsoftgroup.uvsoftgroupurgtnwebapp.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uvsoftgroup.uvsoftgroupurgtnwebapp.model.UserRegistration;
import uvsoftgroup.uvsoftgroupurgtnwebapp.repository.UserRegistrationRepository;
import uvsoftgroup.uvsoftgroupurgtnwebapp.service.UserRegistrationService;


@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {
@Autowired
private UserRegistrationRepository userRegistrationRepository;

/**
 * @throws Exception 
 * 
 */
public void saveUserRegistration(UserRegistration userRegistration) throws Exception{
	userRegistrationRepository.save(userRegistration);
}

/**
 * 
 */
public List<UserRegistration> findAllUserRegistration(){
	List<UserRegistration> listUR=(List<UserRegistration>) userRegistrationRepository.findAll();
	if(!listUR.isEmpty()){
		return listUR;		
	}
	else{
		return new ArrayList<UserRegistration>(listUR);
	}
}

/**
 * 
 */
public UserRegistration findUserRegistration(Long urId){
	UserRegistration userRegistration=userRegistrationRepository.findOne(urId);
	if(userRegistration!=null){
		return userRegistration;		
	}
	else{
		return new UserRegistration();
	}
}


/**
 * 
 */
public UserRegistration deleteUserRegistration(Long urId){
	UserRegistration userRegistration=userRegistrationRepository.findOne(urId);
	
	if(userRegistration!=null && userRegistration.getUserRegistrationId()!=null){
		userRegistrationRepository.delete(userRegistration.getUserRegistrationId());
		return userRegistration;
	}
	else{
		return new UserRegistration();
	}
}

/**
 * 
 */
public void updateUserRegistration(Long urId, UserRegistration userRegistration){
	UserRegistration userRegistrationExisting=userRegistrationRepository.findOne(urId);
	
	if(userRegistrationExisting!=null && userRegistrationExisting.getUserRegistrationId()!=null){
		userRegistrationRepository.save(userRegistration);
		
	}
	
}



}
